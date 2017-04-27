package io.hammerhead.mocha.dsl

import io.hammerhead.mocha.api.uiactions.uiautomator.UiAction
import io.hammerhead.mocha.api.uiactions.uiautomator.UiActionsDelegator
import io.hammerhead.mocha.api.uiactions.uiautomator.UiAutomatorExpectDelegator
import java.io.File

fun UiActionsDelegator.click(init: UiAction.() -> Unit) = this.clickDelegate(init)
fun UiActionsDelegator.clickAndWait(delay: Long, init: UiAction.() -> Unit) = this.clickAndWaitDelegate(delay, init)
fun UiActionsDelegator.clearTextFieldDelegate(init: UiAction.() -> Unit) = this.clearTextFieldDelegate(init)
fun UiActionsDelegator.longClickDelegate(init: UiAction.() -> Unit) = this.longClickDelegate(init)
fun UiActionsDelegator.clickAndWaitForNewWindowDelegate(init: UiAction.() -> Unit) = this.clickAndWaitForNewWindowDelegate(init)
fun UiActionsDelegator.setTextDelegate(text: String, init: UiAction.() -> Unit) = this.setTextDelegate(text, init)
fun UiActionsDelegator.swipeDownDelegate(steps: Int, init: UiAction.() -> Unit) = this.swipeDownDelegate(steps, init)
fun UiActionsDelegator.swipeLeftDelegate(steps: Int, init: UiAction.() -> Unit) = this.swipeLeftDelegate(steps, init)
fun UiActionsDelegator.swipeRightDelegate(steps: Int, init: UiAction.() -> Unit) = this.swipeRightDelegate(steps, init)
fun UiActionsDelegator.swipeUpDelegate(steps: Int, init: UiAction.() -> Unit) = this.swipeUpDelegate(steps, init)
fun UiActionsDelegator.waitForExistsDelegate(timeout: Long, init: UiAction.() -> Unit) = this.waitForExistsDelegate(timeout, init)
fun UiActionsDelegator.waitUntilGoneDelegate(timeout: Long, init: UiAction.() -> Unit) = this.waitUntilGoneDelegate(timeout, init)
fun UiActionsDelegator.pressKeyCodeDelegate(keyCode: Int,init: UiAction.() -> Unit) = this.pressKeyCodeDelegate(keyCode, init)
fun UiActionsDelegator.pressDeleteDelegate(init: UiAction.() -> Unit) = this.pressDeleteDelegate(init)
fun UiActionsDelegator.pressEnterDelegate(init: UiAction.() -> Unit) = this.pressEnterDelegate(init)
fun UiActionsDelegator.pressHomeDelegate(init: UiAction.() -> Unit) = this.pressHomeDelegate(init)
fun UiActionsDelegator.pressMenuDelegate(init: UiAction.() -> Unit) = this.pressMenuDelegate(init)
fun UiActionsDelegator.pressRecentAppsDelegate(init: UiAction.() -> Unit) = this.pressRecentAppsDelegate(init)
fun UiActionsDelegator.pressSearchDelegate(init: UiAction.() -> Unit) = this.pressSearchDelegate(init)
fun UiActionsDelegator.pressBackDelegate(init: UiAction.() -> Unit) = this.pressBackDelegate(init)
fun UiActionsDelegator.openNotificationDelegate(init: UiAction.() -> Unit) = this.openNotificationDelegate(init)
fun UiActionsDelegator.openQuickSettingsDelegate(init: UiAction.() -> Unit) = this.openQuickSettingsDelegate(init)
fun UiActionsDelegator.sleepDelegate(init: UiAction.() -> Unit) = this.sleepDelegate(init)
fun UiActionsDelegator.wakeUpDelegate(init: UiAction.() -> Unit) = this.wakeUpDelegate(init)
fun UiActionsDelegator.takeScreenshotDelegate(file: File,init: UiAction.() -> Unit) = this.takeScreenshotDelegate(file, init)





fun UiActionsDelegator.expect(init: UiAutomatorExpectDelegator.() -> Unit) = UiAutomatorExpectDelegator().init()
