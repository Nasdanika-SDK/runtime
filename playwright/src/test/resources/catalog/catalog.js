// tag::script[]
const list = document.getElementById('books');
const details = document.getElementById('details');

async function search(text) {
  const response = await fetch('/data/books?q=' + encodeURIComponent(text));
  const books = await response.json();
  list.replaceChildren(...books.map(book => {
    const link = document.createElement('a');
    link.href = '#' + book.id;
    link.textContent = book.title;
    link.addEventListener('click', () => show(book.id));
    const item = document.createElement('li');
    item.append(link);
    return item;
  }));
}

async function show(id) {
  const response = await fetch('/data/books/' + id);
  const book = await response.json();
  document.getElementById('book-title').textContent = book.title;
  document.getElementById('book-author').textContent = book.author;
  details.hidden = false;
}

document.getElementById('title').addEventListener('input', event => search(event.target.value));
search('').then(() => console.log('Catalog ready'));
// end::script[]
