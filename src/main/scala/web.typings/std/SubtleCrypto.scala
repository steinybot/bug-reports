package web.typings.std

import web.typings.std.stdStrings.jwk
import web.typings.std.stdStrings.pkcs8
import web.typings.std.stdStrings.raw
import web.typings.std.stdStrings.spki
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** This Web Crypto API interface provides a number of low-level cryptographic functions. It is accessed via the Crypto.subtle properties available in a window context (via Window.crypto). */
@js.native
trait SubtleCrypto extends StObject {
  
  /* standard dom */
  def decrypt(
    algorithm: AlgorithmIdentifier | org.scalajs.dom.RsaOaepParams | org.scalajs.dom.AesCtrParams | org.scalajs.dom.AesCbcParams | org.scalajs.dom.AesCmacParams | org.scalajs.dom.AesGcmParams | org.scalajs.dom.AesCfbParams,
    key: org.scalajs.dom.CryptoKey,
    data: js.typedarray.Int8Array | js.typedarray.Int16Array | js.typedarray.Int32Array | js.typedarray.Uint8Array | js.typedarray.Uint16Array | js.typedarray.Uint32Array | js.typedarray.Uint8ClampedArray | js.typedarray.Float32Array | js.typedarray.Float64Array | js.typedarray.DataView | js.typedarray.ArrayBuffer
  ): js.Promise[js.typedarray.ArrayBuffer] = js.native
  
  /* standard dom */
  def deriveBits(algorithm: AlgorithmIdentifier, baseKey: org.scalajs.dom.CryptoKey, length: Double): js.Promise[js.typedarray.ArrayBuffer] = js.native
  def deriveBits(algorithm: HkdfParams, baseKey: org.scalajs.dom.CryptoKey, length: Double): js.Promise[js.typedarray.ArrayBuffer] = js.native
  def deriveBits(algorithm: org.scalajs.dom.ConcatParams, baseKey: org.scalajs.dom.CryptoKey, length: Double): js.Promise[js.typedarray.ArrayBuffer] = js.native
  def deriveBits(algorithm: org.scalajs.dom.DhKeyDeriveParams, baseKey: org.scalajs.dom.CryptoKey, length: Double): js.Promise[js.typedarray.ArrayBuffer] = js.native
  def deriveBits(algorithm: org.scalajs.dom.EcdhKeyDeriveParams, baseKey: org.scalajs.dom.CryptoKey, length: Double): js.Promise[js.typedarray.ArrayBuffer] = js.native
  def deriveBits(algorithm: org.scalajs.dom.Pbkdf2Params, baseKey: org.scalajs.dom.CryptoKey, length: Double): js.Promise[js.typedarray.ArrayBuffer] = js.native
  
