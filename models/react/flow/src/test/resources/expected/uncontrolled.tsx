import { ReactFlow, MarkerType, Background, BackgroundVariant, Controls, MiniMap, Panel } from "@xyflow/react";

export function Pipeline() {
  return (
    <div style={{ height: "400px" }}>
      <ReactFlow
        defaultNodes={[
          { id: "in", type: "input", position: { x: 0, y: 0 }, data: { label: "Input" } },
          { id: "process", position: { x: 0, y: 100 }, data: { label: "Process" } },
          { id: "out", type: "output", position: { x: 0, y: 200 }, data: { label: "Output" } }
        ]}
        defaultEdges={[
          { id: "in-process", source: "in", target: "process", label: "raw", animated: true },
          { id: "process-out", source: "process", target: "out", markerEnd: { type: MarkerType.ArrowClosed } }
        ]}
        fitView
      >
        <Background variant={BackgroundVariant.Dots} gap={16} />
        <Controls />
        <MiniMap pannable />
        <Panel position="top-left">Pipeline</Panel>
      </ReactFlow>
    </div>
  );
}
