# Bug Reports

This reproduces the bug for TODO.

```shell script
kustomize build overlays/dev
```

```text
Error: accumulating resources: recursed accumulation of path '/Users/jason/source/bug-reports/overlays/common/node-port': no matches for OriginalId ~G_v1_Service|~X|api; no matches for CurrentId ~G_v1_Service|~X|api; failed to find unique target for patch ~G_v1_Service|api
```