  def deriveKey(
    algorithm: AlgorithmIdentifier,
    baseKey: org.scalajs.dom.CryptoKey,
    derivedKeyType: HkdfParams,
    extractable: scala.Boolean,
    keyUsages: js.Array[org.scalajs.dom.KeyUsage]
  ): js.Promise[org.scalajs.dom.CryptoKey] = js.native
  /* standard dom */
  def deriveKey(
    algorithm: AlgorithmIdentifier,
    baseKey: org.scalajs.dom.CryptoKey,
    derivedKeyType: java.lang.String,
    extractable: scala.Boolean,
    keyUsages: js.Array[org.scalajs.dom.KeyUsage]
  ): js.Promise[org.scalajs.dom.CryptoKey] = js.native
  def deriveKey(
    algorithm: AlgorithmIdentifier,
    baseKey: org.scalajs.dom.CryptoKey,
    derivedKeyType: org.scalajs.dom.AesDerivedKeyParams,
    extractable: scala.Boolean,
    keyUsages: js.Array[org.scalajs.dom.KeyUsage]
  ): js.Promise[org.scalajs.dom.CryptoKey] = js.native
  def deriveKey(
    algorithm: AlgorithmIdentifier,
    baseKey: org.scalajs.dom.CryptoKey,
    derivedKeyType: org.scalajs.dom.ConcatParams,
    extractable: scala.Boolean,
    keyUsages: js.Array[org.scalajs.dom.KeyUsage]
  ): js.Promise[org.scalajs.dom.CryptoKey] = js.native
  def deriveKey(
    algorithm: AlgorithmIdentifier,
    baseKey: org.scalajs.dom.CryptoKey,
    derivedKeyType: org.scalajs.dom.HmacImportParams,
    extractable: scala.Boolean,
    keyUsages: js.Array[org.scalajs.dom.KeyUsage]
  ): js.Promise[org.scalajs.dom.CryptoKey] = js.native
  def deriveKey(
    algorithm: AlgorithmIdentifier,
    baseKey: org.scalajs.dom.CryptoKey,
    derivedKeyType: org.scalajs.dom.Pbkdf2Params,
    extractable: scala.Boolean,
    keyUsages: js.Array[org.scalajs.dom.KeyUsage]
  ): js.Promise[org.scalajs.dom.CryptoKey] = js.native
  def deriveKey(
    algorithm: HkdfParams,
    baseKey: org.scalajs.dom.CryptoKey,
    derivedKeyType: HkdfParams,
    extractable: scala.Boolean,
    keyUsages: js.Array[org.scalajs.dom.KeyUsage]
  ): js.Promise[org.scalajs.dom.CryptoKey] = js.native
  def deriveKey(
    algorithm: HkdfParams,
    baseKey: org.scalajs.dom.CryptoKey,
    derivedKeyType: java.lang.String,
    extractable: scala.Boolean,
    keyUsages: js.Array[org.scalajs.dom.KeyUsage]
  ): js.Promise[org.scalajs.dom.CryptoKey] = js.native
  def deriveKey(
    algorithm: HkdfParams,
    baseKey: org.scalajs.dom.CryptoKey,
    derivedKeyType: org.scalajs.dom.AesDerivedKeyParams,
    extractable: scala.Boolean,
    keyUsages: js.Array[org.scalajs.dom.KeyUsage]
  ): js.Promise[org.scalajs.dom.CryptoKey] = js.native
  def deriveKey(
    algorithm: HkdfParams,
    baseKey: org.scalajs.dom.CryptoKey,
    derivedKeyType: org.scalajs.dom.ConcatParams,
    extractable: scala.Boolean,
    keyUsages: js.Array[org.scalajs.dom.KeyUsage]
  ): js.Promise[org.scalajs.dom.CryptoKey] = js.native
  def deriveKey(
    algorithm: HkdfParams,
    baseKey: org.scalajs.dom.CryptoKey,
    derivedKeyType: org.scalajs.dom.HmacImportParams,
    extractable: scala.Boolean,
    keyUsages: js.Array[org.scalajs.dom.KeyUsage]
  ): js.Promise[org.scalajs.dom.CryptoKey] = js.native
  def deriveKey(
    algorithm: HkdfParams,
    baseKey: org.scalajs.dom.CryptoKey,
    derivedKeyType: org.scalajs.dom.Pbkdf2Params,
    extractable: scala.Boolean,
    keyUsages: js.Array[org.scalajs.dom.KeyUsage]
  ): js.Promise[org.scalajs.dom.CryptoKey] = js.native
  def deriveKey(
    algorithm: org.scalajs.dom.ConcatParams,
    baseKey: org.scalajs.dom.CryptoKey,
    derivedKeyType: HkdfParams,
    extractable: scala.Boolean,
    keyUsages: js.Array[org.scalajs.dom.KeyUsage]
  ): js.Promise[org.scalajs.dom.CryptoKey] = js.native
  def deriveKey(
    algorithm: org.scalajs.dom.ConcatParams,
    baseKey: org.scalajs.dom.CryptoKey,
    derivedKeyType: java.lang.String,
    extractable: scala.Boolean,
    keyUsages: js.Array[org.scalajs.dom.KeyUsage]
  ): js.Promise[org.scalajs.dom.CryptoKey] = js.native
  def deriveKey(
    algorithm: org.scalajs.dom.ConcatParams,
    baseKey: org.scalajs.dom.CryptoKey,
    derivedKeyType: org.scalajs.dom.AesDerivedKeyParams,
    extractable: scala.Boolean,
    keyUsages: js.Array[org.scalajs.dom.KeyUsage]
  ): js.Promise[org.scalajs.dom.CryptoKey] = js.native
  def deriveKey(
    algorithm: org.scalajs.dom.ConcatParams,
    baseKey: org.scalajs.dom.CryptoKey,
    derivedKeyType: org.scalajs.dom.ConcatParams,
    extractable: scala.Boolean,
    keyUsages: js.Array[org.scalajs.dom.KeyUsage]
  ): js.Promise[org.scalajs.dom.CryptoKey] = js.native
  def deriveKey(
    algorithm: org.scalajs.dom.ConcatParams,
    baseKey: org.scalajs.dom.CryptoKey,
    derivedKeyType: org.scalajs.dom.HmacImportParams,
    extractable: scala.Boolean,
    keyUsages: js.Array[org.scalajs.dom.KeyUsage]
  ): js.Promise[org.scalajs.dom.CryptoKey] = js.native
  def deriveKey(
    algorithm: org.scalajs.dom.ConcatParams,
    baseKey: org.scalajs.dom.CryptoKey,
    derivedKeyType: org.scalajs.dom.Pbkdf2Params,
    extractable: scala.Boolean,
    keyUsages: js.Array[org.scalajs.dom.KeyUsage]
  ): js.Promise[org.scalajs.dom.CryptoKey] = js.native
  def deriveKey(
    algorithm: org.scalajs.dom.DhKeyDeriveParams,
    baseKey: org.scalajs.dom.CryptoKey,
    derivedKeyType: HkdfParams,
    extractable: scala.Boolean,
    keyUsages: js.Array[org.scalajs.dom.KeyUsage]
  ): js.Promise[org.scalajs.dom.CryptoKey] = js.native
  def deriveKey(
    algorithm: org.scalajs.dom.DhKeyDeriveParams,
    baseKey: org.scalajs.dom.CryptoKey,
    derivedKeyType: java.lang.String,
    extractable: scala.Boolean,
    keyUsages: js.Array[org.scalajs.dom.KeyUsage]
  ): js.Promise[org.scalajs.dom.CryptoKey] = js.native
  def deriveKey(
    algorithm: org.scalajs.dom.DhKeyDeriveParams,
    baseKey: org.scalajs.dom.CryptoKey,
    derivedKeyType: org.scalajs.dom.AesDerivedKeyParams,
    extractable: scala.Boolean,
    keyUsages: js.Array[org.scalajs.dom.KeyUsage]
  ): js.Promise[org.scalajs.dom.CryptoKey] = js.native
  def deriveKey(
    algorithm: org.scalajs.dom.DhKeyDeriveParams,
    baseKey: org.scalajs.dom.CryptoKey,
    derivedKeyType: org.scalajs.dom.ConcatParams,
    extractable: scala.Boolean,
    keyUsages: js.Array[org.scalajs.dom.KeyUsage]
  ): js.Promise[org.scalajs.dom.CryptoKey] = js.native
  def deriveKey(
    algorithm: org.scalajs.dom.DhKeyDeriveParams,
    baseKey: org.scalajs.dom.CryptoKey,
    derivedKeyType: org.scalajs.dom.HmacImportParams,
    extractable: scala.Boolean,
    keyUsages: js.Array[org.scalajs.dom.KeyUsage]
  ): js.Promise[org.scalajs.dom.CryptoKey] = js.native
  def deriveKey(
    algorithm: org.scalajs.dom.DhKeyDeriveParams,
    baseKey: org.scalajs.dom.CryptoKey,
    derivedKeyType: org.scalajs.dom.Pbkdf2Params,
    extractable: scala.Boolean,
    keyUsages: js.Array[org.scalajs.dom.KeyUsage]
  ): js.Promise[org.scalajs.dom.CryptoKey] = js.native
  def deriveKey(
    algorithm: org.scalajs.dom.EcdhKeyDeriveParams,
    baseKey: org.scalajs.dom.CryptoKey,
    derivedKeyType: HkdfParams,
    extractable: scala.Boolean,
    keyUsages: js.Array[org.scalajs.dom.KeyUsage]
  ): js.Promise[org.scalajs.dom.CryptoKey] = js.native
  def deriveKey(
    algorithm: org.scalajs.dom.EcdhKeyDeriveParams,
    baseKey: org.scalajs.dom.CryptoKey,
    derivedKeyType: java.lang.String,
    extractable: scala.Boolean,
    keyUsages: js.Array[org.scalajs.dom.KeyUsage]
  ): js.Promise[org.scalajs.dom.CryptoKey] = js.native
  def deriveKey(
    algorithm: org.scalajs.dom.EcdhKeyDeriveParams,
    baseKey: org.scalajs.dom.CryptoKey,
    derivedKeyType: org.scalajs.dom.AesDerivedKeyParams,
    extractable: scala.Boolean,
    keyUsages: js.Array[org.scalajs.dom.KeyUsage]
  ): js.Promise[org.scalajs.dom.CryptoKey] = js.native
  def deriveKey(
    algorithm: org.scalajs.dom.EcdhKeyDeriveParams,
    baseKey: org.scalajs.dom.CryptoKey,
    derivedKeyType: org.scalajs.dom.ConcatParams,
    extractable: scala.Boolean,
    keyUsages: js.Array[org.scalajs.dom.KeyUsage]
  ): js.Promise[org.scalajs.dom.CryptoKey] = js.native
  def deriveKey(
    algorithm: org.scalajs.dom.EcdhKeyDeriveParams,
    baseKey: org.scalajs.dom.CryptoKey,
    derivedKeyType: org.scalajs.dom.HmacImportParams,
    extractable: scala.Boolean,
    keyUsages: js.Array[org.scalajs.dom.KeyUsage]
  ): js.Promise[org.scalajs.dom.CryptoKey] = js.native
  def deriveKey(
    algorithm: org.scalajs.dom.EcdhKeyDeriveParams,
    baseKey: org.scalajs.dom.CryptoKey,
    derivedKeyType: org.scalajs.dom.Pbkdf2Params,
    extractable: scala.Boolean,
    keyUsages: js.Array[org.scalajs.dom.KeyUsage]
  ): js.Promise[org.scalajs.dom.CryptoKey] = js.native
  def deriveKey(
    algorithm: org.scalajs.dom.Pbkdf2Params,
    baseKey: org.scalajs.dom.CryptoKey,
    derivedKeyType: HkdfParams,
    extractable: scala.Boolean,
    keyUsages: js.Array[org.scalajs.dom.KeyUsage]
  ): js.Promise[org.scalajs.dom.CryptoKey] = js.native
  def deriveKey(
    algorithm: org.scalajs.dom.Pbkdf2Params,
    baseKey: org.scalajs.dom.CryptoKey,
    derivedKeyType: java.lang.String,
    extractable: scala.Boolean,
    keyUsages: js.Array[org.scalajs.dom.KeyUsage]
  ): js.Promise[org.scalajs.dom.CryptoKey] = js.native
  def deriveKey(
    algorithm: org.scalajs.dom.Pbkdf2Params,
    baseKey: org.scalajs.dom.CryptoKey,
    derivedKeyType: org.scalajs.dom.AesDerivedKeyParams,
    extractable: scala.Boolean,
    keyUsages: js.Array[org.scalajs.dom.KeyUsage]
  ): js.Promise[org.scalajs.dom.CryptoKey] = js.native
  def deriveKey(
    algorithm: org.scalajs.dom.Pbkdf2Params,
    baseKey: org.scalajs.dom.CryptoKey,
    derivedKeyType: org.scalajs.dom.ConcatParams,
    extractable: scala.Boolean,
    keyUsages: js.Array[org.scalajs.dom.KeyUsage]
  ): js.Promise[org.scalajs.dom.CryptoKey] = js.native
  def deriveKey(
    algorithm: org.scalajs.dom.Pbkdf2Params,
    baseKey: org.scalajs.dom.CryptoKey,
    derivedKeyType: org.scalajs.dom.HmacImportParams,
    extractable: scala.Boolean,
    keyUsages: js.Array[org.scalajs.dom.KeyUsage]
  ): js.Promise[org.scalajs.dom.CryptoKey] = js.native
  def deriveKey(
    algorithm: org.scalajs.dom.Pbkdf2Params,
    baseKey: org.scalajs.dom.CryptoKey,
    derivedKeyType: org.scalajs.dom.Pbkdf2Params,
    extractable: scala.Boolean,
    keyUsages: js.Array[org.scalajs.dom.KeyUsage]
  ): js.Promise[org.scalajs.dom.CryptoKey] = js.native
  
