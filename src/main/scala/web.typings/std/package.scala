package web.typings

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object std {
  
  type AlgorithmIdentifier = java.lang.String | org.scalajs.dom.Algorithm
  
  type ArrayBufferLike = js.typedarray.ArrayBuffer
  
  type AudioWorklet = web.typings.std.Worklet
  
  type AutoKeyword = web.typings.std.stdStrings.auto
  
  type BigInteger = js.typedarray.Uint8Array
  
  type BlobCallback = js.Function1[/* blob */ org.scalajs.dom.Blob | scala.Null, scala.Unit]
  
  type BlobPart = web.typings.std.BufferSource | org.scalajs.dom.Blob | java.lang.String
  
  type BodyInit = org.scalajs.dom.Blob | web.typings.std.BufferSource | org.scalajs.dom.FormData | web.typings.std.URLSearchParams | org.scalajs.dom.ReadableStream[js.typedarray.Uint8Array] | java.lang.String
  
  type BufferSource = js.typedarray.ArrayBufferView | js.typedarray.ArrayBuffer
  
  /** A CDATA section that can be used within XML to include extended portions of unescaped text. The symbols < and & don’t need escaping as they normally do when inside a CDATA section. */
  type CDATASection = org.scalajs.dom.Text
  
  type COSEAlgorithmIdentifier = scala.Double
  
  /** An object representing a single CSS @supports at-rule. It implements the CSSConditionRule interface, and therefore the CSSRule and CSSGroupingRule interfaces with a type value of 12 (CSSRule.SUPPORTS_RULE). */
  type CSSSupportsRule = web.typings.std.CSSConditionRule
  
  /* Rewritten from type alias, can be one of: 
    - `web.typings`.std.HTMLOrSVGImageElement
    - org.scalajs.dom.HTMLVideoElement
    - org.scalajs.dom.HTMLCanvasElement
    - `web.typings`.std.ImageBitmap
    - `web.typings`.std.OffscreenCanvas
  */
  type CanvasImageSource = web.typings.std._CanvasImageSource | web.typings.std.HTMLOrSVGImageElement | org.scalajs.dom.HTMLVideoElement | org.scalajs.dom.HTMLCanvasElement
  
  /**
    * Convert first character of string literal type to uppercase
    */
  type Capitalize[S /* <: java.lang.String */] = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify intrinsic */ scala.Any
  
  /** The ChannelMergerNode interface, often used in conjunction with its opposite, ChannelSplitterNode, reunites different mono inputs into a single output. Each input is used to fill a channel of the output. This is useful for accessing each channels separately, e.g. for performing channel mixing where gain must be separately controlled on each channel. */
  type ChannelMergerNode = org.scalajs.dom.AudioNode
  
  /** The ChannelSplitterNode interface, often used in conjunction with its opposite, ChannelMergerNode, separates the different channels of an audio source into a set of mono outputs. This is useful for accessing each channel separately, e.g. for performing channel mixing where gain must be separately controlled on each channel. */
  type ChannelSplitterNode = org.scalajs.dom.AudioNode
  
  type ClassDecorator = js.Function1[/* target */ js.Function, js.Function | scala.Unit]
  
  /** Textual notations within markup; although it is generally not visually shown, such comments are available to be read in the source view. */
  type Comment = org.scalajs.dom.CharacterData
  
  type ConstrainBoolean = scala.Boolean | web.typings.std.ConstrainBooleanParameters
  
  type ConstrainDOMString = java.lang.String | js.Array[java.lang.String] | web.typings.std.ConstrainDOMStringParameters
  
  type ConstrainDouble = scala.Double | web.typings.std.ConstrainDoubleRange
  
  type ConstrainULong = scala.Double | web.typings.std.ConstrainULongRange
  
  type DOMHighResTimeStamp = scala.Double
  
  /** Used by the dataset HTML attribute to represent data for custom attributes added to elements. */
  type DOMStringMap = /* standard dom */
  org.scalablytyped.runtime.StringDictionary[js.UndefOr[java.lang.String]]
  
  type DOMTimeStamp = scala.Double
  
  type DecodeErrorCallback = js.Function1[/* error */ org.scalajs.dom.DOMException, scala.Unit]
  
  type DecodeSuccessCallback = js.Function1[/* decodedData */ org.scalajs.dom.AudioBuffer, scala.Unit]
  
  type DocumentTimeline = web.typings.std.AnimationTimeline
  
  /** @deprecated Directly use HTMLElementTagNameMap or SVGElementTagNameMap as appropriate, instead. */
  type ElementTagNameMap = web.typings.std.HTMLElementTagNameMap with (web.typings.std.Pick[
    web.typings.std.SVGElementTagNameMap, 
    web.typings.std.Exclude[
      /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 57, starting with `web.typings`.std.stdStrings.a, `web.typings`.std.stdStrings.circle, `web.typings`.std.stdStrings.clipPath */ scala.Any, 
      /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 118, starting with `web.typings`.std.stdStrings.a, `web.typings`.std.stdStrings.abbr, `web.typings`.std.stdStrings.address */ scala.Any
    ]
  ])
  
  type EvalError = js.Error
  
  type EventHandlerNonNull = js.Function1[/* event */ org.scalajs.dom.Event, scala.Any]
  
  type EventListener = js.Function1[/* evt */ org.scalajs.dom.Event, scala.Unit]
  
  type EventListenerOrEventListenerObject = web.typings.std.EventListener | web.typings.std.EventListenerObject
  
  /**
    * Exclude from T those types that are assignable to U
    */
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    T extends U ? never : T
    }}}
    */
  type Exclude[T, U] = T
  
  /**
    * Extract from T those types that are assignable to U
    */
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    T extends U ? T : never
    }}}
    */
  type Extract[T, U] = T
  
  type Float32List = js.typedarray.Float32Array | js.Array[web.typings.std.GLfloat]
  
  type ForEachCallback = js.Function2[
    /* keyId */ js.typedarray.Int8Array | js.typedarray.Int16Array | js.typedarray.Int32Array | js.typedarray.Uint8Array | js.typedarray.Uint16Array | js.typedarray.Uint32Array | js.typedarray.Uint8ClampedArray | js.typedarray.Float32Array | js.typedarray.Float64Array | js.typedarray.DataView | js.typedarray.ArrayBuffer | scala.Null, 
    /* status */ web.typings.std.MediaKeyStatus, 
    scala.Unit
  ]
  
  type FormDataEntryValue = org.scalajs.dom.File | java.lang.String
  
  type FrameRequestCallback = js.Function1[/* time */ scala.Double, scala.Unit]
  
  type FunctionStringCallback = js.Function1[/* data */ java.lang.String, scala.Unit]
  
  type GLbitfield = scala.Double
  
  type GLboolean = scala.Boolean
  
  type GLclampf = scala.Double
  
  type GLenum = scala.Double
  
  type GLfloat = scala.Double
  
  type GLint = scala.Double
  
  type GLint64 = scala.Double
  
  type GLintptr = scala.Double
  
  type GLsizei = scala.Double
  
  type GLsizeiptr = scala.Double
  
  type GLuint = scala.Double
  
  type GLuint64 = scala.Double
  
  type GamepadHapticActuatorType = web.typings.std.stdStrings.vibration
  
  type HTMLOrSVGImageElement = org.scalajs.dom.HTMLImageElement | org.scalajs.dom.SVGImageElement
  
  type HTMLOrSVGScriptElement = org.scalajs.dom.HTMLScriptElement | org.scalajs.dom.SVGScriptElement
  
  type HashAlgorithmIdentifier = web.typings.std.AlgorithmIdentifier
  
  type HeadersInit = org.scalajs.dom.Headers | js.Array[js.Array[java.lang.String]] | (web.typings.std.Record[java.lang.String, java.lang.String])
  
  type IDBArrayKey = js.Array[web.typings.std.IDBValidKey]
  
  type IDBKeyPath = java.lang.String
  
  /** 
  NOTE: Rewritten from type alias:
  {{{
  type IDBValidKey = number | string | std.Date | std.BufferSource | std.IDBArrayKey
  }}}
  to avoid circular code involving: 
  - std.IDBArrayKey
  - std.IDBValidKey
  */
  type IDBValidKey = scala.Double | java.lang.String | js.Date | web.typings.std.BufferSource | scala.Any
  
  type ImageBitmapSource = web.typings.std.CanvasImageSource | org.scalajs.dom.Blob | org.scalajs.dom.ImageData
  
  type Int32List = js.typedarray.Int32Array | js.Array[web.typings.std.GLint]
  
  type IntersectionObserverCallback = js.Function2[
    /* entries */ js.Array[web.typings.std.IntersectionObserverEntry], 
    /* observer */ web.typings.std.IntersectionObserver, 
    scala.Unit
  ]
  
  type LineAndPositionSetting = scala.Double | web.typings.std.AutoKeyword
  
  /**
    * Convert string literal type to lowercase
    */
  type Lowercase[S /* <: java.lang.String */] = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify intrinsic */ scala.Any
  
  type MSCredentialType = web.typings.std.stdStrings.FIDO_2_0
  
  type MSLaunchUriCallback = js.Function0[scala.Unit]
  
  type MediaProvider = org.scalajs.dom.MediaStream | web.typings.std.MediaSource | org.scalajs.dom.Blob
  
  type MediaStreamTrackAudioSourceNode = org.scalajs.dom.AudioNode
  
  type MessageEventSource = org.scalajs.dom.Window | org.scalajs.dom.MessagePort | org.scalajs.dom.ServiceWorker
  
  type MethodDecorator = js.Function3[
    /* target */ js.Object, 
    /* propertyKey */ java.lang.String | js.Symbol, 
    /* descriptor */ web.typings.std.TypedPropertyDescriptor[scala.Any], 
    web.typings.std.TypedPropertyDescriptor[scala.Any] | scala.Unit
  ]
  
  /** @deprecated */
  type MouseWheelEvent = org.scalajs.dom.WheelEvent
  
  type MutationCallback = js.Function2[
    /* mutations */ js.Array[org.scalajs.dom.MutationRecord], 
    /* observer */ org.scalajs.dom.MutationObserver, 
    scala.Unit
  ]
  
  type NamedCurve = java.lang.String
  
  type NavigatorUserMediaErrorCallback = js.Function1[/* error */ web.typings.std.MediaStreamError, scala.Unit]
  
  type NavigatorUserMediaSuccessCallback = js.Function1[/* stream */ org.scalajs.dom.MediaStream, scala.Unit]
  
  /**
    * Exclude null and undefined from T
    */
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    T extends null | undefined ? never : T
    }}}
    */
  type NonNullable[T] = T
  
  type NotificationPermissionCallback = js.Function1[/* permission */ web.typings.std.NotificationPermission, scala.Unit]
  
  /* Rewritten from type alias, can be one of: 
    - `web.typings`.std.OffscreenCanvasRenderingContext2D
    - `web.typings`.std.ImageBitmapRenderingContext
    - org.scalajs.dom.WebGLRenderingContext
    - `web.typings`.std.WebGL2RenderingContext
  */
  type OffscreenRenderingContext = web.typings.std._OffscreenRenderingContext | org.scalajs.dom.WebGLRenderingContext
  
  /**
    * Construct a type with the properties of T except for those in type K.
    */
  type Omit[T, K /* <: /* keyof any */ java.lang.String */] = web.typings.std.Pick[T, web.typings.std.Exclude[/* keyof T */ java.lang.String, K]]
  
  /**
    * Removes the 'this' parameter from a function type.
    */
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    unknown extends std.ThisParameterType<T> ? T : T extends (args : infer A): infer R ? (args : A): R : T
    }}}
    */
  type OmitThisParameter[T] = T
  
  type OnBeforeUnloadEventHandler = web.typings.std.OnBeforeUnloadEventHandlerNonNull | scala.Null
  
  type OnBeforeUnloadEventHandlerNonNull = js.Function1[/* event */ org.scalajs.dom.Event, java.lang.String | scala.Null]
  
  type OnErrorEventHandler = web.typings.std.OnErrorEventHandlerNonNull | scala.Null
  
  type OnErrorEventHandlerNonNull = js.Function5[
    /* event */ org.scalajs.dom.Event | java.lang.String, 
    /* source */ js.UndefOr[java.lang.String], 
    /* lineno */ js.UndefOr[scala.Double], 
    /* colno */ js.UndefOr[scala.Double], 
    /* error */ js.UndefOr[js.Error], 
    scala.Any
  ]
  
  type ParameterDecorator = js.Function3[
    /* target */ js.Object, 
    /* propertyKey */ java.lang.String | js.Symbol, 
    /* parameterIndex */ scala.Double, 
    scala.Unit
  ]
  
  /**
    * Make all properties in T optional
    */
  /** NOTE: Mapped type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/mapped-types.html for an intro.
    * This translation is imprecise and ignores the effect of the type mapping. 
    * TS definition: {{{
    {[ P in keyof T ]:? T[P]}
    }}}
    */
  type Partial[T] = /* note, weird intersection type is needed for scala 2 since it doesn't handle `Id[Id[T]]`, and things like `Partial` frequently ends up applied twice */
  web.typings.std.stdStrings.Partial with org.scalablytyped.runtime.TopLevel[T]
  
  type PaymentRequestUpdateEventInit = web.typings.std.EventInit
  
  type PerformanceEntryList = js.Array[org.scalajs.dom.PerformanceEntry]
  
  /** PerformanceMark is an abstract interface for PerformanceEntry objects with an entryType of "mark". Entries of this type are created by calling performance.mark() to add a named DOMHighResTimeStamp (the mark) to the browser's performance timeline. */
  type PerformanceMark = org.scalajs.dom.PerformanceEntry
  
  /** PerformanceMeasure is an abstract interface for PerformanceEntry objects with an entryType of "measure". Entries of this type are created by calling performance.measure() to add a named DOMHighResTimeStamp (the measure) between two marks to the browser's performance timeline. */
  type PerformanceMeasure = org.scalajs.dom.PerformanceEntry
  
  type PerformanceObserverCallback = js.Function2[
    /* entries */ web.typings.std.PerformanceObserverEntryList, 
    /* observer */ web.typings.std.PerformanceObserver, 
    scala.Unit
  ]
  
  /**
    * From T, pick a set of properties whose keys are in the union K
    */
  /** NOTE: Mapped type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/mapped-types.html for an intro.
    * This translation is imprecise and ignores the effect of the type mapping. 
    * TS definition: {{{
    {[ P in K ]: T[P]}
    }}}
    */
  type Pick[T, K /* <: /* keyof T */ java.lang.String */] = /* note, weird intersection type is needed for scala 2 since it doesn't handle `Id[Id[T]]`, and things like `Partial` frequently ends up applied twice */
  web.typings.std.stdStrings.Pick with org.scalablytyped.runtime.TopLevel[T]
  
  type PositionCallback = js.Function1[/* position */ web.typings.std.GeolocationPosition, scala.Unit]
  
  type PositionErrorCallback = js.Function1[/* positionError */ web.typings.std.GeolocationPositionError, scala.Unit]
  
  type PromiseConstructorLike = org.scalablytyped.runtime.Instantiable1[
    /* executor */ js.Function2[
      /* resolve */ js.Function1[/* value */ js.Object | web.typings.std.PromiseLike[js.Object], scala.Unit], 
      /* reject */ js.Function1[/* reason */ js.UndefOr[scala.Any], scala.Unit], 
      scala.Unit
    ], 
    web.typings.std.PromiseLike[js.Object]
  ]
  
  type PropertyDecorator = js.Function2[/* target */ js.Object, /* propertyKey */ java.lang.String | js.Symbol, scala.Unit]
  
  type PropertyDescriptorMap = /* standard es5 */
  org.scalablytyped.runtime.StringDictionary[js.PropertyDescriptor]
  
  type PropertyKey = java.lang.String | scala.Double | js.Symbol
  
  type PublicKeyCredentialType = web.typings.std.stdStrings.`public-key`
  
  type QueuingStrategySize[T] = js.Function1[/* chunk */ T, scala.Double]
  
  type RTCAnswerOptions = web.typings.std.RTCOfferAnswerOptions
  
  type RTCIceCredentialType = web.typings.std.stdStrings.password
  
  type RTCPeerConnectionErrorCallback = js.Function1[/* error */ org.scalajs.dom.DOMException, scala.Unit]
  
  type RTCRtcpMuxPolicy = web.typings.std.stdStrings.require
  
  type RTCRtpReceiveParameters = web.typings.std.RTCRtpParameters
  
  type RTCSessionDescriptionCallback = js.Function1[/* description */ org.scalajs.dom.RTCSessionDescriptionInit, scala.Unit]
  
  type RTCStatsCallback = js.Function1[/* report */ org.scalajs.dom.RTCStatsReport, scala.Unit]
  
  type RangeError = js.Error
  
  type ReadableStreamController[T] = web.typings.std.ReadableStreamDefaultController[T]
  
  type ReadableStreamReader[T] = web.typings.std.ReadableStreamDefaultReader[T]
  
  /**
    * Make all properties in T readonly
    */
  /** NOTE: Mapped type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/mapped-types.html for an intro.
    * This translation is imprecise and ignores the effect of the type mapping. 
    * TS definition: {{{
    {readonly [ P in keyof T ]: T[P]}
    }}}
    */
  type Readonly[T] = /* note, weird intersection type is needed for scala 2 since it doesn't handle `Id[Id[T]]`, and things like `Partial` frequently ends up applied twice */
  web.typings.std.stdStrings.Readonly with org.scalablytyped.runtime.TopLevel[T]
  
  /**
    * Construct a type with a set of properties K of type T
    */
  /** NOTE: Mapped type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/mapped-types.html for an intro.
    * This translation throws away the known field names. 
    * TS definition: {{{
    {[ P in K ]: T}
    }}}
    */
  type Record[K /* <: /* keyof any */ java.lang.String */, T] = org.scalablytyped.runtime.StringDictionary[T]
  
  type ReferenceError = js.Error
  
  /* Rewritten from type alias, can be one of: 
    - org.scalajs.dom.CanvasRenderingContext2D
    - `web.typings`.std.ImageBitmapRenderingContext
    - org.scalajs.dom.WebGLRenderingContext
    - `web.typings`.std.WebGL2RenderingContext
  */
  type RenderingContext = web.typings.std._RenderingContext | org.scalajs.dom.CanvasRenderingContext2D | org.scalajs.dom.WebGLRenderingContext
  
  type RequestInfo = org.scalajs.dom.Request | java.lang.String
  
  /**
    * Make all properties in T required
    */
  /** NOTE: Mapped type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/mapped-types.html for an intro.
    * This translation is imprecise and ignores the effect of the type mapping. 
    * TS definition: {{{
    {[ P in keyof T ]: -? T[P]}
    }}}
    */
  type Required[T] = /* note, weird intersection type is needed for scala 2 since it doesn't handle `Id[Id[T]]`, and things like `Partial` frequently ends up applied twice */
  web.typings.std.stdStrings.Required with org.scalablytyped.runtime.TopLevel[T]
  
  type ResizeObserverCallback = js.Function2[
    /* entries */ js.Array[web.typings.std.ResizeObserverEntry], 
    /* observer */ web.typings.std.ResizeObserver, 
    scala.Unit
  ]
  
  type SVGMatrix = web.typings.std.DOMMatrix
  
  type SVGPathSegClosePath = org.scalajs.dom.SVGPathSeg
  
  type SVGPoint = web.typings.std.DOMPoint
  
  type SVGRect = org.scalajs.dom.DOMRect
  
  type StaticRange = web.typings.std.AbstractRange
  
  type SyntaxError = js.Error
  
  /* Rewritten from type alias, can be one of: 
    - `web.typings`.std.ImageBitmap
    - org.scalajs.dom.ImageData
    - org.scalajs.dom.HTMLImageElement
    - org.scalajs.dom.HTMLCanvasElement
    - org.scalajs.dom.HTMLVideoElement
    - `web.typings`.std.OffscreenCanvas
  */
  type TexImageSource = web.typings.std._TexImageSource | org.scalajs.dom.ImageData | org.scalajs.dom.HTMLImageElement | org.scalajs.dom.HTMLCanvasElement | org.scalajs.dom.HTMLVideoElement
  
  type TimerHandler = java.lang.String | js.Function
  
  /* Rewritten from type alias, can be one of: 
    - js.typedarray.ArrayBuffer
    - org.scalajs.dom.MessagePort
    - `web.typings`.std.ImageBitmap
    - `web.typings`.std.OffscreenCanvas
  */
  type Transferable = web.typings.std._Transferable | js.typedarray.ArrayBuffer | org.scalajs.dom.MessagePort
  
  type TransformerFlushCallback[O] = js.Function1[
    /* controller */ web.typings.std.TransformStreamDefaultController[O], 
    scala.Unit | web.typings.std.PromiseLike[scala.Unit]
  ]
  
  type TransformerStartCallback[O] = js.Function1[
    /* controller */ web.typings.std.TransformStreamDefaultController[O], 
    scala.Unit | web.typings.std.PromiseLike[scala.Unit]
  ]
  
  type TransformerTransformCallback[I, O] = js.Function2[
    /* chunk */ I, 
    /* controller */ web.typings.std.TransformStreamDefaultController[O], 
    scala.Unit | web.typings.std.PromiseLike[scala.Unit]
  ]
  
  type TypeError = js.Error
  
  type URIError = js.Error
  
  type Uint32List = js.typedarray.Uint32Array | js.Array[web.typings.std.GLuint]
  
  /**
    * Convert first character of string literal type to lowercase
    */
  type Uncapitalize[S /* <: java.lang.String */] = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify intrinsic */ scala.Any
  
  type UnderlyingSinkAbortCallback = js.Function1[/* reason */ scala.Any, scala.Unit | web.typings.std.PromiseLike[scala.Unit]]
  
  type UnderlyingSinkCloseCallback = js.Function0[scala.Unit | web.typings.std.PromiseLike[scala.Unit]]
  
  type UnderlyingSinkStartCallback = js.Function1[
    /* controller */ web.typings.std.WritableStreamDefaultController, 
    scala.Unit | web.typings.std.PromiseLike[scala.Unit]
  ]
  
  type UnderlyingSinkWriteCallback[W] = js.Function2[
    /* chunk */ W, 
    /* controller */ web.typings.std.WritableStreamDefaultController, 
    scala.Unit | web.typings.std.PromiseLike[scala.Unit]
  ]
  
  type UnderlyingSourceCancelCallback = js.Function1[/* reason */ scala.Any, scala.Unit | web.typings.std.PromiseLike[scala.Unit]]
  
  type UnderlyingSourcePullCallback[R] = js.Function1[
    /* controller */ web.typings.std.ReadableStreamController[R], 
    scala.Unit | web.typings.std.PromiseLike[scala.Unit]
  ]
  
  type UnderlyingSourceStartCallback[R] = js.Function1[
    /* controller */ web.typings.std.ReadableStreamController[R], 
    scala.Unit | web.typings.std.PromiseLike[scala.Unit]
  ]
  
  /**
    * Convert string literal type to uppercase
    */
  type Uppercase[S /* <: java.lang.String */] = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify intrinsic */ scala.Any
  
  type UvmEntries = js.Array[web.typings.std.UvmEntry]
  
  type UvmEntry = js.Array[scala.Double]
  
  type VibratePattern = scala.Double | js.Array[scala.Double]
  
  type VoidFunction = js.Function0[scala.Unit]
  
  type WebKitCSSMatrix = web.typings.std.DOMMatrix
  
  type WindowProxy = org.scalajs.dom.Window
  
  /** The XPathEvaluator interface allows to compile and evaluate XPath expressions. */
  type XPathEvaluator = web.typings.std.XPathEvaluatorBase
  
  type XPathNSResolver = (js.Function1[/* prefix */ java.lang.String | scala.Null, java.lang.String | scala.Null]) | web.typings.std.anon.LookupNamespaceURI
  
  type webkitURL = org.scalajs.dom.URL
}
