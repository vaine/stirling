/*
 * Copyright 2010 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package fixengine.tags.fix44

import fixengine.messages.{
  AmtTag,
  BooleanTag,
  EnumTag,
  IntegerTag,
  LocalMktDateTag,
  PriceTag,
  QtyTag,
  StringTag,
  Value
}
import java.lang.{
  Character,
  Integer,
  String
}

object PartyRole extends EnumTag[Integer](452) {
  val Tag = this
  val ExecutingFirm = Value(1)
  val ClearingFirm = Value(4)
  val EnteringFirm = Value(7)
  val ContraFirm = Value(17)
  val ContraClearingFirmOrCcp = Value(18)
  val ClearingOrganization = Value(21)
  val EnteringTrader = Value(36)
}

object MassCancelRequestType extends EnumTag[Character](530) {
  val Tag = this
  val CxlOrdersSecurity = Value('1')
  val CxlOrdersUnderlyingSecurity = Value('2')
  val CxlOrdersProduct = Value('3')
  val CxlOrdersCFICode = Value('4')
  val CxlOrdersSecurityType = Value('5')
  val CxlOrdersTrdSession = Value('6')
  val CxlAllOrders = Value('7')
}

object MassCancelResponse extends EnumTag[Character](531) {
  val Tag = this
  val CxlReqRej = Value('0')
  val CxlOrdersSecurity = Value('1')
  val CxlOrdersUnderlyingSecurity = Value('2')
  val CxlOrdersProduct = Value('3')
  val CxlOrdersCFICode = Value('4')
  val CxlOrdersSecurityType = Value('5')
  val CxlOrdersTrdSession = Value('6')
  val CxlAllOrders = Value('7')
}

object MassCancelRejectReason extends EnumTag[String](532) {
  val Tag = this
  val MassCxlNotSupported = Value("0")
  val InvalidSecurity = Value("1")
  val InvalidUnderlying = Value("2")
  val InvalidProduct = Value("3")
  val InvalidCFICode = Value("4")
  val InvalidSecurityType = Value("5")
  val InvalidTrdSession = Value("6")
  val Other = Value("99")
}

object LongQty extends QtyTag(704) {
  val Tag = this
}

object ShortQty extends QtyTag(705) {
  val Tag = this
}

object PosReqID extends StringTag(710) {
  val Tag = this
}

object ClearingBusinessDate extends LocalMktDateTag(715) {
  val Tag = this
}

object PosMaintRptID extends StringTag(721) {
  val Tag = this
}

object TotalNumPosReports extends IntegerTag(727) {
  val Tag = this
}

object PosReqResult extends IntegerTag(728) {
  val Tag = this
}

object SettlPrice extends PriceTag(730) {
  val Tag = this
}

object PegMoveType extends EnumTag[Integer](835) {
  val Tag = this
  val Floating = Value(0)
  val Fixed = Value(1)
}

object PegOffsetType extends EnumTag[Integer](836) {
  val Tag = this
  val Price = Value(0)
  val BasisPoints = Value(1)
  val Ticks = Value(2)
  val PriceTierLevel = Value(3)
}

object PeggedPrice extends PriceTag(839) {
  val Tag = this
}

object PegScope extends EnumTag[Integer](840) {
  val Tag = this
  val Local = Value(1)
  val National = Value(2)
  val Global = Value(3)
  val NationalExcludingLocal = Value(4)
}

object LastLiquidityInd extends EnumTag[Integer](851) {
  val Tag = this
  val AddedLiquidity = Value(1)
  val RemovedLiquidity = Value(2)
  val LiquidityRoutedOut = Value(3)
}

object TotNumReports extends IntegerTag(911) {
  val Tag = this
}

object LastRptRequested extends BooleanTag(912) {
  val Tag = this
}