  def digest(algorithm: AlgorithmIdentifier, data: js.typedarray.ArrayBuffer): js.Promise[js.typedarray.ArrayBuffer] = js.native
  def digest(algorithm: AlgorithmIdentifier, data: js.typedarray.DataView): js.Promise[js.typedarray.ArrayBuffer] = js.native
  def digest(algorithm: AlgorithmIdentifier, data: js.typedarray.Float32Array): js.Promise[js.typedarray.ArrayBuffer] = js.native
  def digest(algorithm: AlgorithmIdentifier, data: js.typedarray.Float64Array): js.Promise[js.typedarray.ArrayBuffer] = js.native
  def digest(algorithm: AlgorithmIdentifier, data: js.typedarray.Int16Array): js.Promise[js.typedarray.ArrayBuffer] = js.native
  def digest(algorithm: AlgorithmIdentifier, data: js.typedarray.Int32Array): js.Promise[js.typedarray.ArrayBuffer] = js.native
  /* standard dom */
  def digest(algorithm: AlgorithmIdentifier, data: js.typedarray.Int8Array): js.Promise[js.typedarray.ArrayBuffer] = js.native
  def digest(algorithm: AlgorithmIdentifier, data: js.typedarray.Uint16Array): js.Promise[js.typedarray.ArrayBuffer] = js.native
  def digest(algorithm: AlgorithmIdentifier, data: js.typedarray.Uint32Array): js.Promise[js.typedarray.ArrayBuffer] = js.native
  def digest(algorithm: AlgorithmIdentifier, data: js.typedarray.Uint8Array): js.Promise[js.typedarray.ArrayBuffer] = js.native
  def digest(algorithm: AlgorithmIdentifier, data: js.typedarray.Uint8ClampedArray): js.Promise[js.typedarray.ArrayBuffer] = js.native
  
