package angulate.ionic

import scala.scalajs.js

trait Platform extends js.Object {

  /**
   * Whether the device is ready
   */
  val isReady: Boolean

  /**
   * Whether the device is full screen.
   */
  val isFullScreen: Boolean

  /**
   * An array of all platforms found.
   */
  val platforms: js.Array[String]

  /**
   * What grade the current platform is.
   */
  val grade: String

  /**
   * Trigger a callback once the device is ready, or immediately if the device is already ready.
   * This method can be run from anywhere and does not need to be wrapped by any additional methods.
   * When the app is within a WebView (Cordova), it'll fire the callback once the device is ready.
   * If the app is within a web browser, it'll fire the callback after window.load.
   */
  def ready(callback: js.Function): Unit = js.native

  /**
   * Set the grade of the device: 'a', 'b', or 'c'. 'a' is the best (most css features enabled),
   * 'c' is the worst. By default, sets the grade depending on the current device.
   */
  def setGrade(grade: String): Unit = js.native

  /**
   * Return the current device (given by Cordova).
   */
  def device: Device = js.native

  /**
   * Check if we are running within a WebView (such as Cordova).
   */
  def isWebView: Boolean = js.native

  /**
   * Whether we are running on iPad.
   */
  def isIPad: Boolean = js.native

  /**
   * Whether we are running on iOS.
   */
  def isIOS: Boolean = js.native

  /**
   * Whether we are running on Android
   */
  def isAndroid: Boolean = js.native

  /**
   * Whether we are running on Windows Phone.
   */
  def isWindowsPhone: Boolean = js.native

  /**
   * The name of the current platform.
   */
  def platform: String = js.native

  /**
   * The version of the current device platform.
   */
  def version: String = js.native

  /**
   * Exit the application.
   */
  def exitApp(): Unit = js.native

  /**
   * Shows or hides the device status bar (in Cordova).
   *
   * @param shouldShow Whether or not to show the status bar.
   */
  def showStatusBar(shouldShow: Boolean): Unit = js.native

  /**
   * Sets whether the app is full screen or not (in Cordova).
   *
   * @param showFullScreen Whether or not to set the app to full screen. Defaults to true.
   * @param showStatusBar Whether or not to show the device's status bar. Defaults to false.
   */
  def fullScreen(showFullScreen: Boolean, showStatusBar: Boolean): Unit = js.native
}

trait Device extends js.Object {

  /** Get the version of Cordova running on the device. */
  val cordova: String
  /**
   * The device.model returns the name of the device's model or product. The value is set
   * by the device manufacturer and may be different across versions of the same product.
   */
  val model: String
  /** device.name is deprecated as of version 2.3.0. Use device.model instead. */
  val name: String
  /** Get the device's operating system name. */
  val platform: String
  /** Get the device's Universally Unique Identifier (UUID). */
  val uuid: String
  /** Get the operating system version. */
  val version: String
}