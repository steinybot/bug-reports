const {defineConfig} = require("vite");

module.exports = defineConfig({
  build: {
    rollupOptions: {
      input: 'todo.js',
    }
  }
})