  /* standard dom */
  def encrypt(
    algorithm: AlgorithmIdentifier | org.scalajs.dom.RsaOaepParams | org.scalajs.dom.AesCtrParams | org.scalajs.dom.AesCbcParams | org.scalajs.dom.AesCmacParams | org.scalajs.dom.AesGcmParams | org.scalajs.dom.AesCfbParams,
    key: org.scalajs.dom.CryptoKey,
    data: js.typedarray.Int8Array | js.typedarray.Int16Array | js.typedarray.Int32Array | js.typedarray.Uint8Array | js.typedarray.Uint16Array | js.typedarray.Uint32Array | js.typedarray.Uint8ClampedArray | js.typedarray.Float32Array | js.typedarray.Float64Array | js.typedarray.DataView | js.typedarray.ArrayBuffer
  ): js.Promise[js.typedarray.ArrayBuffer] = js.native
  
  /* standard dom */
  def exportKey(format: raw | pkcs8 | spki, key: org.scalajs.dom.CryptoKey): js.Promise[js.typedarray.ArrayBuffer] = js.native
  /* standard dom */
  def exportKey(format: java.lang.String, key: org.scalajs.dom.CryptoKey): js.Promise[org.scalajs.dom.JsonWebKey | js.typedarray.ArrayBuffer] = js.native
  /* standard dom */
  @JSName("exportKey")
  def exportKey_jwk(format: jwk, key: org.scalajs.dom.CryptoKey): js.Promise[org.scalajs.dom.JsonWebKey] = js.native
  
  /* standard dom */
  def generateKey(
    algorithm: AlgorithmIdentifier,
    extractable: scala.Boolean,
    keyUsages: js.Array[org.scalajs.dom.KeyUsage]
  ): js.Promise[org.scalajs.dom.CryptoKeyPair | org.scalajs.dom.CryptoKey] = js.native
  /* standard dom */
  def generateKey(
    algorithm: org.scalajs.dom.AesKeyGenParams,
    extractable: scala.Boolean,
    keyUsages: js.Array[org.scalajs.dom.KeyUsage]
  ): js.Promise[org.scalajs.dom.CryptoKey] = js.native
  def generateKey(
    algorithm: org.scalajs.dom.DhKeyGenParams,
    extractable: scala.Boolean,
    keyUsages: js.Array[org.scalajs.dom.KeyUsage]
  ): js.Promise[org.scalajs.dom.CryptoKeyPair] = js.native
  def generateKey(
    algorithm: org.scalajs.dom.EcKeyGenParams,
    extractable: scala.Boolean,
    keyUsages: js.Array[org.scalajs.dom.KeyUsage]
  ): js.Promise[org.scalajs.dom.CryptoKeyPair] = js.native
  def generateKey(
    algorithm: org.scalajs.dom.HmacKeyGenParams,
    extractable: scala.Boolean,
    keyUsages: js.Array[org.scalajs.dom.KeyUsage]
  ): js.Promise[org.scalajs.dom.CryptoKey] = js.native
  def generateKey(
    algorithm: org.scalajs.dom.Pbkdf2Params,
    extractable: scala.Boolean,
    keyUsages: js.Array[org.scalajs.dom.KeyUsage]
  ): js.Promise[org.scalajs.dom.CryptoKey] = js.native
  /* standard dom */
  def generateKey(
    algorithm: org.scalajs.dom.RsaHashedKeyGenParams,
    extractable: scala.Boolean,
    keyUsages: js.Array[org.scalajs.dom.KeyUsage]
  ): js.Promise[org.scalajs.dom.CryptoKeyPair] = js.native
  
