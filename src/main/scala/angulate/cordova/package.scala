package angulate

import scala.scalajs.js
import scala.scalajs.js.UndefOr

package object cordova {

  val cordova: UndefOr[Cordova] = js.Dynamic.global.cordova.asInstanceOf[UndefOr[Cordova]]

}
