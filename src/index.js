import { SourceMapConsumer } from 'source-map';

const main = document.createElement('div');
document.body.appendChild(main);
addParagraph('Initializing SourceMapConsumer...');

window.onerror = (message, source, lineno, colno, error) => {
  addError('Message: ' + message);
  addError('Source: ' + source);
  addError('Line: ' + lineno);
  addError('Column: ' + colno);
  addError('Error: ' + JSON.stringify(error));
};

SourceMapConsumer.initialize({
  'lib/mappings.wasm': 'https://unpkg.com/source-map@0.7.3/lib/mappings.wasm'
});

const sourceMapUrl = 'source.map';

for (let i = 0; i < 50; i++) {
  addParagraph('Loading (' + i + ') ' + sourceMapUrl + '...');
  loadSourceMap(sourceMapUrl).then(getPosition, failedRequest => {
    addError('Status: ' + failedRequest.status);
    addError('Response Text: ' + failedRequest.responseText);
  }).catch(error => {
    addError('Error: ' + error);
  });
};

function loadSourceMap(sourceMapUrl) {
  return new Promise((resolve, reject) => {
    const httpRequest = new XMLHttpRequest();
    httpRequest.onreadystatechange = processResponse(httpRequest, resolve, reject);
    httpRequest.open('GET', sourceMapUrl, true);
    httpRequest.send();
  });
};

function processResponse(httpRequest, resolve, reject) {
  return () => {
    if (httpRequest.readyState === XMLHttpRequest.DONE) {
      if (httpRequest.status === 200) {
        const rawSourceMap = JSON.parse(httpRequest.responseText);
        resolve(new SourceMapConsumer(rawSourceMap));
      } else {
        reject(httpRequest);
      }
    }
  };
}

function getPosition(consumer) {
  const position = consumer.originalPositionFor({ line: 74489, column: 14 });
  addParagraph('Position: ' + JSON.stringify(position));
}

function addError(text) {
  addParagraph(text, 'color:red');
}

function addParagraph(text, style) {
  const styleAttribute = style ? ' style="' + style + '"' : '';
  main.innerHTML += '<p' + styleAttribute + '>' + text + '</p>';
}