  /* standard dom */
  def importKey(
    format: raw | pkcs8 | spki,
    keyData: js.typedarray.Int8Array | js.typedarray.Int16Array | js.typedarray.Int32Array | js.typedarray.Uint8Array | js.typedarray.Uint16Array | js.typedarray.Uint32Array | js.typedarray.Uint8ClampedArray | js.typedarray.Float32Array | js.typedarray.Float64Array | js.typedarray.DataView | js.typedarray.ArrayBuffer,
    algorithm: AlgorithmIdentifier | org.scalajs.dom.RsaHashedImportParams | org.scalajs.dom.EcKeyImportParams | org.scalajs.dom.HmacImportParams | org.scalajs.dom.DhImportKeyParams | org.scalajs.dom.AesKeyAlgorithm,
    extractable: scala.Boolean,
    keyUsages: js.Array[org.scalajs.dom.KeyUsage]
  ): js.Promise[org.scalajs.dom.CryptoKey] = js.native
  /* standard dom */
  def importKey(
    format: java.lang.String,
    keyData: org.scalajs.dom.JsonWebKey | js.typedarray.Int8Array | js.typedarray.Int16Array | js.typedarray.Int32Array | js.typedarray.Uint8Array | js.typedarray.Uint16Array | js.typedarray.Uint32Array | js.typedarray.Uint8ClampedArray | js.typedarray.Float32Array | js.typedarray.Float64Array | js.typedarray.DataView | js.typedarray.ArrayBuffer,
    algorithm: AlgorithmIdentifier | org.scalajs.dom.RsaHashedImportParams | org.scalajs.dom.EcKeyImportParams | org.scalajs.dom.HmacImportParams | org.scalajs.dom.DhImportKeyParams | org.scalajs.dom.AesKeyAlgorithm,
    extractable: scala.Boolean,
    keyUsages: js.Array[org.scalajs.dom.KeyUsage]
  ): js.Promise[org.scalajs.dom.CryptoKey] = js.native
  /* standard dom */
  @JSName("importKey")
  def importKey_jwk(
    format: jwk,
    keyData: org.scalajs.dom.JsonWebKey,
    algorithm: AlgorithmIdentifier,
    extractable: scala.Boolean,
    keyUsages: js.Array[org.scalajs.dom.KeyUsage]
  ): js.Promise[org.scalajs.dom.CryptoKey] = js.native
  @JSName("importKey")
  def importKey_jwk(
    format: jwk,
    keyData: org.scalajs.dom.JsonWebKey,
    algorithm: org.scalajs.dom.AesKeyAlgorithm,
    extractable: scala.Boolean,
    keyUsages: js.Array[org.scalajs.dom.KeyUsage]
  ): js.Promise[org.scalajs.dom.CryptoKey] = js.native
  @JSName("importKey")
  def importKey_jwk(
    format: jwk,
    keyData: org.scalajs.dom.JsonWebKey,
    algorithm: org.scalajs.dom.DhImportKeyParams,
    extractable: scala.Boolean,
    keyUsages: js.Array[org.scalajs.dom.KeyUsage]
  ): js.Promise[org.scalajs.dom.CryptoKey] = js.native
  @JSName("importKey")
  def importKey_jwk(
    format: jwk,
    keyData: org.scalajs.dom.JsonWebKey,
    algorithm: org.scalajs.dom.EcKeyImportParams,
    extractable: scala.Boolean,
    keyUsages: js.Array[org.scalajs.dom.KeyUsage]
  ): js.Promise[org.scalajs.dom.CryptoKey] = js.native
  @JSName("importKey")
  def importKey_jwk(
    format: jwk,
    keyData: org.scalajs.dom.JsonWebKey,
    algorithm: org.scalajs.dom.HmacImportParams,
    extractable: scala.Boolean,
    keyUsages: js.Array[org.scalajs.dom.KeyUsage]
  ): js.Promise[org.scalajs.dom.CryptoKey] = js.native
  @JSName("importKey")
  def importKey_jwk(
    format: jwk,
    keyData: org.scalajs.dom.JsonWebKey,
    algorithm: org.scalajs.dom.RsaHashedImportParams,
    extractable: scala.Boolean,
    keyUsages: js.Array[org.scalajs.dom.KeyUsage]
  ): js.Promise[org.scalajs.dom.CryptoKey] = js.native
  
