
```drawio-resource
../presentation.drawio
```

[TOC levels=6]

An [Ecore](https://ecore.models.nasdanika.org/) model of **presentations as data**: a deck, the slides in it, the shapes on them, the text inside those shapes, the connectors between them, the masters they inherit from, and the speaker notes that nothing can query today.

It stands on the [diagram](https://diagram.models.nasdanika.org/) model and makes one decision that everything else follows from: **a slide is a diagram**.
[`Slide`](references/eClassifiers/Slide/index.html) extends diagram `Diagram`, [`Shape`](references/eClassifiers/Shape/index.html) extends diagram `Node`, [`ConnectorShape`](references/eClassifiers/ConnectorShape/index.html) extends diagram `Connection`.
A deck is not a new kind of artifact - it is an ordered set of diagrams with deck-level concerns attached: page geometry, masters, notes, and the running text.

Above it sit the notation models: [Draw.io](https://drawio.models.nasdanika.org/), [Visio](https://visio.models.nasdanika.org/), [PowerPoint](https://powerpoint.models.nasdanika.org/), [PlantUML](https://plantuml.models.nasdanika.org/), [ODP](https://odp.models.nasdanika.org/), [PDF](https://pdf.models.nasdanika.org/), and [Sprotty](https://sprotty.models.nasdanika.org/) for rendering presentations on the web.
Each of them is a loader and a generator over this model rather than a metamodel with ambitions of its own, which is what turns N x N converters into N loaders plus N generators for a family of formats that badly needs the arithmetic to change.

Two goals follow. **Format-independent generation**: produce a deck once - from a template, from a mapping, or from a language model - and emit PowerPoint for the meeting, PDF for the archive, Draw.io for the wiki, Sprotty for the site.
And **interchange**: PlantUML to Draw.io or PowerPoint, and - the case enterprises actually have, at scale, right now - Visio to Draw.io.

## The thesis

**A slide is a diagram, and admitting it is the entire design.** Everything a deck does that a picture format cannot - connect two boxes, nest a group inside a group, anchor an arrow to an edge, say which architecture element this box stands for - is something the [diagram](https://diagram.models.nasdanika.org/) model already does.
Declaring `Slide extends Diagram` rather than inventing a parallel hierarchy means [semantic mapping](https://docs.nasdanika.org/core/mapping/index.html), [executable diagrams](https://docs.nasdanika.org/core/drawio/index.html), [ELK](https://elk.models.nasdanika.org/) layout, three-way merge, `semanticElements`, markers, and generic model tooling apply to slide 7 of a quarterly review without a line of presentation-specific code.
This model then adds only what a deck has and a diagram does not.

**Decks are where enterprise knowledge goes to stop being data.** The architecture that governs a program, the migration plan, the vendor comparison, the operating model - each exists as a `.pptx` on a shared drive, authoritative and completely opaque.
Nothing can ask which systems a deck mentions, whether the three decks describing the same platform agree, or which of them still refer to a component that was retired last year.
The format is not the obstacle; the absence of a model is.

**The N x N problem is worse for presentations than for diagrams**, because the formats are further apart.
PowerPoint has EMUs, placeholders, and DrawingML; Visio has masters, stencils, and shape data; PlantUML has no coordinates at all; PDF has no editability; Draw.io has style strings.
Pairwise converters between them are written by different people, lose different things, and are impossible to audit because the intermediate state is a parse tree that exists for a few milliseconds.
Here the middle is a real EMF resource: persistable as XMI/JSON/YAML, comparable with [EMF Compare](https://eclipse.dev/emf/compare/), queryable, and inspectable when a conversion goes wrong.

**Small on purpose.** There are no animations, transitions, themes, gradient fills, SmartArt, 3D bevels, or slide timings in this model, and there will not be.
Two reasons. Those things do not survive conversion anyway - a PowerPoint morph transition has no Visio equivalent and no PlantUML equivalent, so modelling it neutrally is modelling a fiction.
And a small metamodel is what makes generation tractable: a template author, a mapping, or a language model can hold fifteen classes in view and produce something structurally valid, which is not true of OOXML.
Notation-specific richness belongs in the notation models above, and in `properties` for everything else.

## Position in the tower

A **rooftop** model sitting directly on [diagram](https://diagram.models.nasdanika.org/), which is itself a rooftop on the [C4](https://c4.models.nasdanika.org/) floor of the [Nasdanika model tower](https://nasdanika.com/models.html).
Nothing in the tower depends on this model, which is what lets it stay thin.
Standing where it does means the whole tower is beneath it: [architecture](https://architecture.models.nasdanika.org/), [threat](https://threat.models.nasdanika.org/), [work](https://work.models.nasdanika.org/), [governance](https://governance.models.nasdanika.org/), [lifecycle](https://lifecycle.models.nasdanika.org/), [seal](https://seal.models.nasdanika.org/), [IAM](https://iam.models.nasdanika.org/), [role](https://role.models.nasdanika.org/), and [nxcore](https://nxcore.models.nasdanika.org/).
A shape on a slide can depict a system, carry its own documentation and owner, be staged, be governed, and be traced back to the file and commit it was loaded from - before any of it is rendered.

### What this model adds to diagram

Four things a diagram does not have and a deck does:

* **Deck-level identity and geometry.** [`Presentation`](references/eClassifiers/Presentation/index.html) with `width`, `height` in points, ordered [`slides`](references/eClassifiers/Presentation/references/eStructuralFeatures/slides/index.html), [`masterSlides`](references/eClassifiers/Presentation/references/eStructuralFeatures/masterSlides/index.html), and `properties`. Points rather than EMUs, pixels, or twips, because a neutral coordinate space is the precondition for a round trip that does not scramble the layout.
* **Running text as structure.** [`TextShape`](references/eClassifiers/TextShape/index.html) contains [`Paragraph`](references/eClassifiers/Paragraph/index.html)s contain [`TextRun`](references/eClassifiers/TextRun/index.html)s. A slide's words are a queryable tree, not a string with markup in it.
* **Masters, and the fact that they are slides.** [`MasterSlide`](references/eClassifiers/MasterSlide/index.html) extends [`Slide`](references/eClassifiers/Slide/index.html), so a master is walked, queried, mapped, and generated by exactly the same code as a slide.
* **Notes.** [`Notes`](references/eClassifiers/Notes/index.html) is the one thing every presentation format has and no diagram format does, and it turns out to be the most useful annotation carrier in the family - see below.

### Fidelity is not the goal

Worth stating plainly, because it is the question every conversion tool gets judged on and usually the wrong one.
A Visio drawing converted through this model will not be pixel-identical in Draw.io, and a generated PowerPoint deck will not look like the one a designer would have made.
What is preserved is what carries meaning: structure, text, topology, geometry, identity, documentation, and the depiction links.
What is dropped is what a different tool would have rendered differently anyway.

The wager is that a team migrating ten thousand Visio drawings cares about the ten thousand, not about the drop shadow on shape 14 - and that a deck whose contents can be queried, diffed, and regenerated is worth more than a deck that is beautiful and inert.
Teams that need pixel fidelity should keep using the tool that produced the pixels; this model is for the cases where the picture has to become data first.

## Competitive landscape

**Format libraries: Apache POI XSLF, Open XML SDK, python-pptx, Aspose.Slides, ODF Toolkit, PDFBox.**
These are the *sources*, not the rivals - the [PowerPoint](https://powerpoint.models.nasdanika.org/), [ODP](https://odp.models.nasdanika.org/), and [PDF](https://pdf.models.nasdanika.org/) models are loaders built on exactly this kind of library.
What each of them gives you is an object tree shaped like its format: excellent for writing one file, useless as a place to keep a presentation estate, and with no concept of the domain element a shape stands for.

**Conversion services and headless office: CloudConvert, GroupDocs, Aspose conversion, LibreOffice `--convert-to`, Visio's own exporters, Draw.io's VSDX import, Lucidchart import.**
The pragmatic incumbent for interchange, and the reason the flagship use case is worth stating carefully.
They are pairwise, one-way, and opaque: there is no intermediate artifact to inspect, correct, validate, enrich, or version, so a conversion that loses shape data loses it silently and unrepeatably.
And the part they lose first is usually the part that mattered - Visio shape data, Draw.io element properties, PowerPoint notes - because it is invisible in the rendered output.

**Deck-as-code: Reveal.js, Marp, Slidev, remark, Deckset, LaTeX Beamer, Quarto, Pandoc.**
Text-first, version-controllable, and genuinely good at what they do, which is producing HTML or PDF from Markdown.
Two limits. The source *is* the artifact: there is no object graph to query, no stable identity for a shape, and cross-references between decks are string matching.
And the output is terminal - a business audience asks for a `.pptx` they can edit, and none of these can produce one, which is where the enterprise conversation with them ends.
They make excellent input formats for a model, exactly as [PlantUML](https://plantuml.models.nasdanika.org/) does here.

**Diagram-as-code: PlantUML, Mermaid, D2, Graphviz, Structurizr DSL.** Family members and sources rather than competitors, for the same reason - the [diagram model](https://diagram.models.nasdanika.org/) carries the longer treatment.
The interesting direction is the one they cannot take themselves: a PlantUML sequence diagram arriving in a deck as *editable shapes and connectors* rather than as an embedded PNG.

**Presentation SaaS and AI deck generators: Canva, Pitch, Beautiful.ai, Prezi, Gamma, Tome, Copilot in PowerPoint, Google Slides with Gemini.**
The fastest way to get a deck, and they produce no data whatsoever.
An AI deck generator writes plausible slides about a topic; there is nothing to validate the result against, no way to require that every system named on a slide exists in the architecture model, no diff between this quarter's deck and last quarter's beyond reading both, and no path from the deck back into any other tool.
The distinction this model draws is between *generating a deck* and *generating a model that a deck is one rendering of* - and the second one can be checked before anybody sees it.

**Eclipse and web rendering: Sprotty, GLSP, GMF notation, Sirius.**
Rendering and editing frameworks, bound to their runtimes and to an editor.
[Sprotty](https://sprotty.models.nasdanika.org/) is a family member on the output side: a way to put a presentation on a web page with clickable, navigable shapes, which is where a generated documentation site wants its slides anyway.

**OMG.** There is a [Diagram Definition](https://www.omg.org/spec/DD/) specification and per-notation DI packages; there is nothing for presentations.
The deck, the most widely produced structured visual artifact in the enterprise, has never had an interchange metamodel at all.

**The actual competitor**, as everywhere else in the tower: a `.pptx` on a shared drive, a Visio library that one retiring architect can read, and a slide that gets rebuilt by hand every time the audience changes.

## What a typed model adds

**Every diagram capability, at no cost.** Because slides are diagrams, `semanticElements` works on slide shapes: a box on a strategy deck can point at the [architecture](https://architecture.models.nasdanika.org/) element it depicts, a [threat](https://threat.models.nasdanika.org/) asset, or a [work](https://work.models.nasdanika.org/) item.
"Which slides mention this system" becomes a `getReferrers` query rather than a search of a file share.
The link is optional throughout - an unmapped shape is still a fully documented, addressable element.

**Text as a tree.** [`Paragraph`](references/eClassifiers/Paragraph/index.html) and [`TextRun`](references/eClassifiers/TextRun/index.html) make the words on a slide addressable: extract every bullet in a deck, translate a presentation by walking runs and writing them back, restyle an estate to a new font, feed the text into a search index or a retrieval corpus, or check that no slide carries a term the legal team retired.
`hyperlink` on a run is what makes a generated deck navigable rather than decorative.

**Notes as the composability carrier.** [`Notes`](references/eClassifiers/Notes/index.html) holds speaker notes, and by convention also a YAML or JSON block parsed on load into diagram `properties` and `semanticElements` bindings, and re-emitted on save.
This is the same technique the [Markdown model](https://markdown.models.nasdanika.org/) uses, and it suits presentations unusually well: every format in the family has a notes field, it is invisible in presentation mode, and it survives a round trip through tools that know nothing about this model.
A deck can therefore be annotated in PowerPoint by someone who has never heard of Ecore, and come back as a mapped model.

**Masters are slides, so branding is a transformation.** Rebranding an estate of decks is a model run over [`masterSlides`](references/eClassifiers/Presentation/references/eStructuralFeatures/masterSlides/index.html) rather than a person opening files.
The same property makes a corporate template a *model* that a generator targets, instead of a `.potx` that a generator has to imitate.

**Connectors are first-class connections.** [`ConnectorShape`](references/eClassifiers/ConnectorShape/index.html) extends diagram `Connection`, with `source`, `target`, waypoints, and port anchoring inherited.
This is the single feature that makes a deck convertible to PlantUML or Mermaid at all: without navigable topology, a slide is a bag of boxes near each other.

**Round-trip mechanics.** `order` for z-order, `rotation`, `flipHorizontal`, `flipVertical`, [`Row`](references/eClassifiers/Row/index.html) and [`Cell`](references/eClassifiers/Cell/index.html) with `columnSpan` and `rowSpan` - the unglamorous attributes that decide whether a converted deck opens correctly or opens scrambled.
`hidden` on a slide is kept because it carries intent: the backup slides, the appendix, the version for the other audience.

**Extension without metamodel change.** Inherited `properties` and `tags` absorb whatever a notation carries that this model does not - a PowerPoint placeholder index, a Visio shape-data row, a Draw.io style string, a processor URI, a mapping rule.
Supporting a new format is loader and generator work, not a metamodel release.

**Provenance.** nxcore `Marked` gives every element `markers`, so a shape traces back to the file, page, branch, and commit it came from - which is what makes a bulk migration reviewable rather than an act of faith.

## Applications

**Visio to Draw.io - the flagship.**
Enterprises hold enormous Visio estates: network diagrams, process flows, floor plans, data flows, integration maps, accumulated over decades and locked behind per-seat licensing that most of the people who need to *read* them do not have.
The migration is usually attempted file by file, through a partial importer, and abandoned.
Through this model it is a batch job: load the drawings, keep shape data as `properties` and depiction links, emit Draw.io, review the result as a model diff, and publish the estate as a searchable site.
What arrives on the other side is not merely a different file format - it is the first time the estate has been queryable.
The same pipeline runs Visio to PowerPoint, or Visio to a documentation site, because the middle is shared.

**Format-independent generation.**
One generator, many emitters.
A quarterly architecture review generated from the [architecture](https://architecture.models.nasdanika.org/) model comes out as PowerPoint for the meeting, PDF for the record, Draw.io for the wiki, and Sprotty for the portal - one model, four renderings, no divergence between them.
The alternative, which is what happens today, is four artifacts that agreed with each other on the day they were made.

**AI-generated presentations against a small model.**
A fifteen-class typed model is a far better contract for a language model than OOXML or mxGraph XML: it fits in a prompt, it has documented semantics, and the output can be *validated* - structurally sound, every shape depicting an element that exists in an approved model, no slide referencing a retired system - before anything renders.
The loop becomes: model in, model out, validate, then render to whatever format the audience wants.
Review happens on the model diff rather than by clicking through slides.
See the [agent](https://agent.models.nasdanika.org/) and [AI governance](https://ai.governance.models.nasdanika.org/) models for the surrounding machinery; this model is the artifact the agent is allowed to produce.

**Mining the deck estate.**
The reverse direction, and the one with the most latent value.
The decks an organization already has document its systems, its programs, its vendors, and its intentions, in a form no tool can read.
Load them, extract the shapes and the text and the connectors, and mine them into [architecture](https://architecture.models.nasdanika.org/), [work](https://work.models.nasdanika.org/), or [threat](https://threat.models.nasdanika.org/) models - the same posture the tower takes with legacy code and legacy documents.
Even the shallow result is useful: what is mentioned, how often, by whom, and where the descriptions disagree.

**Presentations as documentation sites.**
Every slide a page, every shape an anchor, notes as page content, connectors as links, source markers pointing back at the file - generated with the same stack that produced this site.
The [drawio-site template](https://github.com/Nasdanika-Templates/drawio-site) is this application in ready-to-fork form for Draw.io; on this model the same pipeline runs over a deck or a Visio document.
A deck written to be presented once becomes something that is read all year.

**One deck, many audiences.**
Decks get rebuilt by hand for each audience more than any other artifact - the board version, the engineering version, the client version, the version with the numbers taken out.
With [seal](https://seal.models.nasdanika.org/) and [IAM](https://iam.models.nasdanika.org/) below, audience becomes a rendering decision over one model: slides and shapes carry access constraints, and the emitted deck contains what the recipient is entitled to see.
`hidden` slides and the notes block stop being a manual discipline.

**Executable presentations.**
The [Drawio](https://docs.nasdanika.org/core/drawio/index.html) module already treats a diagram as a computational structure - elements carry processor URIs, the graph is wired into Java processors, the picture runs.
Because slides are diagrams, that machinery lifts unchanged: slides as pages, shapes as processors, connectors as message paths, and the deck stays a deck that a business audience can open.
An executable PowerPoint is not a joke in this arrangement; it is the same interpreter with a different loader.

**Review, diff, and merge.**
A model-level diff answers "what changed in this deck" with added slides and re-pointed connections instead of two PDFs side by side, which makes a deck reviewable in a pull request.
Three-way merge - the previous generation as base, the fresh generation as one side, the human-edited deck as the other - is what keeps a *generated* deck alive past its second run, so the grouping, the annotations, and the layout somebody added by hand are not flattened every time the source changes.
The [diagram model](https://diagram.models.nasdanika.org/) carries the full treatment, including the Git merge driver; it applies here without modification.

**Layout as a service.**
With bounds, ports, waypoints, and topology in a neutral model, [ELK](https://elk.models.nasdanika.org/) lays out the contents of a slide - which is what makes generated decks readable rather than a grid of boxes, and what makes a merged deck open correctly instead of needing an hour of tidying.

**Diagram-as-code, delivered as a deck.**
A team authors in PlantUML or Mermaid because text belongs in version control, and the audience receives editable PowerPoint shapes.
Both sides get what they want, and neither side is exporting PNGs.

## Model overview

| Area | Types |
|------|-------|
| Deck | [Presentation](references/eClassifiers/Presentation/index.html) - `width`/`height` in points, ordered [slides](references/eClassifiers/Presentation/references/eStructuralFeatures/slides/index.html), [masterSlides](references/eClassifiers/Presentation/references/eStructuralFeatures/masterSlides/index.html), `properties` |
| Slides | [Slide](references/eClassifiers/Slide/index.html) (extends diagram `Diagram`) - `title`, [master](references/eClassifiers/Slide/references/eStructuralFeatures/master/index.html), `hidden`, [notes](references/eClassifiers/Slide/references/eStructuralFeatures/notes/index.html); [MasterSlide](references/eClassifiers/MasterSlide/index.html); [Notes](references/eClassifiers/Notes/index.html) - speaker notes and the annotation carrier |
| Shapes | [Shape](references/eClassifiers/Shape/index.html) (abstract, extends diagram `Node`) - `order`, `rotation`, `flipHorizontal`, `flipVertical`; [GroupShape](references/eClassifiers/GroupShape/index.html), [ImageShape](references/eClassifiers/ImageShape/index.html), [MediaShape](references/eClassifiers/MediaShape/index.html) |
| Text | [TextShape](references/eClassifiers/TextShape/index.html), [Paragraph](references/eClassifiers/Paragraph/index.html) (`indentLevel`, `alignment`), [TextRun](references/eClassifiers/TextRun/index.html) (font, weight, `color`, `hyperlink`) |
| Tables | [TableShape](references/eClassifiers/TableShape/index.html), [Row](references/eClassifiers/Row/index.html), [Cell](references/eClassifiers/Cell/index.html) (`columnSpan`, `rowSpan`) |
| Connectors | [ConnectorShape](references/eClassifiers/ConnectorShape/index.html) (extends diagram `Connection` - `source`, `target`, `waypoints`) |
| Reused, not redefined | diagram `DiagramElement` (`tags`, `properties`, `semanticElements`, `children` keyed by `id`), `Node` bounds and ports, `Layer`; nxcore identity, documentation, `uris`, `icon`, and markers; everything from C4 down available for depiction |
| Deliberately absent | animations, transitions, themes, gradients, SmartArt, timings - notation concerns, carried by the models above or by `properties` |
| In progress | loaders and generators for [Draw.io](https://drawio.models.nasdanika.org/), [Visio](https://visio.models.nasdanika.org/), [PowerPoint](https://powerpoint.models.nasdanika.org/), [PlantUML](https://plantuml.models.nasdanika.org/), [ODP](https://odp.models.nasdanika.org/), [PDF](https://pdf.models.nasdanika.org/), and [Sprotty](https://sprotty.models.nasdanika.org/); the notes annotation-block convention; slide layouts and placeholder semantics |

## Relation to other Nasdanika work

**The floor below.** [Diagram](https://diagram.models.nasdanika.org/) supplies the whole of the notation vocabulary - elements, nodes, ports, connections, layers, depiction links, and the containment tree - and through it the [C4](https://c4.models.nasdanika.org/) floor and everything under it.
This model adds the deck.

**The floors above.** [Draw.io](https://drawio.models.nasdanika.org/) with mxGraph styles and magic properties, [Visio](https://visio.models.nasdanika.org/) with masters and stencils, [PowerPoint](https://powerpoint.models.nasdanika.org/) with layouts and placeholders, [PlantUML](https://plantuml.models.nasdanika.org/) with diagram kinds and skin parameters, [ODP](https://odp.models.nasdanika.org/) and [PDF](https://pdf.models.nasdanika.org/) for the open and archival ends, and [Sprotty](https://sprotty.models.nasdanika.org/) for the web.
Each holds only what makes it different, which is possible only because this model holds what they share.

**Adjacent models.** [ELK](https://elk.models.nasdanika.org/) for layout, [Markdown](https://markdown.models.nasdanika.org/) as the other authoring surface - text where text is natural, slides where slides are - [Excel](https://excel.models.nasdanika.org/) for tabular input, and [agent](https://agent.models.nasdanika.org/) with [AI governance](https://ai.governance.models.nasdanika.org/) for the generation side.

**Tooling.** Models are loaded from their native formats, authored in [Groovy DSL](https://docs.nasdanika.org/core/groovy/index.html) or as XMI/YAML/JSON, wired through the [capability framework](https://docs.nasdanika.org/core/capability/index.html), transformed with [semantic mapping](https://docs.nasdanika.org/core/mapping/index.html) or [NSML](https://github.com/Nasdanika/nasdanika-semantic-mapping-language), and documented with the generation stack that built this site.

## Resources

* [Nasdanika Models](https://nasdanika.com/models.html)
* [docs.nasdanika.org](https://docs.nasdanika.org/index.html)
* [Nasdanika Medium publication](https://medium.com/nasdanika/all)
