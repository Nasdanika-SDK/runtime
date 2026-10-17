// Generated from a React model. Do not edit.

import { createRoot } from "react-dom/client";
import { Spinner, Table } from "react-bootstrap";
import { createElement, useState, useEffect, useMemo } from "react";

function matches(row, query) {
  return row.title.toLowerCase().includes(query.toLowerCase());
}

export function BookTable(props) {
  const [rows, setRows] = useState(null);
  const [query, setQuery] = useState("");
  useEffect(() => {
    fetch(props.dataUrl).then(response => response.json()).then(setRows);
  }, [props.dataUrl]);
  const shown = useMemo(() => ((rows || []).filter(row => matches(row, query))), [rows, query]);
  return createElement("div", null,
    createElement("input", {
      className: "form-control mb-3",
      type: "search",
      placeholder: "Filter by title",
      value: query,
      onChange: event => setQuery(event.target.value)
    }),
    !rows
      ? createElement(Spinner, { animation: "border" })
      : createElement(Table, { striped: true },
        createElement("thead", null,
          createElement("tr", null,
            createElement("th", null, "Title"),
            createElement("th", null, "Year"),
            createElement("th", null, "Authors"))),
        createElement("tbody", null,
          shown.map(row => createElement("tr", { key: row.title },
            createElement("td", null, row.title),
            createElement("td", null, row.year),
            createElement("td", null, row.authors))))));
}

export function mount(element, dataUrl) {
  createRoot(element).render(createElement(BookTable, { dataUrl }));
}