  def sign(algorithm: AlgorithmIdentifier, key: org.scalajs.dom.CryptoKey, data: js.typedarray.ArrayBuffer): js.Promise[js.typedarray.ArrayBuffer] = js.native
  def sign(algorithm: AlgorithmIdentifier, key: org.scalajs.dom.CryptoKey, data: js.typedarray.DataView): js.Promise[js.typedarray.ArrayBuffer] = js.native
  def sign(algorithm: AlgorithmIdentifier, key: org.scalajs.dom.CryptoKey, data: js.typedarray.Float32Array): js.Promise[js.typedarray.ArrayBuffer] = js.native
  def sign(algorithm: AlgorithmIdentifier, key: org.scalajs.dom.CryptoKey, data: js.typedarray.Float64Array): js.Promise[js.typedarray.ArrayBuffer] = js.native
  def sign(algorithm: AlgorithmIdentifier, key: org.scalajs.dom.CryptoKey, data: js.typedarray.Int16Array): js.Promise[js.typedarray.ArrayBuffer] = js.native
  def sign(algorithm: AlgorithmIdentifier, key: org.scalajs.dom.CryptoKey, data: js.typedarray.Int32Array): js.Promise[js.typedarray.ArrayBuffer] = js.native
  /* standard dom */
  def sign(algorithm: AlgorithmIdentifier, key: org.scalajs.dom.CryptoKey, data: js.typedarray.Int8Array): js.Promise[js.typedarray.ArrayBuffer] = js.native
  def sign(algorithm: AlgorithmIdentifier, key: org.scalajs.dom.CryptoKey, data: js.typedarray.Uint16Array): js.Promise[js.typedarray.ArrayBuffer] = js.native
  def sign(algorithm: AlgorithmIdentifier, key: org.scalajs.dom.CryptoKey, data: js.typedarray.Uint32Array): js.Promise[js.typedarray.ArrayBuffer] = js.native
  def sign(algorithm: AlgorithmIdentifier, key: org.scalajs.dom.CryptoKey, data: js.typedarray.Uint8Array): js.Promise[js.typedarray.ArrayBuffer] = js.native
  def sign(
    algorithm: AlgorithmIdentifier,
    key: org.scalajs.dom.CryptoKey,
    data: js.typedarray.Uint8ClampedArray
  ): js.Promise[js.typedarray.ArrayBuffer] = js.native
  def sign(
    algorithm: org.scalajs.dom.AesCmacParams,
    key: org.scalajs.dom.CryptoKey,
    data: js.typedarray.ArrayBuffer
  ): js.Promise[js.typedarray.ArrayBuffer] = js.native
  def sign(
    algorithm: org.scalajs.dom.AesCmacParams,
    key: org.scalajs.dom.CryptoKey,
    data: js.typedarray.DataView
  ): js.Promise[js.typedarray.ArrayBuffer] = js.native
  def sign(
    algorithm: org.scalajs.dom.AesCmacParams,
    key: org.scalajs.dom.CryptoKey,
    data: js.typedarray.Float32Array
  ): js.Promise[js.typedarray.ArrayBuffer] = js.native
  def sign(
    algorithm: org.scalajs.dom.AesCmacParams,
    key: org.scalajs.dom.CryptoKey,
    data: js.typedarray.Float64Array
  ): js.Promise[js.typedarray.ArrayBuffer] = js.native
  def sign(
    algorithm: org.scalajs.dom.AesCmacParams,
    key: org.scalajs.dom.CryptoKey,
    data: js.typedarray.Int16Array
  ): js.Promise[js.typedarray.ArrayBuffer] = js.native
  def sign(
    algorithm: org.scalajs.dom.AesCmacParams,
    key: org.scalajs.dom.CryptoKey,
    data: js.typedarray.Int32Array
  ): js.Promise[js.typedarray.ArrayBuffer] = js.native
  def sign(
    algorithm: org.scalajs.dom.AesCmacParams,
    key: org.scalajs.dom.CryptoKey,
    data: js.typedarray.Int8Array
  ): js.Promise[js.typedarray.ArrayBuffer] = js.native
  def sign(
    algorithm: org.scalajs.dom.AesCmacParams,
    key: org.scalajs.dom.CryptoKey,
    data: js.typedarray.Uint16Array
  ): js.Promise[js.typedarray.ArrayBuffer] = js.native
  def sign(
    algorithm: org.scalajs.dom.AesCmacParams,
    key: org.scalajs.dom.CryptoKey,
    data: js.typedarray.Uint32Array
  ): js.Promise[js.typedarray.ArrayBuffer] = js.native
  def sign(
    algorithm: org.scalajs.dom.AesCmacParams,
    key: org.scalajs.dom.CryptoKey,
    data: js.typedarray.Uint8Array
  ): js.Promise[js.typedarray.ArrayBuffer] = js.native
  def sign(
    algorithm: org.scalajs.dom.AesCmacParams,
    key: org.scalajs.dom.CryptoKey,
    data: js.typedarray.Uint8ClampedArray
  ): js.Promise[js.typedarray.ArrayBuffer] = js.native
  def sign(
    algorithm: org.scalajs.dom.EcdsaParams,
    key: org.scalajs.dom.CryptoKey,
    data: js.typedarray.ArrayBuffer
  ): js.Promise[js.typedarray.ArrayBuffer] = js.native
  def sign(
    algorithm: org.scalajs.dom.EcdsaParams,
    key: org.scalajs.dom.CryptoKey,
    data: js.typedarray.DataView
  ): js.Promise[js.typedarray.ArrayBuffer] = js.native
  def sign(
    algorithm: org.scalajs.dom.EcdsaParams,
    key: org.scalajs.dom.CryptoKey,
    data: js.typedarray.Float32Array
  ): js.Promise[js.typedarray.ArrayBuffer] = js.native
  def sign(
    algorithm: org.scalajs.dom.EcdsaParams,
    key: org.scalajs.dom.CryptoKey,
    data: js.typedarray.Float64Array
  ): js.Promise[js.typedarray.ArrayBuffer] = js.native
  def sign(
    algorithm: org.scalajs.dom.EcdsaParams,
    key: org.scalajs.dom.CryptoKey,
    data: js.typedarray.Int16Array
  ): js.Promise[js.typedarray.ArrayBuffer] = js.native
  def sign(
    algorithm: org.scalajs.dom.EcdsaParams,
    key: org.scalajs.dom.CryptoKey,
    data: js.typedarray.Int32Array
  ): js.Promise[js.typedarray.ArrayBuffer] = js.native
  def sign(
    algorithm: org.scalajs.dom.EcdsaParams,
    key: org.scalajs.dom.CryptoKey,
    data: js.typedarray.Int8Array
  ): js.Promise[js.typedarray.ArrayBuffer] = js.native
  def sign(
    algorithm: org.scalajs.dom.EcdsaParams,
    key: org.scalajs.dom.CryptoKey,
    data: js.typedarray.Uint16Array
  ): js.Promise[js.typedarray.ArrayBuffer] = js.native
  def sign(
    algorithm: org.scalajs.dom.EcdsaParams,
    key: org.scalajs.dom.CryptoKey,
    data: js.typedarray.Uint32Array
  ): js.Promise[js.typedarray.ArrayBuffer] = js.native
  def sign(
    algorithm: org.scalajs.dom.EcdsaParams,
    key: org.scalajs.dom.CryptoKey,
    data: js.typedarray.Uint8Array
  ): js.Promise[js.typedarray.ArrayBuffer] = js.native
  def sign(
    algorithm: org.scalajs.dom.EcdsaParams,
    key: org.scalajs.dom.CryptoKey,
    data: js.typedarray.Uint8ClampedArray
  ): js.Promise[js.typedarray.ArrayBuffer] = js.native
  def sign(
    algorithm: org.scalajs.dom.RsaPssParams,
    key: org.scalajs.dom.CryptoKey,
    data: js.typedarray.ArrayBuffer
  ): js.Promise[js.typedarray.ArrayBuffer] = js.native
  def sign(
    algorithm: org.scalajs.dom.RsaPssParams,
    key: org.scalajs.dom.CryptoKey,
    data: js.typedarray.DataView
  ): js.Promise[js.typedarray.ArrayBuffer] = js.native
  def sign(
    algorithm: org.scalajs.dom.RsaPssParams,
    key: org.scalajs.dom.CryptoKey,
    data: js.typedarray.Float32Array
  ): js.Promise[js.typedarray.ArrayBuffer] = js.native
  def sign(
    algorithm: org.scalajs.dom.RsaPssParams,
    key: org.scalajs.dom.CryptoKey,
    data: js.typedarray.Float64Array
  ): js.Promise[js.typedarray.ArrayBuffer] = js.native
  def sign(
    algorithm: org.scalajs.dom.RsaPssParams,
    key: org.scalajs.dom.CryptoKey,
    data: js.typedarray.Int16Array
  ): js.Promise[js.typedarray.ArrayBuffer] = js.native
  def sign(
    algorithm: org.scalajs.dom.RsaPssParams,
    key: org.scalajs.dom.CryptoKey,
    data: js.typedarray.Int32Array
  ): js.Promise[js.typedarray.ArrayBuffer] = js.native
  def sign(
    algorithm: org.scalajs.dom.RsaPssParams,
    key: org.scalajs.dom.CryptoKey,
    data: js.typedarray.Int8Array
  ): js.Promise[js.typedarray.ArrayBuffer] = js.native
  def sign(
    algorithm: org.scalajs.dom.RsaPssParams,
    key: org.scalajs.dom.CryptoKey,
    data: js.typedarray.Uint16Array
  ): js.Promise[js.typedarray.ArrayBuffer] = js.native
  def sign(
    algorithm: org.scalajs.dom.RsaPssParams,
    key: org.scalajs.dom.CryptoKey,
    data: js.typedarray.Uint32Array
  ): js.Promise[js.typedarray.ArrayBuffer] = js.native
  def sign(
    algorithm: org.scalajs.dom.RsaPssParams,
    key: org.scalajs.dom.CryptoKey,
    data: js.typedarray.Uint8Array
  ): js.Promise[js.typedarray.ArrayBuffer] = js.native
  def sign(
    algorithm: org.scalajs.dom.RsaPssParams,
    key: org.scalajs.dom.CryptoKey,
    data: js.typedarray.Uint8ClampedArray
  ): js.Promise[js.typedarray.ArrayBuffer] = js.native
  
