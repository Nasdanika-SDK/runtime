import { Handle, Position, ReactFlow } from "@xyflow/react";

function ModelNode(props) {
  return (
    <div className="model-node">
      <Handle type="target" position={Position.Top} />
      {props.data.label}
      <Handle type="source" position={Position.Bottom} />
    </div>
  );
}

const nodeTypes = { model: ModelNode };

export function Models() {
  return (
    <ReactFlow
      defaultNodes={[
        { id: "html", type: "model", position: { x: 0, y: 0 }, data: { label: "HTML", level: 1 } },
        { id: "react", type: "model", position: { x: 0, y: 150 }, data: { label: "React" } }
      ]}
      defaultEdges={[{ id: "react-html", source: "react", target: "html" }]}
      nodeTypes={nodeTypes}
    />
  );
}
