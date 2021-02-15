const HtmlWebpackPlugin = require('html-webpack-plugin');

const path = require('path');

module.exports = {
  devServer: {
    open: 'Google Chrome'
  },
  entry: './src/index.js',
  externals: {
    fs: 'fs',
    path: 'path'
  },
  mode: 'development',
  output: {
    path: path.resolve(__dirname, 'dist'),
    filename: 'bundle.js',
  },
  plugins: [
    new HtmlWebpackPlugin()
  ],
};
