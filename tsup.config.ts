import { defineConfig, Options } from 'tsup';

function options(overrides: Partial<Options>): Options {
  return {
    bundle: false,
    clean: true,
    dts: false,
    outDir: 'dist',
    ...overrides,
  };
}

export default defineConfig([
  options({
    entry: [
      'src/index.ts',
      'src/volume.ts'
    ],
    format: ['esm'],
    outExtension: () => { return {js: '.js'} }
  }),
]);
