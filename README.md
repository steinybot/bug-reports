# Bug Reports

This reproduces the bug for https://github.com/oven-sh/bun/issues/7482.

## Steps to Reproduce

1. Run `bun install --check-files`
1. Notice that there are no warnings
1. Run `yarn install --check-files`
1. Notice how it shows the missing peer dependencies as expected
