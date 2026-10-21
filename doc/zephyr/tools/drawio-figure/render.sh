#!/bin/bash
# Renders the first page of a Draw.io document into a figure for a Nasdanika Zephyr Book: a PNG at
# twice the size, cropped to the diagram, with the document embedded, so that Draw.io opens the
# figure for editing and the Draw.io API loads it with Document.loadFromPngMetadata.
#
#   render.sh <diagram.drawio> <figure.png>
#
# Needs Python, a JDK and Chrome or Chromium, and internet access for Draw.io's viewer.
# CHROME overrides the browser; W and H the window size, which must hold the diagram.
set -e
HERE="$(cd "$(dirname "$0")" && pwd)"
SOURCE="$1"
TARGET="$2"
NAME=$(basename "$SOURCE" .drawio)
WORK="${TMPDIR:-/tmp}/drawio-figure"
mkdir -p "$WORK"

native() { if command -v cygpath > /dev/null; then cygpath -w "$1"; else echo "$1"; fi; }

if [ -z "$CHROME" ]; then
  for candidate in "/c/Program Files/Google/Chrome/Application/chrome.exe" google-chrome chromium chromium-browser; do
    if command -v "$candidate" > /dev/null 2>&1 || [ -x "$candidate" ]; then CHROME="$candidate"; break; fi
  done
fi

python "$HERE/page.py" "$SOURCE" "$WORK/$NAME.html"
rm -f "$WORK/$NAME-shot.png"
"$CHROME" --headless=new --disable-gpu --hide-scrollbars \
  --force-device-scale-factor=2 --window-size=${W:-2100},${H:-2100} --virtual-time-budget=20000 \
  --screenshot="$(native "$WORK/$NAME-shot.png")" "file:///$(native "$WORK/$NAME.html")" 2>/dev/null
java "$HERE/EmbedPng.java" "$(native "$WORK/$NAME-shot.png")" "$(native "$SOURCE")" "$(native "$TARGET")" 24 192
