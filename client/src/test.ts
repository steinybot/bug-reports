import * as grpcWeb from 'grpc-web';
import {MetricsProtoServiceClient} from 'com/lightbend/console/api/MetricsServiceClientPb';
import {GetMetricsRequest, MetricsResponse} from 'com/lightbend/console/api/metrics_pb';

const metricsService = new MetricsProtoServiceClient('http://localhost:8080', null, null);

const request = new GetMetricsRequest();
request.setQuery('up');

const call = metricsService.getMetrics(request, {'custom-header-1': 'value1'},
    (err: grpcWeb.Error, response: MetricsResponse) => {
        console.log(response.getSuccess());
    });
call.on('status', (status: grpcWeb.Status) => {
    // ...
});
