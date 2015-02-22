package angulate.cordova.plugins

import scala.scalajs.js
import scala.scalajs.js.UndefOr

object StatusBar {

  val statusBar: UndefOr[StatusBar] = js.Dynamic.global.StatusBar.asInstanceOf[UndefOr[StatusBar]]

}

/**
* The StatusBar object provides some functions to customize the iOS and Android StatusBar.
*/
trait StatusBar extends js.Object {

    /**
     * On iOS 7, make the statusbar overlay or not overlay the WebView.
     * @param isOverlay  On iOS 7, set to false to make the statusbar appear like iOS 6.
     *                   Set the style and background color to suit using the other functions.
     */
    def overlaysWebView(isOverlay: Boolean): Unit = js.native

    /**
     * Use the default statusbar (dark text, for light backgrounds).
     */
    def styleDefault(): Unit = js.native

    /**
     * Use the lightContent statusbar (light text, for dark backgrounds).
     */
    def styleLightContent(): Unit = js.native

    /**
     * Use the blackTranslucent statusbar (light text, for dark backgrounds).
     */
    def styleBlackTranslucent(): Unit = js.native

    /**
     * Use the blackOpaque statusbar (light text, for dark backgrounds).
     */
    def styleBlackOpaque(): Unit = js.native

    /**
     * On iOS 7, when you set StatusBar.statusBarOverlaysWebView to false,
     * you can set the background color of the statusbar by color name.
     * @param color             Supported color names are:
     *                              black, darkGray, lightGray, white, gray, red, green, blue, cyan, yellow, magenta, orange, purple, brown
     */
    def backgroundColorByName(color: String): Unit = js.native

    /**
     * Sets the background color of the statusbar by a hex string.
     * @param color             CSS shorthand properties are also supported.
     *                              On iOS 7, when you set StatusBar.statusBarOverlaysWebView to false, you can set the background color of the statusbar by a hex string (#RRGGBB).
     *                              On WP7 and WP8 you can also specify values as #AARRGGBB, where AA is an alpha value
     */
    def backgroundColorByHexString(color: String): Unit = js.native

    /**
     * Hide the statusbar.
     */
    def hide(): Unit = js.native

    /**
     * Show the statusbar.
     */
    def show(): Unit = js.native

    /**
     * Read this property to see if the statusbar is visible or not.
     */
    def isVisible: Boolean = js.native
}
