/**
 */
package org.nasdanika.sdk.runtime.models.react.flow.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.nasdanika.sdk.runtime.models.core.CorePackage;

import org.nasdanika.sdk.runtime.models.html.HtmlPackage;

import org.nasdanika.sdk.runtime.models.react.ReactPackage;

import org.nasdanika.sdk.runtime.models.react.flow.Align;
import org.nasdanika.sdk.runtime.models.react.flow.Background;
import org.nasdanika.sdk.runtime.models.react.flow.BackgroundVariant;
import org.nasdanika.sdk.runtime.models.react.flow.ColorMode;
import org.nasdanika.sdk.runtime.models.react.flow.ConnectionLineType;
import org.nasdanika.sdk.runtime.models.react.flow.Controls;
import org.nasdanika.sdk.runtime.models.react.flow.DataValue;
import org.nasdanika.sdk.runtime.models.react.flow.EdgeMarker;
import org.nasdanika.sdk.runtime.models.react.flow.EdgeOptions;
import org.nasdanika.sdk.runtime.models.react.flow.EdgeType;
import org.nasdanika.sdk.runtime.models.react.flow.EdgesState;
import org.nasdanika.sdk.runtime.models.react.flow.FlowComponent;
import org.nasdanika.sdk.runtime.models.react.flow.FlowData;
import org.nasdanika.sdk.runtime.models.react.flow.FlowEdge;
import org.nasdanika.sdk.runtime.models.react.flow.FlowFactory;
import org.nasdanika.sdk.runtime.models.react.flow.FlowHook;
import org.nasdanika.sdk.runtime.models.react.flow.FlowNode;
import org.nasdanika.sdk.runtime.models.react.flow.FlowPackage;
import org.nasdanika.sdk.runtime.models.react.flow.FlowType;
import org.nasdanika.sdk.runtime.models.react.flow.FlowTypes;
import org.nasdanika.sdk.runtime.models.react.flow.Handle;
import org.nasdanika.sdk.runtime.models.react.flow.HandlePosition;
import org.nasdanika.sdk.runtime.models.react.flow.HandleType;
import org.nasdanika.sdk.runtime.models.react.flow.MarkerKind;
import org.nasdanika.sdk.runtime.models.react.flow.MiniMap;
import org.nasdanika.sdk.runtime.models.react.flow.NodeResizer;
import org.nasdanika.sdk.runtime.models.react.flow.NodeToolbar;
import org.nasdanika.sdk.runtime.models.react.flow.NodeType;
import org.nasdanika.sdk.runtime.models.react.flow.NodesState;
import org.nasdanika.sdk.runtime.models.react.flow.Orientation;
import org.nasdanika.sdk.runtime.models.react.flow.Panel;
import org.nasdanika.sdk.runtime.models.react.flow.PanelPosition;
import org.nasdanika.sdk.runtime.models.react.flow.ProOptions;
import org.nasdanika.sdk.runtime.models.react.flow.ReactFlow;
import org.nasdanika.sdk.runtime.models.react.flow.ReactFlowInstance;
import org.nasdanika.sdk.runtime.models.react.flow.ReactFlowProvider;
import org.nasdanika.sdk.runtime.models.react.flow.XYPosition;

