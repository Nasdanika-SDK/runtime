import { Badge } from "./components/badge.js";
import { createContext, memo, useState, useContext, useMemo } from "react";

export const ThemeContext = createContext<string>("light");

export interface UserListProps {
  users: { id: number; name: string }[];
}

/**
 * Users, filtered by name.
 */
export const UserList = memo(function UserList(props: UserListProps) {
  const [filter, setFilter] = useState<string>("");
  const theme = useContext(ThemeContext);
  const visible = useMemo(() => (props.users.filter(user => user.name.includes(filter))), [props.users, filter]);
  return (
    <ThemeContext.Provider value={theme}>
      <div className="user-list" data-theme={theme} style={{ marginTop: "1rem" }}>
        <label htmlFor="filter">Filter: </label>
        <input
          id="filter"
          type="text"
          value={filter}
          onChange={event => setFilter(event.target.value)}
        />
        <ul>
          {visible.map(user => <li key={user.id}><Badge name={user.name} />{" & friends"}</li>)}
        </ul>
        {(visible.length === 0) && <p>No users</p>}
      </div>
    </ThemeContext.Provider>
  );
});

function renderName(name) {
  const upper = name.toUpperCase();
  return <b>{upper}</b>;
}
