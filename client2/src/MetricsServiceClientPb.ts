/**
 * @fileoverview gRPC-Web generated client stub for com.lightbend.console.api
 * @enhanceable
 * @public
 */

// GENERATED CODE -- DO NOT EDIT!


import * as grpcWeb from 'grpc-web';

import {
  GetMetricsRequest,
  MetricsResponse} from 'metrics_pb';

export class MetricsProtoServiceClient {
  client_: grpcWeb.AbstractClientBase;
  hostname_: string;
  credentials_: null | { [index: string]: string; };
  options_: null | { [index: string]: string; };

  constructor (hostname: string,
               credentials?: null | { [index: string]: string; },
               options?: null | { [index: string]: string; }) {
    if (!options) options = {};
    if (!credentials) credentials = {};
    options['format'] = 'binary';

    this.client_ = new grpcWeb.GrpcWebClientBase(options);
    this.hostname_ = hostname;
    this.credentials_ = credentials;
    this.options_ = options;
  }

  methodInfoGetMetrics = new grpcWeb.AbstractClientBase.MethodInfo(
    MetricsResponse,
    (request: GetMetricsRequest) => {
      return request.serializeBinary();
    },
    MetricsResponse.deserializeBinary
  );

  getMetrics(
    request: GetMetricsRequest,
    metadata: grpcWeb.Metadata | null,
    callback: (err: grpcWeb.Error,
               response: MetricsResponse) => void) {
    return this.client_.rpcCall(
      this.hostname_ +
        '/com.lightbend.console.api.MetricsProtoService/GetMetrics',
      request,
      metadata || {},
      this.methodInfoGetMetrics,
      callback);
  }

}

