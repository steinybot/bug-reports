import * as jspb from "google-protobuf"

export class GetMetricsRequest extends jspb.Message {
  getQuery(): string;
  setQuery(value: string): void;

  getTime(): string;
  setTime(value: string): void;

  getTimeout(): string;
  setTimeout(value: string): void;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): GetMetricsRequest.AsObject;
  static toObject(includeInstance: boolean, msg: GetMetricsRequest): GetMetricsRequest.AsObject;
  static serializeBinaryToWriter(message: GetMetricsRequest, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): GetMetricsRequest;
  static deserializeBinaryFromReader(message: GetMetricsRequest, reader: jspb.BinaryReader): GetMetricsRequest;
}

export namespace GetMetricsRequest {
  export type AsObject = {
    query: string,
    time: string,
    timeout: string,
  }
}

export class MetricsResponse extends jspb.Message {
  getSuccess(): boolean;
  setSuccess(value: boolean): void;

  getMatrix(): MatrixResult | undefined;
  setMatrix(value?: MatrixResult): void;
  hasMatrix(): boolean;
  clearMatrix(): void;

  getVector(): VectorResult | undefined;
  setVector(value?: VectorResult): void;
  hasVector(): boolean;
  clearVector(): void;

  getScalar(): ScalarDataPoint | undefined;
  setScalar(value?: ScalarDataPoint): void;
  hasScalar(): boolean;
  clearScalar(): void;

  getString(): StringDataPoint | undefined;
  setString(value?: StringDataPoint): void;
  hasString(): boolean;
  clearString(): void;

  getErrorType(): string;
  setErrorType(value: string): void;

  getError(): string;
  setError(value: string): void;

  getWarningsList(): Array<string>;
  setWarningsList(value: Array<string>): void;
  clearWarningsList(): void;
  addWarnings(value: string, index?: number): void;

  getDataCase(): MetricsResponse.DataCase;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): MetricsResponse.AsObject;
  static toObject(includeInstance: boolean, msg: MetricsResponse): MetricsResponse.AsObject;
  static serializeBinaryToWriter(message: MetricsResponse, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): MetricsResponse;
  static deserializeBinaryFromReader(message: MetricsResponse, reader: jspb.BinaryReader): MetricsResponse;
}

export namespace MetricsResponse {
  export type AsObject = {
    success: boolean,
    matrix?: MatrixResult.AsObject,
    vector?: VectorResult.AsObject,
    scalar?: ScalarDataPoint.AsObject,
    string?: StringDataPoint.AsObject,
    errorType: string,
    error: string,
    warningsList: Array<string>,
  }

  export enum DataCase { 
    DATA_NOT_SET = 0,
    MATRIX = 2,
    VECTOR = 3,
    SCALAR = 4,
    STRING = 5,
  }
}

export class MatrixResult extends jspb.Message {
  getSeriesList(): Array<Series>;
  setSeriesList(value: Array<Series>): void;
  clearSeriesList(): void;
  addSeries(value?: Series, index?: number): Series;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): MatrixResult.AsObject;
  static toObject(includeInstance: boolean, msg: MatrixResult): MatrixResult.AsObject;
  static serializeBinaryToWriter(message: MatrixResult, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): MatrixResult;
  static deserializeBinaryFromReader(message: MatrixResult, reader: jspb.BinaryReader): MatrixResult;
}

export namespace MatrixResult {
  export type AsObject = {
    seriesList: Array<Series.AsObject>,
  }
}

export class Series extends jspb.Message {
  getLabelsMap(): jspb.Map<string, string>;
  clearLabelsMap(): void;

  getPointsList(): Array<ScalarDataPoint>;
  setPointsList(value: Array<ScalarDataPoint>): void;
  clearPointsList(): void;
  addPoints(value?: ScalarDataPoint, index?: number): ScalarDataPoint;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): Series.AsObject;
  static toObject(includeInstance: boolean, msg: Series): Series.AsObject;
  static serializeBinaryToWriter(message: Series, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): Series;
  static deserializeBinaryFromReader(message: Series, reader: jspb.BinaryReader): Series;
}

export namespace Series {
  export type AsObject = {
    labelsMap: Array<[string, string]>,
    pointsList: Array<ScalarDataPoint.AsObject>,
  }
}

export class VectorResult extends jspb.Message {
  getSamplesList(): Array<Sample>;
  setSamplesList(value: Array<Sample>): void;
  clearSamplesList(): void;
  addSamples(value?: Sample, index?: number): Sample;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): VectorResult.AsObject;
  static toObject(includeInstance: boolean, msg: VectorResult): VectorResult.AsObject;
  static serializeBinaryToWriter(message: VectorResult, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): VectorResult;
  static deserializeBinaryFromReader(message: VectorResult, reader: jspb.BinaryReader): VectorResult;
}

export namespace VectorResult {
  export type AsObject = {
    samplesList: Array<Sample.AsObject>,
  }
}

export class Sample extends jspb.Message {
  getLabelsMap(): jspb.Map<string, string>;
  clearLabelsMap(): void;

  getPoint(): ScalarDataPoint | undefined;
  setPoint(value?: ScalarDataPoint): void;
  hasPoint(): boolean;
  clearPoint(): void;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): Sample.AsObject;
  static toObject(includeInstance: boolean, msg: Sample): Sample.AsObject;
  static serializeBinaryToWriter(message: Sample, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): Sample;
  static deserializeBinaryFromReader(message: Sample, reader: jspb.BinaryReader): Sample;
}

export namespace Sample {
  export type AsObject = {
    labelsMap: Array<[string, string]>,
    point?: ScalarDataPoint.AsObject,
  }
}

export class ScalarDataPoint extends jspb.Message {
  getTimestamp(): number;
  setTimestamp(value: number): void;

  getValue(): number;
  setValue(value: number): void;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): ScalarDataPoint.AsObject;
  static toObject(includeInstance: boolean, msg: ScalarDataPoint): ScalarDataPoint.AsObject;
  static serializeBinaryToWriter(message: ScalarDataPoint, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): ScalarDataPoint;
  static deserializeBinaryFromReader(message: ScalarDataPoint, reader: jspb.BinaryReader): ScalarDataPoint;
}

export namespace ScalarDataPoint {
  export type AsObject = {
    timestamp: number,
    value: number,
  }
}

export class StringDataPoint extends jspb.Message {
  getTimestamp(): number;
  setTimestamp(value: number): void;

  getValue(): string;
  setValue(value: string): void;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): StringDataPoint.AsObject;
  static toObject(includeInstance: boolean, msg: StringDataPoint): StringDataPoint.AsObject;
  static serializeBinaryToWriter(message: StringDataPoint, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): StringDataPoint;
  static deserializeBinaryFromReader(message: StringDataPoint, reader: jspb.BinaryReader): StringDataPoint;
}

export namespace StringDataPoint {
  export type AsObject = {
    timestamp: number,
    value: string,
  }
}

