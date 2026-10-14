import { addEdge, useNodesState, useEdgesState, ReactFlow, ConnectionLineType, MarkerType } from "@xyflow/react";
import { useCallback } from "react";

export function Editor() {
  const [nodes, setNodes, onNodesChange] = useNodesState([
    { id: "a", position: { x: 0, y: 0 }, data: { label: "A" } },
    { id: "b", position: { x: 200, y: 0 }, data: { label: "B" } }
  ]);
  const [edges, setEdges, onEdgesChange] = useEdgesState([{ id: "a-b", source: "a", target: "b", type: "smoothstep" }]);
  const onConnect = useCallback(connection => setEdges(current => addEdge(connection, current)), [setEdges]);
  return (
    <ReactFlow
      colorMode="dark"
      deleteKeyCode={["Backspace", "Delete"]}
      connectionLineType={ConnectionLineType.SmoothStep}
      defaultEdgeOptions={{ animated: true, markerEnd: { type: MarkerType.Arrow } }}
      nodes={nodes}
      edges={edges}
      onNodesChange={onNodesChange}
      onEdgesChange={onEdgesChange}
      onConnect={onConnect}
    />
  );
}
