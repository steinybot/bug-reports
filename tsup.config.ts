import { defineConfig, Options } from 'tsup';

function options(overrides: Partial<Options>): Options {
  return {
    bundle: false,
    clean: true,
    // For some reason this creates a weird mix of bundled and non-bundled definitions.
    // We will have to use tsc directly for these instead.
    dts: false,
    outDir: 'dist',
    sourcemap: false,
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