import org.nasdanika.sdk.runtime.models.typescript.TypescriptPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class FlowPackageImpl extends EPackageImpl implements FlowPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xyPositionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass flowDataEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass flowNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass edgeMarkerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass flowEdgeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass edgeOptionsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass proOptionsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass flowTypesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass flowTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass flowComponentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass reactFlowProviderEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass reactFlowEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass backgroundEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass controlsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass miniMapEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass panelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass handleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nodeToolbarEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nodeResizerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass flowHookEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nodesStateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass edgesStateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass reactFlowInstanceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum handlePositionEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum markerKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum connectionLineTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum backgroundVariantEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum edgeTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum nodeTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum colorModeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum panelPositionEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum orientationEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum handleTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum alignEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.nasdanika.sdk.runtime.models.react.flow.FlowPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private FlowPackageImpl() {
		super(eNS_URI, FlowFactory.eINSTANCE);
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link FlowPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static FlowPackage init() {
		if (isInited) return (FlowPackage)EPackage.Registry.INSTANCE.getEPackage(FlowPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredFlowPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		FlowPackageImpl theFlowPackage = registeredFlowPackage instanceof FlowPackageImpl ? (FlowPackageImpl)registeredFlowPackage : new FlowPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		EcorePackage.eINSTANCE.eClass();
		ReactPackage.eINSTANCE.eClass();
		TypescriptPackage.eINSTANCE.eClass();
		CorePackage.eINSTANCE.eClass();
		HtmlPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theFlowPackage.createPackageContents();

		// Initialize created meta-data
		theFlowPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theFlowPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(FlowPackage.eNS_URI, theFlowPackage);
		return theFlowPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getXYPosition() {
		return xyPositionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getXYPosition_X() {
		return (EAttribute)xyPositionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getXYPosition_Y() {
		return (EAttribute)xyPositionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFlowData() {
		return flowDataEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFlowData_Label() {
		return (EAttribute)flowDataEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFlowData_LabelNode() {
		return (EReference)flowDataEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFlowData_Values() {
		return (EReference)flowDataEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataValue() {
		return dataValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataValue_Name() {
		return (EAttribute)dataValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataValue_Value() {
		return (EAttribute)dataValueEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataValue_Expression() {
		return (EReference)dataValueEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFlowNode() {
		return flowNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFlowNode_Id() {
		return (EAttribute)flowNodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFlowNode_CustomType() {
		return (EAttribute)flowNodeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFlowNode_NodeType() {
		return (EAttribute)flowNodeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFlowNode_Position() {
		return (EReference)flowNodeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFlowNode_Data() {
		return (EReference)flowNodeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFlowNode_SourcePosition() {
		return (EAttribute)flowNodeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFlowNode_TargetPosition() {
		return (EAttribute)flowNodeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFlowNode_Hidden() {
		return (EAttribute)flowNodeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFlowNode_Draggable() {
		return (EAttribute)flowNodeEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFlowNode_Selectable() {
		return (EAttribute)flowNodeEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFlowNode_Connectable() {
		return (EAttribute)flowNodeEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFlowNode_Deletable() {
		return (EAttribute)flowNodeEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFlowNode_Parent() {
		return (EReference)flowNodeEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFlowNode_Extent() {
		return (EAttribute)flowNodeEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFlowNode_Width() {
		return (EAttribute)flowNodeEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFlowNode_Height() {
		return (EAttribute)flowNodeEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFlowNode_ZIndex() {
		return (EAttribute)flowNodeEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFlowNode_ClassName() {
		return (EAttribute)flowNodeEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFlowNode_Style() {
		return (EReference)flowNodeEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEdgeMarker() {
		return edgeMarkerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEdgeMarker_Type() {
		return (EAttribute)edgeMarkerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEdgeMarker_Color() {
		return (EAttribute)edgeMarkerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEdgeMarker_Width() {
		return (EAttribute)edgeMarkerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEdgeMarker_Height() {
		return (EAttribute)edgeMarkerEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEdgeMarker_StrokeWidth() {
		return (EAttribute)edgeMarkerEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFlowEdge() {
		return flowEdgeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFlowEdge_Id() {
		return (EAttribute)flowEdgeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFlowEdge_Source() {
		return (EReference)flowEdgeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFlowEdge_Target() {
		return (EReference)flowEdgeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFlowEdge_SourceHandle() {
		return (EAttribute)flowEdgeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFlowEdge_TargetHandle() {
		return (EAttribute)flowEdgeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFlowEdge_EdgeType() {
		return (EAttribute)flowEdgeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFlowEdge_CustomType() {
		return (EAttribute)flowEdgeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFlowEdge_Label() {
		return (EAttribute)flowEdgeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFlowEdge_LabelNode() {
		return (EReference)flowEdgeEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFlowEdge_Animated() {
		return (EAttribute)flowEdgeEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFlowEdge_Hidden() {
		return (EAttribute)flowEdgeEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFlowEdge_Deletable() {
		return (EAttribute)flowEdgeEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFlowEdge_Selectable() {
		return (EAttribute)flowEdgeEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFlowEdge_Reconnectable() {
		return (EAttribute)flowEdgeEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFlowEdge_MarkerStart() {
		return (EReference)flowEdgeEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFlowEdge_MarkerEnd() {
		return (EReference)flowEdgeEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFlowEdge_Data() {
		return (EReference)flowEdgeEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFlowEdge_ZIndex() {
		return (EAttribute)flowEdgeEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFlowEdge_ClassName() {
		return (EAttribute)flowEdgeEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFlowEdge_Style() {
		return (EReference)flowEdgeEClass.getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEdgeOptions() {
		return edgeOptionsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEdgeOptions_EdgeType() {
		return (EAttribute)edgeOptionsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEdgeOptions_CustomType() {
		return (EAttribute)edgeOptionsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEdgeOptions_Animated() {
		return (EAttribute)edgeOptionsEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEdgeOptions_MarkerEnd() {
		return (EReference)edgeOptionsEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEdgeOptions_Style() {
		return (EReference)edgeOptionsEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProOptions() {
		return proOptionsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProOptions_HideAttribution() {
		return (EAttribute)proOptionsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFlowTypes() {
		return flowTypesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFlowTypes_Types() {
		return (EReference)flowTypesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFlowType() {
		return flowTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFlowType_Name() {
		return (EAttribute)flowTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFlowType_Component() {
		return (EReference)flowTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFlowComponent() {
		return flowComponentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReactFlowProvider() {
		return reactFlowProviderEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReactFlow() {
		return reactFlowEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReactFlow_Nodes() {
		return (EReference)reactFlowEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReactFlow_Edges() {
		return (EReference)reactFlowEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReactFlow_NodeTypes() {
		return (EReference)reactFlowEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReactFlow_EdgeTypes() {
		return (EReference)reactFlowEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReactFlow_FitView() {
		return (EAttribute)reactFlowEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReactFlow_MinZoom() {
		return (EAttribute)reactFlowEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReactFlow_MaxZoom() {
		return (EAttribute)reactFlowEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReactFlow_NodesDraggable() {
		return (EAttribute)reactFlowEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReactFlow_NodesConnectable() {
		return (EAttribute)reactFlowEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReactFlow_ElementsSelectable() {
		return (EAttribute)reactFlowEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReactFlow_PanOnDrag() {
		return (EAttribute)reactFlowEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReactFlow_ZoomOnScroll() {
		return (EAttribute)reactFlowEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReactFlow_ZoomOnDoubleClick() {
		return (EAttribute)reactFlowEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReactFlow_SnapToGrid() {
		return (EAttribute)reactFlowEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReactFlow_SnapGrid() {
		return (EAttribute)reactFlowEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReactFlow_ColorMode() {
		return (EAttribute)reactFlowEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReactFlow_DeleteKeyCode() {
		return (EAttribute)reactFlowEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReactFlow_ConnectionLineType() {
		return (EAttribute)reactFlowEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReactFlow_DefaultEdgeOptions() {
		return (EReference)reactFlowEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReactFlow_ProOptions() {
		return (EReference)reactFlowEClass.getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReactFlow_Background() {
		return (EReference)reactFlowEClass.getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReactFlow_Controls() {
		return (EReference)reactFlowEClass.getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReactFlow_MiniMap() {
		return (EReference)reactFlowEClass.getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReactFlow_Panels() {
		return (EReference)reactFlowEClass.getEStructuralFeatures().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBackground() {
		return backgroundEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBackground_Variant() {
		return (EAttribute)backgroundEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBackground_Gap() {
		return (EAttribute)backgroundEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBackground_Size() {
		return (EAttribute)backgroundEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBackground_LineWidth() {
		return (EAttribute)backgroundEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBackground_Color() {
		return (EAttribute)backgroundEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBackground_BgColor() {
		return (EAttribute)backgroundEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBackground_BackgroundId() {
		return (EAttribute)backgroundEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getControls() {
		return controlsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getControls_ShowZoom() {
		return (EAttribute)controlsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getControls_ShowFitView() {
		return (EAttribute)controlsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getControls_ShowInteractive() {
		return (EAttribute)controlsEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getControls_Position() {
		return (EAttribute)controlsEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getControls_Orientation() {
		return (EAttribute)controlsEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMiniMap() {
		return miniMapEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMiniMap_Position() {
		return (EAttribute)miniMapEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMiniMap_NodeColor() {
		return (EAttribute)miniMapEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMiniMap_NodeStrokeColor() {
		return (EAttribute)miniMapEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMiniMap_MaskColor() {
		return (EAttribute)miniMapEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMiniMap_BgColor() {
		return (EAttribute)miniMapEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMiniMap_Pannable() {
		return (EAttribute)miniMapEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMiniMap_Zoomable() {
		return (EAttribute)miniMapEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMiniMap_AriaLabel() {
		return (EAttribute)miniMapEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPanel() {
		return panelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPanel_Position() {
		return (EAttribute)panelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHandle() {
		return handleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHandle_HandleType() {
		return (EAttribute)handleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHandle_Position() {
		return (EAttribute)handleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHandle_HandleId() {
		return (EAttribute)handleEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHandle_IsConnectable() {
		return (EAttribute)handleEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNodeToolbar() {
		return nodeToolbarEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNodeToolbar_Position() {
		return (EAttribute)nodeToolbarEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNodeToolbar_IsVisible() {
		return (EAttribute)nodeToolbarEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNodeToolbar_Offset() {
		return (EAttribute)nodeToolbarEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNodeToolbar_Align() {
		return (EAttribute)nodeToolbarEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNodeResizer() {
		return nodeResizerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNodeResizer_MinWidth() {
		return (EAttribute)nodeResizerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNodeResizer_MinHeight() {
		return (EAttribute)nodeResizerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNodeResizer_IsVisible() {
		return (EAttribute)nodeResizerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNodeResizer_KeepAspectRatio() {
		return (EAttribute)nodeResizerEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNodeResizer_Color() {
		return (EAttribute)nodeResizerEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFlowHook() {
		return flowHookEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNodesState() {
		return nodesStateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNodesState_InitialNodes() {
		return (EReference)nodesStateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEdgesState() {
		return edgesStateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEdgesState_InitialEdges() {
		return (EReference)edgesStateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReactFlowInstance() {
		return reactFlowInstanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getHandlePosition() {
		return handlePositionEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getMarkerKind() {
		return markerKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getConnectionLineType() {
		return connectionLineTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getBackgroundVariant() {
		return backgroundVariantEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getEdgeType() {
		return edgeTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getNodeType() {
		return nodeTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getColorMode() {
		return colorModeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getPanelPosition() {
		return panelPositionEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getOrientation() {
		return orientationEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getHandleType() {
		return handleTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getAlign() {
		return alignEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FlowFactory getFlowFactory() {
		return (FlowFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		xyPositionEClass = createEClass(XY_POSITION);
		createEAttribute(xyPositionEClass, XY_POSITION__X);
		createEAttribute(xyPositionEClass, XY_POSITION__Y);

		flowDataEClass = createEClass(FLOW_DATA);
		createEAttribute(flowDataEClass, FLOW_DATA__LABEL);
		createEReference(flowDataEClass, FLOW_DATA__LABEL_NODE);
		createEReference(flowDataEClass, FLOW_DATA__VALUES);

		dataValueEClass = createEClass(DATA_VALUE);
		createEAttribute(dataValueEClass, DATA_VALUE__NAME);
		createEAttribute(dataValueEClass, DATA_VALUE__VALUE);
		createEReference(dataValueEClass, DATA_VALUE__EXPRESSION);

		flowNodeEClass = createEClass(FLOW_NODE);
		createEAttribute(flowNodeEClass, FLOW_NODE__ID);
		createEAttribute(flowNodeEClass, FLOW_NODE__CUSTOM_TYPE);
		createEAttribute(flowNodeEClass, FLOW_NODE__NODE_TYPE);
		createEReference(flowNodeEClass, FLOW_NODE__POSITION);
		createEReference(flowNodeEClass, FLOW_NODE__DATA);
		createEAttribute(flowNodeEClass, FLOW_NODE__SOURCE_POSITION);
		createEAttribute(flowNodeEClass, FLOW_NODE__TARGET_POSITION);
		createEAttribute(flowNodeEClass, FLOW_NODE__HIDDEN);
		createEAttribute(flowNodeEClass, FLOW_NODE__DRAGGABLE);
		createEAttribute(flowNodeEClass, FLOW_NODE__SELECTABLE);
		createEAttribute(flowNodeEClass, FLOW_NODE__CONNECTABLE);
		createEAttribute(flowNodeEClass, FLOW_NODE__DELETABLE);
		createEReference(flowNodeEClass, FLOW_NODE__PARENT);
		createEAttribute(flowNodeEClass, FLOW_NODE__EXTENT);
		createEAttribute(flowNodeEClass, FLOW_NODE__WIDTH);
		createEAttribute(flowNodeEClass, FLOW_NODE__HEIGHT);
		createEAttribute(flowNodeEClass, FLOW_NODE__ZINDEX);
		createEAttribute(flowNodeEClass, FLOW_NODE__CLASS_NAME);
		createEReference(flowNodeEClass, FLOW_NODE__STYLE);

		edgeMarkerEClass = createEClass(EDGE_MARKER);
		createEAttribute(edgeMarkerEClass, EDGE_MARKER__TYPE);
		createEAttribute(edgeMarkerEClass, EDGE_MARKER__COLOR);
		createEAttribute(edgeMarkerEClass, EDGE_MARKER__WIDTH);
		createEAttribute(edgeMarkerEClass, EDGE_MARKER__HEIGHT);
		createEAttribute(edgeMarkerEClass, EDGE_MARKER__STROKE_WIDTH);

		flowEdgeEClass = createEClass(FLOW_EDGE);
		createEAttribute(flowEdgeEClass, FLOW_EDGE__ID);
		createEReference(flowEdgeEClass, FLOW_EDGE__SOURCE);
		createEReference(flowEdgeEClass, FLOW_EDGE__TARGET);
		createEAttribute(flowEdgeEClass, FLOW_EDGE__SOURCE_HANDLE);
		createEAttribute(flowEdgeEClass, FLOW_EDGE__TARGET_HANDLE);
		createEAttribute(flowEdgeEClass, FLOW_EDGE__EDGE_TYPE);
		createEAttribute(flowEdgeEClass, FLOW_EDGE__CUSTOM_TYPE);
		createEAttribute(flowEdgeEClass, FLOW_EDGE__LABEL);
		createEReference(flowEdgeEClass, FLOW_EDGE__LABEL_NODE);
		createEAttribute(flowEdgeEClass, FLOW_EDGE__ANIMATED);
		createEAttribute(flowEdgeEClass, FLOW_EDGE__HIDDEN);
		createEAttribute(flowEdgeEClass, FLOW_EDGE__DELETABLE);
		createEAttribute(flowEdgeEClass, FLOW_EDGE__SELECTABLE);
		createEAttribute(flowEdgeEClass, FLOW_EDGE__RECONNECTABLE);
		createEReference(flowEdgeEClass, FLOW_EDGE__MARKER_START);
		createEReference(flowEdgeEClass, FLOW_EDGE__MARKER_END);
		createEReference(flowEdgeEClass, FLOW_EDGE__DATA);
		createEAttribute(flowEdgeEClass, FLOW_EDGE__ZINDEX);
		createEAttribute(flowEdgeEClass, FLOW_EDGE__CLASS_NAME);
		createEReference(flowEdgeEClass, FLOW_EDGE__STYLE);

		edgeOptionsEClass = createEClass(EDGE_OPTIONS);
		createEAttribute(edgeOptionsEClass, EDGE_OPTIONS__EDGE_TYPE);
		createEAttribute(edgeOptionsEClass, EDGE_OPTIONS__CUSTOM_TYPE);
		createEAttribute(edgeOptionsEClass, EDGE_OPTIONS__ANIMATED);
		createEReference(edgeOptionsEClass, EDGE_OPTIONS__MARKER_END);
		createEReference(edgeOptionsEClass, EDGE_OPTIONS__STYLE);

		proOptionsEClass = createEClass(PRO_OPTIONS);
		createEAttribute(proOptionsEClass, PRO_OPTIONS__HIDE_ATTRIBUTION);

		flowTypesEClass = createEClass(FLOW_TYPES);
		createEReference(flowTypesEClass, FLOW_TYPES__TYPES);

		flowTypeEClass = createEClass(FLOW_TYPE);
		createEAttribute(flowTypeEClass, FLOW_TYPE__NAME);
		createEReference(flowTypeEClass, FLOW_TYPE__COMPONENT);

		flowComponentEClass = createEClass(FLOW_COMPONENT);

		reactFlowProviderEClass = createEClass(REACT_FLOW_PROVIDER);

		reactFlowEClass = createEClass(REACT_FLOW);
		createEReference(reactFlowEClass, REACT_FLOW__NODES);
		createEReference(reactFlowEClass, REACT_FLOW__EDGES);
		createEReference(reactFlowEClass, REACT_FLOW__NODE_TYPES);
		createEReference(reactFlowEClass, REACT_FLOW__EDGE_TYPES);
		createEAttribute(reactFlowEClass, REACT_FLOW__FIT_VIEW);
		createEAttribute(reactFlowEClass, REACT_FLOW__MIN_ZOOM);
		createEAttribute(reactFlowEClass, REACT_FLOW__MAX_ZOOM);
		createEAttribute(reactFlowEClass, REACT_FLOW__NODES_DRAGGABLE);
		createEAttribute(reactFlowEClass, REACT_FLOW__NODES_CONNECTABLE);
		createEAttribute(reactFlowEClass, REACT_FLOW__ELEMENTS_SELECTABLE);
		createEAttribute(reactFlowEClass, REACT_FLOW__PAN_ON_DRAG);
		createEAttribute(reactFlowEClass, REACT_FLOW__ZOOM_ON_SCROLL);
		createEAttribute(reactFlowEClass, REACT_FLOW__ZOOM_ON_DOUBLE_CLICK);
		createEAttribute(reactFlowEClass, REACT_FLOW__SNAP_TO_GRID);
		createEAttribute(reactFlowEClass, REACT_FLOW__SNAP_GRID);
		createEAttribute(reactFlowEClass, REACT_FLOW__COLOR_MODE);
		createEAttribute(reactFlowEClass, REACT_FLOW__DELETE_KEY_CODE);
		createEAttribute(reactFlowEClass, REACT_FLOW__CONNECTION_LINE_TYPE);
		createEReference(reactFlowEClass, REACT_FLOW__DEFAULT_EDGE_OPTIONS);
		createEReference(reactFlowEClass, REACT_FLOW__PRO_OPTIONS);
		createEReference(reactFlowEClass, REACT_FLOW__BACKGROUND);
		createEReference(reactFlowEClass, REACT_FLOW__CONTROLS);
		createEReference(reactFlowEClass, REACT_FLOW__MINI_MAP);
		createEReference(reactFlowEClass, REACT_FLOW__PANELS);

		backgroundEClass = createEClass(BACKGROUND);
		createEAttribute(backgroundEClass, BACKGROUND__VARIANT);
		createEAttribute(backgroundEClass, BACKGROUND__GAP);
		createEAttribute(backgroundEClass, BACKGROUND__SIZE);
		createEAttribute(backgroundEClass, BACKGROUND__LINE_WIDTH);
		createEAttribute(backgroundEClass, BACKGROUND__COLOR);
		createEAttribute(backgroundEClass, BACKGROUND__BG_COLOR);
		createEAttribute(backgroundEClass, BACKGROUND__BACKGROUND_ID);

		controlsEClass = createEClass(CONTROLS);
		createEAttribute(controlsEClass, CONTROLS__SHOW_ZOOM);
		createEAttribute(controlsEClass, CONTROLS__SHOW_FIT_VIEW);
		createEAttribute(controlsEClass, CONTROLS__SHOW_INTERACTIVE);
		createEAttribute(controlsEClass, CONTROLS__POSITION);
		createEAttribute(controlsEClass, CONTROLS__ORIENTATION);

		miniMapEClass = createEClass(MINI_MAP);
		createEAttribute(miniMapEClass, MINI_MAP__POSITION);
		createEAttribute(miniMapEClass, MINI_MAP__NODE_COLOR);
		createEAttribute(miniMapEClass, MINI_MAP__NODE_STROKE_COLOR);
		createEAttribute(miniMapEClass, MINI_MAP__MASK_COLOR);
		createEAttribute(miniMapEClass, MINI_MAP__BG_COLOR);
		createEAttribute(miniMapEClass, MINI_MAP__PANNABLE);
		createEAttribute(miniMapEClass, MINI_MAP__ZOOMABLE);
		createEAttribute(miniMapEClass, MINI_MAP__ARIA_LABEL);

		panelEClass = createEClass(PANEL);
		createEAttribute(panelEClass, PANEL__POSITION);

		handleEClass = createEClass(HANDLE);
		createEAttribute(handleEClass, HANDLE__HANDLE_TYPE);
		createEAttribute(handleEClass, HANDLE__POSITION);
		createEAttribute(handleEClass, HANDLE__HANDLE_ID);
		createEAttribute(handleEClass, HANDLE__IS_CONNECTABLE);

		nodeToolbarEClass = createEClass(NODE_TOOLBAR);
		createEAttribute(nodeToolbarEClass, NODE_TOOLBAR__POSITION);
		createEAttribute(nodeToolbarEClass, NODE_TOOLBAR__IS_VISIBLE);
		createEAttribute(nodeToolbarEClass, NODE_TOOLBAR__OFFSET);
		createEAttribute(nodeToolbarEClass, NODE_TOOLBAR__ALIGN);

		nodeResizerEClass = createEClass(NODE_RESIZER);
		createEAttribute(nodeResizerEClass, NODE_RESIZER__MIN_WIDTH);
		createEAttribute(nodeResizerEClass, NODE_RESIZER__MIN_HEIGHT);
		createEAttribute(nodeResizerEClass, NODE_RESIZER__IS_VISIBLE);
		createEAttribute(nodeResizerEClass, NODE_RESIZER__KEEP_ASPECT_RATIO);
		createEAttribute(nodeResizerEClass, NODE_RESIZER__COLOR);

		flowHookEClass = createEClass(FLOW_HOOK);

		nodesStateEClass = createEClass(NODES_STATE);
		createEReference(nodesStateEClass, NODES_STATE__INITIAL_NODES);

		edgesStateEClass = createEClass(EDGES_STATE);
		createEReference(edgesStateEClass, EDGES_STATE__INITIAL_EDGES);

		reactFlowInstanceEClass = createEClass(REACT_FLOW_INSTANCE);

		// Create enums
		handlePositionEEnum = createEEnum(HANDLE_POSITION);
		markerKindEEnum = createEEnum(MARKER_KIND);
		connectionLineTypeEEnum = createEEnum(CONNECTION_LINE_TYPE);
		backgroundVariantEEnum = createEEnum(BACKGROUND_VARIANT);
		edgeTypeEEnum = createEEnum(EDGE_TYPE);
		nodeTypeEEnum = createEEnum(NODE_TYPE);
		colorModeEEnum = createEEnum(COLOR_MODE);
		panelPositionEEnum = createEEnum(PANEL_POSITION);
		orientationEEnum = createEEnum(ORIENTATION);
		handleTypeEEnum = createEEnum(HANDLE_TYPE);
		alignEEnum = createEEnum(ALIGN);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		EcorePackage theEcorePackage = (EcorePackage)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);
		ReactPackage theReactPackage = (ReactPackage)EPackage.Registry.INSTANCE.getEPackage(ReactPackage.eNS_URI);
		TypescriptPackage theTypescriptPackage = (TypescriptPackage)EPackage.Registry.INSTANCE.getEPackage(TypescriptPackage.eNS_URI);
		CorePackage theCorePackage = (CorePackage)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		flowComponentEClass.getESuperTypes().add(theReactPackage.getLibraryComponent());
		reactFlowProviderEClass.getESuperTypes().add(this.getFlowComponent());
		reactFlowEClass.getESuperTypes().add(this.getFlowComponent());
		backgroundEClass.getESuperTypes().add(this.getFlowComponent());
		controlsEClass.getESuperTypes().add(this.getFlowComponent());
		miniMapEClass.getESuperTypes().add(this.getFlowComponent());
		panelEClass.getESuperTypes().add(this.getFlowComponent());
		handleEClass.getESuperTypes().add(this.getFlowComponent());
		nodeToolbarEClass.getESuperTypes().add(this.getFlowComponent());
		nodeResizerEClass.getESuperTypes().add(this.getFlowComponent());
		flowHookEClass.getESuperTypes().add(theReactPackage.getLibraryHook());
		nodesStateEClass.getESuperTypes().add(this.getFlowHook());
		edgesStateEClass.getESuperTypes().add(this.getFlowHook());
		reactFlowInstanceEClass.getESuperTypes().add(this.getFlowHook());

		// Initialize classes, features, and operations; add parameters
		initEClass(xyPositionEClass, XYPosition.class, "XYPosition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getXYPosition_X(), theEcorePackage.getEDouble(), "x", null, 0, 1, XYPosition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getXYPosition_Y(), theEcorePackage.getEDouble(), "y", null, 0, 1, XYPosition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(flowDataEClass, FlowData.class, "FlowData", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFlowData_Label(), theEcorePackage.getEString(), "label", null, 0, 1, FlowData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFlowData_LabelNode(), theReactPackage.getJsxNode(), null, "labelNode", null, 0, 1, FlowData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFlowData_Values(), this.getDataValue(), null, "values", null, 0, -1, FlowData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dataValueEClass, DataValue.class, "DataValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDataValue_Name(), theEcorePackage.getEString(), "name", null, 0, 1, DataValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDataValue_Value(), theEcorePackage.getEString(), "value", null, 0, 1, DataValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDataValue_Expression(), theTypescriptPackage.getCodeBlock(), null, "expression", null, 0, 1, DataValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(flowNodeEClass, FlowNode.class, "FlowNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFlowNode_Id(), theEcorePackage.getEString(), "id", null, 0, 1, FlowNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFlowNode_CustomType(), theEcorePackage.getEString(), "customType", null, 0, 1, FlowNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFlowNode_NodeType(), this.getNodeType(), "nodeType", null, 0, 1, FlowNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFlowNode_Position(), this.getXYPosition(), null, "position", null, 0, 1, FlowNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFlowNode_Data(), this.getFlowData(), null, "data", null, 0, 1, FlowNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFlowNode_SourcePosition(), this.getHandlePosition(), "sourcePosition", null, 0, 1, FlowNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFlowNode_TargetPosition(), this.getHandlePosition(), "targetPosition", null, 0, 1, FlowNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFlowNode_Hidden(), theEcorePackage.getEBoolean(), "hidden", null, 0, 1, FlowNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFlowNode_Draggable(), theEcorePackage.getEBoolean(), "draggable", null, 0, 1, FlowNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFlowNode_Selectable(), theEcorePackage.getEBoolean(), "selectable", null, 0, 1, FlowNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFlowNode_Connectable(), theEcorePackage.getEBoolean(), "connectable", null, 0, 1, FlowNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFlowNode_Deletable(), theEcorePackage.getEBoolean(), "deletable", null, 0, 1, FlowNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFlowNode_Parent(), this.getFlowNode(), null, "parent", null, 0, 1, FlowNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFlowNode_Extent(), theEcorePackage.getEString(), "extent", null, 0, 1, FlowNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFlowNode_Width(), theEcorePackage.getEDouble(), "width", null, 0, 1, FlowNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFlowNode_Height(), theEcorePackage.getEDouble(), "height", null, 0, 1, FlowNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFlowNode_ZIndex(), theEcorePackage.getEInt(), "zIndex", null, 0, 1, FlowNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFlowNode_ClassName(), theEcorePackage.getEString(), "className", null, 0, 1, FlowNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFlowNode_Style(), theCorePackage.getStringToStringMapEntry(), null, "style", null, 0, -1, FlowNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(edgeMarkerEClass, EdgeMarker.class, "EdgeMarker", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEdgeMarker_Type(), this.getMarkerKind(), "type", null, 0, 1, EdgeMarker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEdgeMarker_Color(), theEcorePackage.getEString(), "color", null, 0, 1, EdgeMarker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEdgeMarker_Width(), theEcorePackage.getEDouble(), "width", null, 0, 1, EdgeMarker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEdgeMarker_Height(), theEcorePackage.getEDouble(), "height", null, 0, 1, EdgeMarker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEdgeMarker_StrokeWidth(), theEcorePackage.getEDouble(), "strokeWidth", null, 0, 1, EdgeMarker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(flowEdgeEClass, FlowEdge.class, "FlowEdge", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFlowEdge_Id(), theEcorePackage.getEString(), "id", null, 0, 1, FlowEdge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFlowEdge_Source(), this.getFlowNode(), null, "source", null, 0, 1, FlowEdge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFlowEdge_Target(), this.getFlowNode(), null, "target", null, 0, 1, FlowEdge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFlowEdge_SourceHandle(), theEcorePackage.getEString(), "sourceHandle", null, 0, 1, FlowEdge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFlowEdge_TargetHandle(), theEcorePackage.getEString(), "targetHandle", null, 0, 1, FlowEdge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFlowEdge_EdgeType(), this.getEdgeType(), "edgeType", null, 0, 1, FlowEdge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFlowEdge_CustomType(), theEcorePackage.getEString(), "customType", null, 0, 1, FlowEdge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFlowEdge_Label(), theEcorePackage.getEString(), "label", null, 0, 1, FlowEdge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFlowEdge_LabelNode(), theReactPackage.getJsxNode(), null, "labelNode", null, 0, 1, FlowEdge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFlowEdge_Animated(), theEcorePackage.getEBoolean(), "animated", null, 0, 1, FlowEdge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFlowEdge_Hidden(), theEcorePackage.getEBoolean(), "hidden", null, 0, 1, FlowEdge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFlowEdge_Deletable(), theEcorePackage.getEBoolean(), "deletable", null, 0, 1, FlowEdge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFlowEdge_Selectable(), theEcorePackage.getEBoolean(), "selectable", null, 0, 1, FlowEdge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFlowEdge_Reconnectable(), theEcorePackage.getEBoolean(), "reconnectable", null, 0, 1, FlowEdge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFlowEdge_MarkerStart(), this.getEdgeMarker(), null, "markerStart", null, 0, 1, FlowEdge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFlowEdge_MarkerEnd(), this.getEdgeMarker(), null, "markerEnd", null, 0, 1, FlowEdge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFlowEdge_Data(), this.getFlowData(), null, "data", null, 0, 1, FlowEdge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFlowEdge_ZIndex(), theEcorePackage.getEInt(), "zIndex", null, 0, 1, FlowEdge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFlowEdge_ClassName(), theEcorePackage.getEString(), "className", null, 0, 1, FlowEdge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFlowEdge_Style(), theCorePackage.getStringToStringMapEntry(), null, "style", null, 0, -1, FlowEdge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(edgeOptionsEClass, EdgeOptions.class, "EdgeOptions", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEdgeOptions_EdgeType(), this.getEdgeType(), "edgeType", null, 0, 1, EdgeOptions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEdgeOptions_CustomType(), theEcorePackage.getEString(), "customType", null, 0, 1, EdgeOptions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEdgeOptions_Animated(), theEcorePackage.getEBoolean(), "animated", null, 0, 1, EdgeOptions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEdgeOptions_MarkerEnd(), this.getEdgeMarker(), null, "markerEnd", null, 0, 1, EdgeOptions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEdgeOptions_Style(), theCorePackage.getStringToStringMapEntry(), null, "style", null, 0, -1, EdgeOptions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(proOptionsEClass, ProOptions.class, "ProOptions", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getProOptions_HideAttribution(), theEcorePackage.getEBoolean(), "hideAttribution", null, 0, 1, ProOptions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(flowTypesEClass, FlowTypes.class, "FlowTypes", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFlowTypes_Types(), this.getFlowType(), null, "types", null, 0, -1, FlowTypes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(flowTypeEClass, FlowType.class, "FlowType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFlowType_Name(), theEcorePackage.getEString(), "name", null, 0, 1, FlowType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFlowType_Component(), theTypescriptPackage.getNamedTypeReference(), null, "component", null, 0, 1, FlowType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(flowComponentEClass, FlowComponent.class, "FlowComponent", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(reactFlowProviderEClass, ReactFlowProvider.class, "ReactFlowProvider", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(reactFlowEClass, ReactFlow.class, "ReactFlow", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getReactFlow_Nodes(), this.getFlowNode(), null, "nodes", null, 0, -1, ReactFlow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getReactFlow_Edges(), this.getFlowEdge(), null, "edges", null, 0, -1, ReactFlow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getReactFlow_NodeTypes(), theTypescriptPackage.getVariableDeclaration(), null, "nodeTypes", null, 0, 1, ReactFlow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getReactFlow_EdgeTypes(), theTypescriptPackage.getVariableDeclaration(), null, "edgeTypes", null, 0, 1, ReactFlow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getReactFlow_FitView(), theEcorePackage.getEBoolean(), "fitView", null, 0, 1, ReactFlow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getReactFlow_MinZoom(), theEcorePackage.getEDouble(), "minZoom", null, 0, 1, ReactFlow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getReactFlow_MaxZoom(), theEcorePackage.getEDouble(), "maxZoom", null, 0, 1, ReactFlow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getReactFlow_NodesDraggable(), theEcorePackage.getEBoolean(), "nodesDraggable", null, 0, 1, ReactFlow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getReactFlow_NodesConnectable(), theEcorePackage.getEBoolean(), "nodesConnectable", null, 0, 1, ReactFlow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getReactFlow_ElementsSelectable(), theEcorePackage.getEBoolean(), "elementsSelectable", null, 0, 1, ReactFlow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getReactFlow_PanOnDrag(), theEcorePackage.getEBoolean(), "panOnDrag", null, 0, 1, ReactFlow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getReactFlow_ZoomOnScroll(), theEcorePackage.getEBoolean(), "zoomOnScroll", null, 0, 1, ReactFlow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getReactFlow_ZoomOnDoubleClick(), theEcorePackage.getEBoolean(), "zoomOnDoubleClick", null, 0, 1, ReactFlow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getReactFlow_SnapToGrid(), theEcorePackage.getEBoolean(), "snapToGrid", null, 0, 1, ReactFlow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getReactFlow_SnapGrid(), theEcorePackage.getEInt(), "snapGrid", null, 0, -1, ReactFlow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getReactFlow_ColorMode(), this.getColorMode(), "colorMode", null, 0, 1, ReactFlow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getReactFlow_DeleteKeyCode(), theEcorePackage.getEString(), "deleteKeyCode", null, 0, -1, ReactFlow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getReactFlow_ConnectionLineType(), this.getConnectionLineType(), "connectionLineType", null, 0, 1, ReactFlow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getReactFlow_DefaultEdgeOptions(), this.getEdgeOptions(), null, "defaultEdgeOptions", null, 0, 1, ReactFlow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getReactFlow_ProOptions(), this.getProOptions(), null, "proOptions", null, 0, 1, ReactFlow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getReactFlow_Background(), this.getBackground(), null, "background", null, 0, 1, ReactFlow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getReactFlow_Controls(), this.getControls(), null, "controls", null, 0, 1, ReactFlow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getReactFlow_MiniMap(), this.getMiniMap(), null, "miniMap", null, 0, 1, ReactFlow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getReactFlow_Panels(), this.getPanel(), null, "panels", null, 0, -1, ReactFlow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(backgroundEClass, Background.class, "Background", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBackground_Variant(), this.getBackgroundVariant(), "variant", null, 0, 1, Background.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBackground_Gap(), theEcorePackage.getEDouble(), "gap", null, 0, 1, Background.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBackground_Size(), theEcorePackage.getEDouble(), "size", null, 0, 1, Background.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBackground_LineWidth(), theEcorePackage.getEDouble(), "lineWidth", null, 0, 1, Background.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBackground_Color(), theEcorePackage.getEString(), "color", null, 0, 1, Background.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBackground_BgColor(), theEcorePackage.getEString(), "bgColor", null, 0, 1, Background.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBackground_BackgroundId(), theEcorePackage.getEString(), "backgroundId", null, 0, 1, Background.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(controlsEClass, Controls.class, "Controls", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getControls_ShowZoom(), theEcorePackage.getEBoolean(), "showZoom", null, 0, 1, Controls.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getControls_ShowFitView(), theEcorePackage.getEBoolean(), "showFitView", null, 0, 1, Controls.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getControls_ShowInteractive(), theEcorePackage.getEBoolean(), "showInteractive", null, 0, 1, Controls.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getControls_Position(), this.getPanelPosition(), "position", null, 0, 1, Controls.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getControls_Orientation(), this.getOrientation(), "orientation", null, 0, 1, Controls.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(miniMapEClass, MiniMap.class, "MiniMap", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMiniMap_Position(), this.getPanelPosition(), "position", null, 0, 1, MiniMap.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMiniMap_NodeColor(), theEcorePackage.getEString(), "nodeColor", null, 0, 1, MiniMap.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMiniMap_NodeStrokeColor(), theEcorePackage.getEString(), "nodeStrokeColor", null, 0, 1, MiniMap.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMiniMap_MaskColor(), theEcorePackage.getEString(), "maskColor", null, 0, 1, MiniMap.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMiniMap_BgColor(), theEcorePackage.getEString(), "bgColor", null, 0, 1, MiniMap.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMiniMap_Pannable(), theEcorePackage.getEBoolean(), "pannable", null, 0, 1, MiniMap.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMiniMap_Zoomable(), theEcorePackage.getEBoolean(), "zoomable", null, 0, 1, MiniMap.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMiniMap_AriaLabel(), theEcorePackage.getEString(), "ariaLabel", null, 0, 1, MiniMap.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(panelEClass, Panel.class, "Panel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPanel_Position(), this.getPanelPosition(), "position", null, 0, 1, Panel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(handleEClass, Handle.class, "Handle", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getHandle_HandleType(), this.getHandleType(), "handleType", null, 0, 1, Handle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHandle_Position(), this.getHandlePosition(), "position", null, 0, 1, Handle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHandle_HandleId(), theEcorePackage.getEString(), "handleId", null, 0, 1, Handle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHandle_IsConnectable(), theEcorePackage.getEBoolean(), "isConnectable", null, 0, 1, Handle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(nodeToolbarEClass, NodeToolbar.class, "NodeToolbar", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNodeToolbar_Position(), this.getHandlePosition(), "position", null, 0, 1, NodeToolbar.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNodeToolbar_IsVisible(), theEcorePackage.getEBoolean(), "isVisible", null, 0, 1, NodeToolbar.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNodeToolbar_Offset(), theEcorePackage.getEDouble(), "offset", null, 0, 1, NodeToolbar.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNodeToolbar_Align(), this.getAlign(), "align", null, 0, 1, NodeToolbar.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(nodeResizerEClass, NodeResizer.class, "NodeResizer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNodeResizer_MinWidth(), theEcorePackage.getEDouble(), "minWidth", null, 0, 1, NodeResizer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNodeResizer_MinHeight(), theEcorePackage.getEDouble(), "minHeight", null, 0, 1, NodeResizer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNodeResizer_IsVisible(), theEcorePackage.getEBoolean(), "isVisible", null, 0, 1, NodeResizer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNodeResizer_KeepAspectRatio(), theEcorePackage.getEBoolean(), "keepAspectRatio", null, 0, 1, NodeResizer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNodeResizer_Color(), theEcorePackage.getEString(), "color", null, 0, 1, NodeResizer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(flowHookEClass, FlowHook.class, "FlowHook", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(nodesStateEClass, NodesState.class, "NodesState", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNodesState_InitialNodes(), this.getFlowNode(), null, "initialNodes", null, 0, -1, NodesState.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(edgesStateEClass, EdgesState.class, "EdgesState", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEdgesState_InitialEdges(), this.getFlowEdge(), null, "initialEdges", null, 0, -1, EdgesState.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(reactFlowInstanceEClass, ReactFlowInstance.class, "ReactFlowInstance", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Initialize enums and add enum literals
		initEEnum(handlePositionEEnum, HandlePosition.class, "HandlePosition");
		addEEnumLiteral(handlePositionEEnum, HandlePosition.LEFT);
		addEEnumLiteral(handlePositionEEnum, HandlePosition.TOP);
		addEEnumLiteral(handlePositionEEnum, HandlePosition.RIGHT);
		addEEnumLiteral(handlePositionEEnum, HandlePosition.BOTTOM);

		initEEnum(markerKindEEnum, MarkerKind.class, "MarkerKind");
		addEEnumLiteral(markerKindEEnum, MarkerKind.ARROW);
		addEEnumLiteral(markerKindEEnum, MarkerKind.ARROW_CLOSED);

		initEEnum(connectionLineTypeEEnum, ConnectionLineType.class, "ConnectionLineType");
		addEEnumLiteral(connectionLineTypeEEnum, ConnectionLineType.BEZIER);
		addEEnumLiteral(connectionLineTypeEEnum, ConnectionLineType.STRAIGHT);
		addEEnumLiteral(connectionLineTypeEEnum, ConnectionLineType.STEP);
		addEEnumLiteral(connectionLineTypeEEnum, ConnectionLineType.SMOOTH_STEP);
		addEEnumLiteral(connectionLineTypeEEnum, ConnectionLineType.SIMPLE_BEZIER);

		initEEnum(backgroundVariantEEnum, BackgroundVariant.class, "BackgroundVariant");
		addEEnumLiteral(backgroundVariantEEnum, BackgroundVariant.LINES);
		addEEnumLiteral(backgroundVariantEEnum, BackgroundVariant.DOTS);
		addEEnumLiteral(backgroundVariantEEnum, BackgroundVariant.CROSS);

		initEEnum(edgeTypeEEnum, EdgeType.class, "EdgeType");
		addEEnumLiteral(edgeTypeEEnum, EdgeType.BEZIER);
		addEEnumLiteral(edgeTypeEEnum, EdgeType.STRAIGHT);
		addEEnumLiteral(edgeTypeEEnum, EdgeType.STEP);
		addEEnumLiteral(edgeTypeEEnum, EdgeType.SMOOTH_STEP);
		addEEnumLiteral(edgeTypeEEnum, EdgeType.SIMPLE_BEZIER);

		initEEnum(nodeTypeEEnum, NodeType.class, "NodeType");
		addEEnumLiteral(nodeTypeEEnum, NodeType.DEFAULT);
		addEEnumLiteral(nodeTypeEEnum, NodeType.INPUT);
		addEEnumLiteral(nodeTypeEEnum, NodeType.OUTPUT);
		addEEnumLiteral(nodeTypeEEnum, NodeType.GROUP);

		initEEnum(colorModeEEnum, ColorMode.class, "ColorMode");
		addEEnumLiteral(colorModeEEnum, ColorMode.LIGHT);
		addEEnumLiteral(colorModeEEnum, ColorMode.DARK);
		addEEnumLiteral(colorModeEEnum, ColorMode.SYSTEM);

		initEEnum(panelPositionEEnum, PanelPosition.class, "PanelPosition");
		addEEnumLiteral(panelPositionEEnum, PanelPosition.TOP_LEFT);
		addEEnumLiteral(panelPositionEEnum, PanelPosition.TOP_CENTER);
		addEEnumLiteral(panelPositionEEnum, PanelPosition.TOP_RIGHT);
		addEEnumLiteral(panelPositionEEnum, PanelPosition.BOTTOM_LEFT);
		addEEnumLiteral(panelPositionEEnum, PanelPosition.BOTTOM_CENTER);
		addEEnumLiteral(panelPositionEEnum, PanelPosition.BOTTOM_RIGHT);
		addEEnumLiteral(panelPositionEEnum, PanelPosition.CENTER_LEFT);
		addEEnumLiteral(panelPositionEEnum, PanelPosition.CENTER_RIGHT);

		initEEnum(orientationEEnum, Orientation.class, "Orientation");
		addEEnumLiteral(orientationEEnum, Orientation.HORIZONTAL);
		addEEnumLiteral(orientationEEnum, Orientation.VERTICAL);

		initEEnum(handleTypeEEnum, HandleType.class, "HandleType");
		addEEnumLiteral(handleTypeEEnum, HandleType.SOURCE);
		addEEnumLiteral(handleTypeEEnum, HandleType.TARGET);

		initEEnum(alignEEnum, Align.class, "Align");
		addEEnumLiteral(alignEEnum, Align.START);
		addEEnumLiteral(alignEEnum, Align.CENTER);
		addEEnumLiteral(alignEEnum, Align.END);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/emf/2002/GenModel
		createGenModelAnnotations();
		// http://www.eclipse.org/emf/2011/Xcore
		createXcoreAnnotations();
		// urn:org.nasdanika:react
		createUrnorgAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/GenModel</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGenModelAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/GenModel";
		addAnnotation
		  (this,
		   source,
		   new String[] {
			   "modelDirectory", "/flow/src-gen",
			   "featureDelegation", "Dynamic",
			   "complianceLevel", "25",
			   "suppressGenModelAnnotations", "false",
			   "copyrightFields", "false",
			   "operationReflection", "true",
			   "importOrganizing", "true",
			   "basePackage", "org.nasdanika.sdk.runtime.models.react"
		   });
		addAnnotation
		  (handlePositionEEnum,
		   source,
		   new String[] {
			   "documentation", " Position enum of @xyflow/react - literal names are member names"
		   });
		addAnnotation
		  (markerKindEEnum,
		   source,
		   new String[] {
			   "documentation", " MarkerType enum of @xyflow/react"
		   });
		addAnnotation
		  (connectionLineTypeEEnum,
		   source,
		   new String[] {
			   "documentation", " ConnectionLineType enum of @xyflow/react"
		   });
		addAnnotation
		  (backgroundVariantEEnum,
		   source,
		   new String[] {
			   "documentation", " BackgroundVariant enum of @xyflow/react"
		   });
		addAnnotation
		  (edgeTypeEEnum,
		   source,
		   new String[] {
			   "documentation", " Built in edge types"
		   });
		addAnnotation
		  (nodeTypeEEnum,
		   source,
		   new String[] {
			   "documentation", " Built in node types"
		   });
		addAnnotation
		  (flowDataEClass,
		   source,
		   new String[] {
			   "documentation", "Data of a node or an edge. The default node types render the label."
		   });
		addAnnotation
		  (getFlowData_LabelNode(),
		   source,
		   new String[] {
			   "documentation", " Label with markup. Wins over label."
		   });
		addAnnotation
		  (getFlowData_Values(),
		   source,
		   new String[] {
			   "documentation", " More data, e.g. for custom nodes: { jdk: true }"
		   });
		addAnnotation
		  (dataValueEClass,
		   source,
		   new String[] {
			   "documentation", "A named value: a string, or an expression for numbers, booleans, arrays and objects."
		   });
		addAnnotation
		  (getDataValue_Expression(),
		   source,
		   new String[] {
			   "documentation", " Wins over value"
		   });
		addAnnotation
		  (flowNodeEClass,
		   source,
		   new String[] {
			   "documentation", "A node. id is required - edges refer to it."
		   });
		addAnnotation
		  (getFlowNode_CustomType(),
		   source,
		   new String[] {
			   "documentation", " Custom node type, a key of the nodeTypes of the flow. Wins over nodeType."
		   });
		addAnnotation
		  (getFlowNode_Parent(),
		   source,
		   new String[] {
			   "documentation", " Parent node of a sub flow"
		   });
		addAnnotation
		  (getFlowNode_Extent(),
		   source,
		   new String[] {
			   "documentation", " \"parent\" keeps a child node within its parent"
		   });
		addAnnotation
		  (flowEdgeEClass,
		   source,
		   new String[] {
			   "documentation", "An edge between nodes. id is required."
		   });
		addAnnotation
		  (getFlowEdge_CustomType(),
		   source,
		   new String[] {
			   "documentation", " Custom edge type, a key of the edgeTypes of the flow. Wins over edgeType."
		   });
		addAnnotation
		  (getFlowEdge_LabelNode(),
		   source,
		   new String[] {
			   "documentation", " Label with markup. Wins over label."
		   });
		addAnnotation
		  (edgeOptionsEClass,
		   source,
		   new String[] {
			   "documentation", "Options of new edges, e.g. connected by the user."
		   });
		addAnnotation
		  (flowTypesEClass,
		   source,
		   new String[] {
			   "documentation", "Node or edge types: type name to component. The initializer of a module level constant,\nas a ValueBlock - see the package documentation."
		   });
		addAnnotation
		  (reactFlowProviderEClass,
		   source,
		   new String[] {
			   "documentation", "Makes the React Flow instance available outside the flow, e.g. to useReactFlow in a toolbar."
		   });
		addAnnotation
		  (reactFlowEClass,
		   source,
		   new String[] {
			   "documentation", "The flow. Its parent element needs a height."
		   });
		addAnnotation
		  (getReactFlow_Nodes(),
		   source,
		   new String[] {
			   "documentation", " Initial nodes of an uncontrolled flow"
		   });
		addAnnotation
		  (getReactFlow_Edges(),
		   source,
		   new String[] {
			   "documentation", " Initial edges of an uncontrolled flow"
		   });
		addAnnotation
		  (getReactFlow_NodeTypes(),
		   source,
		   new String[] {
			   "documentation", " Constant with FlowTypes of custom nodes"
		   });
		addAnnotation
		  (getReactFlow_EdgeTypes(),
		   source,
		   new String[] {
			   "documentation", " Constant with FlowTypes of custom edges"
		   });
		addAnnotation
		  (getReactFlow_SnapGrid(),
		   source,
		   new String[] {
			   "documentation", " [x, y]"
		   });
		addAnnotation
		  (getReactFlow_DeleteKeyCode(),
		   source,
		   new String[] {
			   "documentation", " Keys deleting selected elements, e.g. Backspace and Delete"
		   });
		addAnnotation
		  (getBackground_BackgroundId(),
		   source,
		   new String[] {
			   "documentation", " Distinguishes several backgrounds of a flow"
		   });
		addAnnotation
		  (panelEClass,
		   source,
		   new String[] {
			   "documentation", "Content over the flow, e.g. a title or a toolbar."
		   });
		addAnnotation
		  (handleEClass,
		   source,
		   new String[] {
			   "documentation", "Connection point of a custom node."
		   });
		addAnnotation
		  (getHandle_HandleId(),
		   source,
		   new String[] {
			   "documentation", " Distinguishes several handles of a type"
		   });
		addAnnotation
		  (nodeToolbarEClass,
		   source,
		   new String[] {
			   "documentation", "Toolbar of a custom node, shown when the node is selected unless isVisible is set."
		   });
		addAnnotation
		  (nodesStateEClass,
		   source,
		   new String[] {
			   "documentation", "const [nodes, setNodes, onNodesChange] = useNodesState(initialNodes)"
		   });
		addAnnotation
		  (edgesStateEClass,
		   source,
		   new String[] {
			   "documentation", "const [edges, setEdges, onEdgesChange] = useEdgesState(initialEdges)"
		   });
		addAnnotation
		  (reactFlowInstanceEClass,
		   source,
		   new String[] {
			   "documentation", "const flow = useReactFlow() - in a ReactFlowProvider, or in a node."
		   });
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2011/Xcore</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createXcoreAnnotations() {
		String source = "http://www.eclipse.org/emf/2011/Xcore";
		addAnnotation
		  (this,
		   source,
		   new String[] {
			   "Ecore", "http://www.eclipse.org/emf/2002/Ecore",
			   "GenModel", "http://www.eclipse.org/emf/2002/GenModel",
			   "React", "urn:org.nasdanika:react"
		   });
	}

	/**
	 * Initializes the annotations for <b>urn:org.nasdanika:react</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createUrnorgAnnotations() {
		String source = "urn:org.nasdanika:react";
		addAnnotation
		  (getXYPosition_X(),
		   source,
		   new String[] {
			   "required", "true"
		   });
		addAnnotation
		  (getXYPosition_Y(),
		   source,
		   new String[] {
			   "required", "true"
		   });
		addAnnotation
		  (getFlowData_LabelNode(),
		   source,
		   new String[] {
			   "prop", "label"
		   });
		addAnnotation
		  (getFlowData_Values(),
		   source,
		   new String[] {
			   "key", "name"
		   });
		addAnnotation
		  (dataValueEClass,
		   source,
		   new String[] {
			   "shorthand", "value"
		   });
		addAnnotation
		  (getDataValue_Expression(),
		   source,
		   new String[] {
			   "prop", "value"
		   });
		addAnnotation
		  (getFlowNode_CustomType(),
		   source,
		   new String[] {
			   "prop", "type"
		   });
		addAnnotation
		  (getFlowNode_NodeType(),
		   source,
		   new String[] {
			   "prop", "type"
		   });
		addAnnotation
		  (getFlowNode_Position(),
		   source,
		   new String[] {
			   "required", "true"
		   });
		addAnnotation
		  (getFlowNode_Data(),
		   source,
		   new String[] {
			   "required", "true"
		   });
		addAnnotation
		  (getFlowNode_SourcePosition(),
		   source,
		   new String[] {
			   "enum", "Position",
			   "module", "@xyflow/react"
		   });
		addAnnotation
		  (getFlowNode_TargetPosition(),
		   source,
		   new String[] {
			   "enum", "Position",
			   "module", "@xyflow/react"
		   });
		addAnnotation
		  (getFlowNode_Parent(),
		   source,
		   new String[] {
			   "prop", "parentId",
			   "ref", "id"
		   });
		addAnnotation
		  (getFlowNode_Style(),
		   source,
		   new String[] {
			   "style", "true"
		   });
		addAnnotation
		  (getEdgeMarker_Type(),
		   source,
		   new String[] {
			   "enum", "MarkerType",
			   "module", "@xyflow/react",
			   "required", "true"
		   });
		addAnnotation
		  (getFlowEdge_Source(),
		   source,
		   new String[] {
			   "ref", "id"
		   });
		addAnnotation
		  (getFlowEdge_Target(),
		   source,
		   new String[] {
			   "ref", "id"
		   });
		addAnnotation
		  (getFlowEdge_EdgeType(),
		   source,
		   new String[] {
			   "prop", "type"
		   });
		addAnnotation
		  (getFlowEdge_CustomType(),
		   source,
		   new String[] {
			   "prop", "type"
		   });
		addAnnotation
		  (getFlowEdge_LabelNode(),
		   source,
		   new String[] {
			   "prop", "label"
		   });
		addAnnotation
		  (getFlowEdge_Style(),
		   source,
		   new String[] {
			   "style", "true"
		   });
		addAnnotation
		  (getEdgeOptions_EdgeType(),
		   source,
		   new String[] {
			   "prop", "type"
		   });
		addAnnotation
		  (getEdgeOptions_CustomType(),
		   source,
		   new String[] {
			   "prop", "type"
		   });
		addAnnotation
		  (getEdgeOptions_Style(),
		   source,
		   new String[] {
			   "style", "true"
		   });
		addAnnotation
		  (getFlowTypes_Types(),
		   source,
		   new String[] {
			   "key", "name"
		   });
		addAnnotation
		  (flowTypeEClass,
		   source,
		   new String[] {
			   "shorthand", "component"
		   });
		addAnnotation
		  (flowComponentEClass,
		   source,
		   new String[] {
			   "module", "@xyflow/react"
		   });
		addAnnotation
		  (reactFlowProviderEClass,
		   source,
		   new String[] {
			   "component", "ReactFlowProvider"
		   });
		addAnnotation
		  (reactFlowEClass,
		   source,
		   new String[] {
			   "component", "ReactFlow"
		   });
		addAnnotation
		  (getReactFlow_Nodes(),
		   source,
		   new String[] {
			   "prop", "defaultNodes"
		   });
		addAnnotation
		  (getReactFlow_Edges(),
		   source,
		   new String[] {
			   "prop", "defaultEdges"
		   });
		addAnnotation
		  (getReactFlow_ConnectionLineType(),
		   source,
		   new String[] {
			   "enum", "ConnectionLineType",
			   "module", "@xyflow/react"
		   });
		addAnnotation
		  (backgroundEClass,
		   source,
		   new String[] {
			   "component", "Background"
		   });
		addAnnotation
		  (getBackground_Variant(),
		   source,
		   new String[] {
			   "enum", "BackgroundVariant",
			   "module", "@xyflow/react"
		   });
		addAnnotation
		  (getBackground_BackgroundId(),
		   source,
		   new String[] {
			   "prop", "id"
		   });
		addAnnotation
		  (controlsEClass,
		   source,
		   new String[] {
			   "component", "Controls"
		   });
		addAnnotation
		  (miniMapEClass,
		   source,
		   new String[] {
			   "component", "MiniMap"
		   });
		addAnnotation
		  (panelEClass,
		   source,
		   new String[] {
			   "component", "Panel"
		   });
		addAnnotation
		  (handleEClass,
		   source,
		   new String[] {
			   "component", "Handle"
		   });
		addAnnotation
		  (getHandle_HandleType(),
		   source,
		   new String[] {
			   "prop", "type",
			   "required", "true"
		   });
		addAnnotation
		  (getHandle_Position(),
		   source,
		   new String[] {
			   "enum", "Position",
			   "module", "@xyflow/react",
			   "required", "true"
		   });
		addAnnotation
		  (getHandle_HandleId(),
		   source,
		   new String[] {
			   "prop", "id"
		   });
		addAnnotation
		  (nodeToolbarEClass,
		   source,
		   new String[] {
			   "component", "NodeToolbar"
		   });
		addAnnotation
		  (getNodeToolbar_Position(),
		   source,
		   new String[] {
			   "enum", "Position",
			   "module", "@xyflow/react"
		   });
		addAnnotation
		  (nodeResizerEClass,
		   source,
		   new String[] {
			   "component", "NodeResizer"
		   });
		addAnnotation
		  (flowHookEClass,
		   source,
		   new String[] {
			   "module", "@xyflow/react"
		   });
		addAnnotation
		  (nodesStateEClass,
		   source,
		   new String[] {
			   "hook", "useNodesState"
		   });
		addAnnotation
		  (getNodesState_InitialNodes(),
		   source,
		   new String[] {
			   "required", "true"
		   });
		addAnnotation
		  (edgesStateEClass,
		   source,
		   new String[] {
			   "hook", "useEdgesState"
		   });
		addAnnotation
		  (getEdgesState_InitialEdges(),
		   source,
		   new String[] {
			   "required", "true"
		   });
		addAnnotation
		  (reactFlowInstanceEClass,
		   source,
		   new String[] {
			   "hook", "useReactFlow"
		   });
	}

} //FlowPackageImpl
