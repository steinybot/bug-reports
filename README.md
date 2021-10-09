# Bug Reports

This reproduces the bug for https://github.com/vitejs/vite/issues/5238.

## Steps to Reproduce

1. `npm install`
1. `npm run build`
1. `node dist/assets/todo.d8c4cd41.js`

## Expected

```text
todo.html
```

## Actual

```text
data:text/html;base64,PCFET0NUWVBFIGh0bWw+CjxodG1sIGxhbmc9ImVuIj4KPGhlYWQ+CiAgICA8bWV0YSBjaGFyc2V0PSJVVEYtOCIvPgogICAgPHRpdGxlPlRPRE88L3RpdGxlPgo8L2hlYWQ+Cjxib2R5PgpUT0RPCjwvYm9keT4KPC9odG1sPgoK
```
