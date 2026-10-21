"""
Writes an HTML page that renders the first page of a Draw.io document with Draw.io's own viewer.

    python page.py <diagram.drawio> <page.html> [canvas width] [canvas height]
"""
import html
import json
import sys

VIEWER = "https://cdn.jsdelivr.net/gh/jgraph/drawio@v32.5.5/src/main/webapp/js/viewer-static.min.js"

source, target = sys.argv[1], sys.argv[2]
width = int(sys.argv[3]) if len(sys.argv) > 3 else 2000
height = int(sys.argv[4]) if len(sys.argv) > 4 else 2000
xml = open(source, encoding="utf-8").read()
config = {"xml": xml, "toolbar": "", "nav": False, "lightbox": False, "border": 0,
          "resize": False, "zoom": 1, "highlight": "none"}
page = f"""<!doctype html>
<html><head><meta charset="utf-8">
<style>html, body {{ margin: 0; background: #fff }} #d {{ position: absolute; left: 40px; top: 40px }}</style>
</head><body>
<div id="d"><div class="mxgraph" style="width: {width}px; height: {height}px"
  data-mxgraph="{html.escape(json.dumps(config), quote=True)}"></div></div>
<script src="{VIEWER}"></script>
<script>
  // Render explicitly: the viewer's automatic processing does not run in a headless screenshot
  var element = document.querySelector(".mxgraph");
  var config = JSON.parse(element.getAttribute("data-mxgraph"));
  element.removeAttribute("data-mxgraph");
  new GraphViewer(element, mxUtils.parseXml(config.xml).documentElement, config);
</script>
</body></html>
"""
open(target, "w", encoding="utf-8").write(page)
