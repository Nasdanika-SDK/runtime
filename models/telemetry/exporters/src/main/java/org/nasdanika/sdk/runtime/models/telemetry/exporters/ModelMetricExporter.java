package org.nasdanika.sdk.runtime.models.telemetry.exporters;

import java.util.Collection;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

import org.eclipse.emf.ecore.resource.Resource;
import org.nasdanika.sdk.runtime.models.telemetry.metrics.MetricsData;
import org.nasdanika.sdk.runtime.models.telemetry.metrics.MetricsFactory;
import org.nasdanika.sdk.runtime.models.telemetry.metrics.ResourceMetrics;
import org.nasdanika.sdk.runtime.models.telemetry.metrics.ScopeMetrics;

import io.opentelemetry.sdk.common.CompletableResultCode;
import io.opentelemetry.sdk.common.InstrumentationScopeInfo;
import io.opentelemetry.sdk.metrics.InstrumentType;
import io.opentelemetry.sdk.metrics.data.AggregationTemporality;
import io.opentelemetry.sdk.metrics.data.MetricData;
import io.opentelemetry.sdk.metrics.export.AggregationTemporalitySelector;
import io.opentelemetry.sdk.metrics.export.MetricExporter;

/**
 * Exports metrics to {@link MetricsData}, to a consumer or to an EMF resource saved on flush and
 * shutdown. See {@link AbstractModelExporter} for the two modes.
 *
 * <p>
 * Each export is a collection: with a periodic reader and an EMF resource, the resource
 * accumulates a metric per collection - a time series of cumulative points by default.
 */
public class ModelMetricExporter extends AbstractModelExporter<MetricData, MetricsData, ResourceMetrics, ScopeMetrics> implements MetricExporter {

	private final AggregationTemporalitySelector aggregationTemporalitySelector;

	/**
	 * @param consumer Receives a {@link MetricsData} per export, with cumulative temporality
	 */
	public ModelMetricExporter(Consumer<? super MetricsData> consumer) {
		this(consumer, AggregationTemporalitySelector.alwaysCumulative());
	}

	public ModelMetricExporter(Consumer<? super MetricsData> consumer, AggregationTemporalitySelector aggregationTemporalitySelector) {
		super(null, consumer);
		this.aggregationTemporalitySelector = Objects.requireNonNull(aggregationTemporalitySelector, "aggregationTemporalitySelector");
	}

	/**
	 * @param resource Metrics are added to its {@link MetricsData} root, with cumulative temporality
	 */
	public ModelMetricExporter(Resource resource) {
		this(resource, null, AggregationTemporalitySelector.alwaysCumulative());
	}

	public ModelMetricExporter(Resource resource, Map<?, ?> saveOptions, AggregationTemporalitySelector aggregationTemporalitySelector) {
		super(null, resource, saveOptions);
		this.aggregationTemporalitySelector = Objects.requireNonNull(aggregationTemporalitySelector, "aggregationTemporalitySelector");
	}

	@Override
	public AggregationTemporality getAggregationTemporality(InstrumentType instrumentType) {
		return aggregationTemporalitySelector.getAggregationTemporality(instrumentType);
	}

	@Override
	public CompletableResultCode export(Collection<MetricData> metrics) {
		return doExport(metrics);
	}

	@Override
	protected Class<MetricsData> getDataType() {
		return MetricsData.class;
	}

	@Override
	protected MetricsData createData() {
		return MetricsFactory.eINSTANCE.createMetricsData();
	}

	@Override
	protected ResourceMetrics createResourceGroup(MetricsData data, io.opentelemetry.sdk.resources.Resource resource) {
		ResourceMetrics ret = MetricsFactory.eINSTANCE.createResourceMetrics();
		ret.setResource(TelemetryConverter.resource(resource));
		ret.setSchemaUrl(resource.getSchemaUrl());
		data.getResourceMetrics().add(ret);
		return ret;
	}

	@Override
	protected ScopeMetrics createScopeGroup(ResourceMetrics resourceGroup, InstrumentationScopeInfo scope) {
		ScopeMetrics ret = MetricsFactory.eINSTANCE.createScopeMetrics();
		ret.setScope(TelemetryConverter.scope(scope));
		ret.setSchemaUrl(scope.getSchemaUrl());
		resourceGroup.getScopeMetrics().add(ret);
		return ret;
	}

	@Override
	protected io.opentelemetry.sdk.resources.Resource getResource(MetricData item) {
		return item.getResource();
	}

	@Override
	protected InstrumentationScopeInfo getScope(MetricData item) {
		return item.getInstrumentationScopeInfo();
	}

	@Override
	protected void add(ScopeMetrics scopeGroup, MetricData item) {
		scopeGroup.getMetrics().add(TelemetryConverter.metric(item));
	}

	@Override
	public String toString() {
		return "ModelMetricExporter{aggregationTemporalitySelector=" + AggregationTemporalitySelector.asString(aggregationTemporalitySelector) + "}";
	}

}