  /* standard dom */
  def unwrapKey(
    format: raw | pkcs8 | spki | jwk | java.lang.String,
    wrappedKey: js.typedarray.Int8Array | js.typedarray.Int16Array | js.typedarray.Int32Array | js.typedarray.Uint8Array | js.typedarray.Uint16Array | js.typedarray.Uint32Array | js.typedarray.Uint8ClampedArray | js.typedarray.Float32Array | js.typedarray.Float64Array | js.typedarray.DataView | js.typedarray.ArrayBuffer,
    unwrappingKey: org.scalajs.dom.CryptoKey,
    unwrapAlgorithm: AlgorithmIdentifier | org.scalajs.dom.RsaOaepParams | org.scalajs.dom.AesCtrParams | org.scalajs.dom.AesCbcParams | org.scalajs.dom.AesCmacParams | org.scalajs.dom.AesGcmParams | org.scalajs.dom.AesCfbParams,
    unwrappedKeyAlgorithm: AlgorithmIdentifier | org.scalajs.dom.RsaHashedImportParams | org.scalajs.dom.EcKeyImportParams | org.scalajs.dom.HmacImportParams | org.scalajs.dom.DhImportKeyParams | org.scalajs.dom.AesKeyAlgorithm,
    extractable: scala.Boolean,
    keyUsages: js.Array[org.scalajs.dom.KeyUsage]
  ): js.Promise[org.scalajs.dom.CryptoKey] = js.native
  
