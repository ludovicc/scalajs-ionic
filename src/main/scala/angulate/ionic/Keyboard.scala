package angulate.ionic

import scala.scalajs.js

trait Keyboard extends js.Object {

  /**
   * Hide the keyboard accessory bar with the next, previous and done buttons.
   *
   * @param hide
   */
  def hideKeyboardAccessoryBar(hide: Boolean): Unit = js.native

  /**
   * Close the keyboard if it is open.
   */
  def close(): Unit = js.native

  /**
   * Disable native scrolling, useful if you are using JavaScript to scroll
   *
   * @param disable
   */
  def disableScroll(disable: Boolean): Unit = js.native

  /**
   * Whether or not the keyboard is currently visible.
   */
  def isVisible: Boolean = js.native
}
