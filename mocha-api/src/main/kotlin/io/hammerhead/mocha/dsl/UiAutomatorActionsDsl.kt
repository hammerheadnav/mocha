package io.hammerhead.mocha.dsl

import io.hammerhead.mocha.api.uiactions.uiautomator.UiAction
import io.hammerhead.mocha.api.uiactions.uiautomator.UiActionsDelegator
import io.hammerhead.mocha.api.uiactions.uiautomator.UiAutomatorExpectDelegator
import java.io.File

fun UiActionsDelegator.click(init: UiAction.() -> Unit) = this.clickDelegate(init)
fun UiActionsDelegator.clickAndWait(delay: Long, init: UiAction.() -> Unit) = this.clickAndWaitDelegate(delay, init)
fun UiActionsDelegator.clearTextField(init: UiAction.() -> Unit) = this.clearTextFieldDelegate(init)
fun UiActionsDelegator.longClick(init: UiAction.() -> Unit) = this.longClickDelegate(init)
fun UiActionsDelegator.clickAndWaitForNewWindow(init: UiAction.() -> Unit) = this.clickAndWaitForNewWindowDelegate(init)
fun UiActionsDelegator.setText(text: String, init: UiAction.() -> Unit) = this.setTextDelegate(text, init)
fun UiActionsDelegator.swipeDown(steps: Int, init: UiAction.() -> Unit) = this.swipeDownDelegate(steps, init)
fun UiActionsDelegator.swipeLeft(steps: Int, init: UiAction.() -> Unit) = this.swipeLeftDelegate(steps, init)
fun UiActionsDelegator.swipeRight(steps: Int, init: UiAction.() -> Unit) = this.swipeRightDelegate(steps, init)
fun UiActionsDelegator.swipeUp(steps: Int, init: UiAction.() -> Unit) = this.swipeUpDelegate(steps, init)
fun UiActionsDelegator.waitForExists(timeout: Long, init: UiAction.() -> Unit) = this.waitForExistsDelegate(timeout, init)
fun UiActionsDelegator.waitUntilGone(timeout: Long, init: UiAction.() -> Unit) = this.waitUntilGoneDelegate(timeout, init)
fun UiActionsDelegator.pressKeyCode(keyCode: Int,init: UiAction.() -> Unit) = this.pressKeyCodeDelegate(keyCode, init)
fun UiActionsDelegator.pressDelete(init: UiAction.() -> Unit) = this.pressDeleteDelegate(init)
fun UiActionsDelegator.pressEnter(init: UiAction.() -> Unit) = this.pressEnterDelegate(init)
fun UiActionsDelegator.pressHome(init: UiAction.() -> Unit) = this.pressHomeDelegate(init)
fun UiActionsDelegator.pressMenu(init: UiAction.() -> Unit) = this.pressMenuDelegate(init)
fun UiActionsDelegator.pressRecentApps(init: UiAction.() -> Unit) = this.pressRecentAppsDelegate(init)
fun UiActionsDelegator.pressSearch(init: UiAction.() -> Unit) = this.pressSearchDelegate(init)
fun UiActionsDelegator.pressBack(init: UiAction.() -> Unit) = this.pressBackDelegate(init)
fun UiActionsDelegator.openNotification(init: UiAction.() -> Unit) = this.openNotificationDelegate(init)
fun UiActionsDelegator.openQuickSettings(init: UiAction.() -> Unit) = this.openQuickSettingsDelegate(init)
fun UiActionsDelegator.sleep(init: UiAction.() -> Unit) = this.sleepDelegate(init)
fun UiActionsDelegator.wakeUp(init: UiAction.() -> Unit) = this.wakeUpDelegate(init)
fun UiActionsDelegator.takeScreenshot(file: File,init: UiAction.() -> Unit) = this.takeScreenshotDelegate(file, init)





fun UiActionsDelegator.expect(init: UiAutomatorExpectDelegator.() -> Unit) = UiAutomatorExpectDelegator().init()
