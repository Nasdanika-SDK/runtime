import { createElement } from "react";

export function Badge(props) {
  return createElement("span", { className: "badge" }, props.name);
}
