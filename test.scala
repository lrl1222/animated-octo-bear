package io.things.protocol.mqtt.codec

import io.things.protocol.mqtt.ConnectAck.ReturnCode
import io.things.protocol.mqtt.Publish.{AtLeastOnce, ExactlyOnce, AtMostOnce}
import io.things.protocol.mqtt.SubAck.{Failure, Qos2, Qos1, Qos0}
import scodec.bits.BitVector

/**
 * Created by Administrator on 2015/7/27.
 */
object Constant {
  val body = BitVector.empty
  var PassWdFlag = 1
  var userNameFlag = 1
  val resFlag = 0
  var willFlag = 1
  var willQos = 0
  var willRetain = 0
  var cleanSession = 0
  var keepAlive: BitVector = null
  var packet: BitVector = null
  var msb: BitVector = null
  var lsb: BitVector = null
  var pacId: BitVector = null
  var topI: BitVector = null
  var remain: BitVector = null
  var pay: BitVector = null
  var dup = 0
  var topic = ""
  var sCode = ""
  var ret = 0
  var Qos = 0
  var ts = ""
  var spc = 0
  var codeId = 0
  var publish:BitVector = null
  val returnCode = Map(
    "ConnectionAccepted" -> 0,
    "UnAcceptedProtocolVersion" -> 1,
    "IdentifierRejected" -> 2,
    "ServerUnavailable" -> 3,
    "BadAuthentication" -> 4,
    "NotAuthorized" -> 5)
  val eQos = Map(
    "AtMostOnce" -> 0,
    "AtLeastOnce" -> 1,
    "ExactlyOnce" -> 2
  )
  val subscriptionReturnCode = Map(
    "Qos0" -> 0,
    "Qos1" -> 1,
    "Qos2" -> 2,
    "Failure" -> 128
  )

  val decodeReturnCode = Map(
    0 -> ReturnCode.ConnectionAccepted,
    1 -> ReturnCode.UnAcceptedProtocolVersion,
    2 -> ReturnCode.IdentifierRejected,
    3->  ReturnCode.ServerUnavailable,
    4 -> ReturnCode.BadAuthentication,
    5 -> ReturnCode.NotAuthorized)

  val DQos = Map(
    0 -> AtMostOnce,
    1 -> AtLeastOnce,
    2 -> ExactlyOnce
  )
  val deReturnCode = Map(
    0 -> Qos0,
    1 -> Qos1,
    2 -> Qos2,
    128 -> Failure
  )
}
