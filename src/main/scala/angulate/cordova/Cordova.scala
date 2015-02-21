package angulate.cordova

import angulate.ionic.Keyboard

import scala.scalajs.js
import scala.scalajs.js.UndefOr

trait Cordova extends js.Object {

  val plugins: Plugins = js.native

}

trait Plugins extends js.Object {

  val Keyboard: UndefOr[Keyboard] = js.native

}