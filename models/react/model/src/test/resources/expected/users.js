import { Badge } from "./components/badge.js";
import { createContext, memo, useState, useContext, useMemo, createElement } from "react";

export const ThemeContext = createContext("light");

/**
 * Users, filtered by name.
 */
export const UserList = memo(function UserList(props) {
  const [filter, setFilter] = useState("");
  const theme = useContext(ThemeContext);
  const visible = useMemo(() => (props.users.filter(user => user.name.includes(filter))), [props.users, filter]);
  return createElement(ThemeContext.Provider, { value: theme },
    createElement("div", {
      className: "user-list",
      "data-theme": theme,
      style: { marginTop: "1rem" }
    },
      createElement("label", { htmlFor: "filter" }, "Filter: "),
      createElement("input", {
        id: "filter",
        type: "text",
        value: filter,
        onChange: event => setFilter(event.target.value)
      }),
      createElement("ul", null,
        visible.map(user => createElement("li", { key: user.id },
          createElement(Badge, { name: user.name }),
          " & friends"))),
      (visible.length === 0) && createElement("p", null, "No users")));
});

function renderName(name) {
  const upper = name.toUpperCase();
  return createElement("b", null, upper);
}
