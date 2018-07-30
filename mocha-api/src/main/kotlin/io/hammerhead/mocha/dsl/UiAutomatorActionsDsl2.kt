package io.hammerhead.mocha.dsl

import io.hammerhead.mocha.api.uiactions.uiautomator.UiAction
import io.hammerhead.mocha.api.uiactions.uiautomator.UiAction2
import io.hammerhead.mocha.api.uiactions.uiautomator.UiActionsDelegator2
import io.hammerhead.mocha.api.uiactions.uiautomator.UiAutomatorExpectDelegator
import java.io.File

fun UiActionsDelegator2.click2(init: UiAction2.() -> Unit) = this.clickDelegate(init)
//fun UiActionsDelegator2.clickAndWait(delay: Long, init: UiAction.() -> Unit) = this.clickAndWaitDelegate(delay, init)
//fun UiActionsDelegator2.clearTextField(init: UiAction.() -> Unit) = this.clearTextFieldDelegate(init)
//fun UiActionsDelegator2.longClick(init: UiAction.() -> Unit) = this.longClickDelegate(init)
//fun UiActionsDelegator2.clickAndWaitForNewWindow(init: UiAction.() -> Unit) = this.clickAndWaitForNewWindowDelegate(init)
//fun UiActionsDelegator2.setText(text: String, init: UiAction.() -> Unit) = this.setTextDelegate(text, init)
//fun UiActionsDelegator2.swipeDown(steps: Int, init: UiAction.() -> Unit) = this.swipeDownDelegate(steps, init)
//fun UiActionsDelegator2.swipeLeft(steps: Int, init: UiAction.() -> Unit) = this.swipeLeftDelegate(steps, init)
//fun UiActionsDelegator2.swipeRight(steps: Int, init: UiAction.() -> Unit) = this.swipeRightDelegate(steps, init)
fun UiActionsDelegator2.swipeUp2(steps: Int, init: UiAction2.() -> Unit) = this.swipeUpDelegate(init)
//fun UiActionsDelegator2.waitForExists(timeout: Long, init: UiAction.() -> Unit) = this.waitForExistsDelegate(timeout, init)
//fun UiActionsDelegator2.waitUntilGone(timeout: Long, init: UiAction.() -> Unit) = this.waitUntilGoneDelegate(timeout, init)
//fun UiActionsDelegator2.pressKeyCode(keyCode: Int,init: UiAction.() -> Unit) = this.pressKeyCodeDelegate(keyCode, init)
//fun UiActionsDelegator2.pressDelete(init: UiAction.() -> Unit) = this.pressDeleteDelegate(init)
//fun UiActionsDelegator2.pressEnter(init: UiAction.() -> Unit) = this.pressEnterDelegate(init)
//fun UiActionsDelegator2.pressHome(init: UiAction.() -> Unit) = this.pressHomeDelegate(init)
//fun UiActionsDelegator2.pressMenu(init: UiAction.() -> Unit) = this.pressMenuDelegate(init)
//fun UiActionsDelegator2.pressRecentApps(init: UiAction.() -> Unit) = this.pressRecentAppsDelegate(init)
//fun UiActionsDelegator2.pressSearch(init: UiAction.() -> Unit) = this.pressSearchDelegate(init)
//fun UiActionsDelegator2.pressBack(init: UiAction.() -> Unit) = this.pressBackDelegate(init)
//fun UiActionsDelegator2.openNotification(init: UiAction.() -> Unit) = this.openNotificationDelegate(init)
//fun UiActionsDelegator2.openQuickSettings(init: UiAction.() -> Unit) = this.openQuickSettingsDelegate(init)
//fun UiActionsDelegator2.sleep(init: UiAction.() -> Unit) = this.sleepDelegate(init)
//fun UiActionsDelegator2.wakeUp(init: UiAction.() -> Unit) = this.wakeUpDelegate(init)
//fun UiActionsDelegator2.takeScreenshot(file: File,init: UiAction.() -> Unit) = this.takeScreenshotDelegate(file, init)





fun UiActionsDelegator2.expect(init: UiAutomatorExpectDelegator.() -> Unit) = UiAutomatorExpectDelegator().init()
