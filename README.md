# Bug Reports

This reproduces the bug for TODO.

```shell script
kustomize build overlays/dev
```

```text
Error: accumulating resources: recursed accumulation of path '/Users/jason/source/bug-reports/overlays/common/node-ports': no matches for OriginalId ~G_v1_Service|lightbend-console|lightbend-console-api; no matches for CurrentId ~G_v1_Service|lightbend-console|lightbend-console-api; failed to find unique target for patch ~G_v1_Service|lightbend-console-api
```