  /* standard dom */
  def verify(
    algorithm: AlgorithmIdentifier | org.scalajs.dom.RsaPssParams | org.scalajs.dom.EcdsaParams | org.scalajs.dom.AesCmacParams,
    key: org.scalajs.dom.CryptoKey,
    signature: js.typedarray.Int8Array | js.typedarray.Int16Array | js.typedarray.Int32Array | js.typedarray.Uint8Array | js.typedarray.Uint16Array | js.typedarray.Uint32Array | js.typedarray.Uint8ClampedArray | js.typedarray.Float32Array | js.typedarray.Float64Array | js.typedarray.DataView | js.typedarray.ArrayBuffer,
    data: js.typedarray.Int8Array | js.typedarray.Int16Array | js.typedarray.Int32Array | js.typedarray.Uint8Array | js.typedarray.Uint16Array | js.typedarray.Uint32Array | js.typedarray.Uint8ClampedArray | js.typedarray.Float32Array | js.typedarray.Float64Array | js.typedarray.DataView | js.typedarray.ArrayBuffer
  ): js.Promise[scala.Boolean] = js.native
  
  def wrapKey(
    format: raw | pkcs8 | spki | jwk,
    key: org.scalajs.dom.CryptoKey,
    wrappingKey: org.scalajs.dom.CryptoKey,
    wrapAlgorithm: AlgorithmIdentifier
  ): js.Promise[js.typedarray.ArrayBuffer] = js.native
  def wrapKey(
    format: raw | pkcs8 | spki | jwk,
    key: org.scalajs.dom.CryptoKey,
    wrappingKey: org.scalajs.dom.CryptoKey,
    wrapAlgorithm: org.scalajs.dom.AesCbcParams
  ): js.Promise[js.typedarray.ArrayBuffer] = js.native
  def wrapKey(
    format: raw | pkcs8 | spki | jwk,
    key: org.scalajs.dom.CryptoKey,
    wrappingKey: org.scalajs.dom.CryptoKey,
    wrapAlgorithm: org.scalajs.dom.AesCfbParams
  ): js.Promise[js.typedarray.ArrayBuffer] = js.native
  def wrapKey(
    format: raw | pkcs8 | spki | jwk,
    key: org.scalajs.dom.CryptoKey,
    wrappingKey: org.scalajs.dom.CryptoKey,
    wrapAlgorithm: org.scalajs.dom.AesCmacParams
  ): js.Promise[js.typedarray.ArrayBuffer] = js.native
  def wrapKey(
    format: raw | pkcs8 | spki | jwk,
    key: org.scalajs.dom.CryptoKey,
    wrappingKey: org.scalajs.dom.CryptoKey,
    wrapAlgorithm: org.scalajs.dom.AesCtrParams
  ): js.Promise[js.typedarray.ArrayBuffer] = js.native
  def wrapKey(
    format: raw | pkcs8 | spki | jwk,
    key: org.scalajs.dom.CryptoKey,
    wrappingKey: org.scalajs.dom.CryptoKey,
    wrapAlgorithm: org.scalajs.dom.AesGcmParams
  ): js.Promise[js.typedarray.ArrayBuffer] = js.native
  def wrapKey(
    format: raw | pkcs8 | spki | jwk,
    key: org.scalajs.dom.CryptoKey,
    wrappingKey: org.scalajs.dom.CryptoKey,
    wrapAlgorithm: org.scalajs.dom.RsaOaepParams
  ): js.Promise[js.typedarray.ArrayBuffer] = js.native
  /* standard dom */
  def wrapKey(
    format: java.lang.String,
    key: org.scalajs.dom.CryptoKey,
    wrappingKey: org.scalajs.dom.CryptoKey,
    wrapAlgorithm: AlgorithmIdentifier
  ): js.Promise[js.typedarray.ArrayBuffer] = js.native
  def wrapKey(
    format: java.lang.String,
    key: org.scalajs.dom.CryptoKey,
    wrappingKey: org.scalajs.dom.CryptoKey,
    wrapAlgorithm: org.scalajs.dom.AesCbcParams
  ): js.Promise[js.typedarray.ArrayBuffer] = js.native
  def wrapKey(
    format: java.lang.String,
    key: org.scalajs.dom.CryptoKey,
    wrappingKey: org.scalajs.dom.CryptoKey,
    wrapAlgorithm: org.scalajs.dom.AesCfbParams
  ): js.Promise[js.typedarray.ArrayBuffer] = js.native
  def wrapKey(
    format: java.lang.String,
    key: org.scalajs.dom.CryptoKey,
    wrappingKey: org.scalajs.dom.CryptoKey,
    wrapAlgorithm: org.scalajs.dom.AesCmacParams
  ): js.Promise[js.typedarray.ArrayBuffer] = js.native
  def wrapKey(
    format: java.lang.String,
    key: org.scalajs.dom.CryptoKey,
    wrappingKey: org.scalajs.dom.CryptoKey,
    wrapAlgorithm: org.scalajs.dom.AesCtrParams
  ): js.Promise[js.typedarray.ArrayBuffer] = js.native
  def wrapKey(
    format: java.lang.String,
    key: org.scalajs.dom.CryptoKey,
    wrappingKey: org.scalajs.dom.CryptoKey,
    wrapAlgorithm: org.scalajs.dom.AesGcmParams
  ): js.Promise[js.typedarray.ArrayBuffer] = js.native
  def wrapKey(
    format: java.lang.String,
    key: org.scalajs.dom.CryptoKey,
    wrappingKey: org.scalajs.dom.CryptoKey,
    wrapAlgorithm: org.scalajs.dom.RsaOaepParams
  ): js.Promise[js.typedarray.ArrayBuffer] = js.native
}
