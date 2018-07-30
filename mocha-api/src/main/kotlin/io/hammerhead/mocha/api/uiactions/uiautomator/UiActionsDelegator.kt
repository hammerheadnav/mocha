package io.hammerhead.mocha.api.uiactions.uiautomator

import android.support.test.InstrumentationRegistry
import android.support.test.uiautomator.UiDevice
import android.support.test.uiautomator.UiSelector
import io.hammerhead.mocha.dsl.DslTagMarker
import java.io.File

@DslTagMarker
class UiActionsDelegator {
    val uiDevice = UiDevice.getInstance(InstrumentationRegistry.getInstrumentation())

    internal fun clickDelegate(init: UiAction.() -> Unit) = delegate(init, { uiDevice.findObject(it).click() })
    internal fun clickAndWaitDelegate(delay: Long, init: UiAction.() -> Unit) = delegate(init, { uiDevice.findObject(it).clickAndWaitForNewWindow(delay) })
    internal fun clearTextFieldDelegate(init: UiAction.() -> Unit) = delegate(init, {uiDevice.findObject(it).clearTextField() })
    internal fun longClickDelegate(init: UiAction.() -> Unit) = delegate(init, {uiDevice.findObject(it).longClick() })
    internal fun clickAndWaitForNewWindowDelegate(init: UiAction.() -> Unit) = delegate(init, {uiDevice.findObject(it).clickAndWaitForNewWindow() })
    internal fun setTextDelegate(text: String, init: UiAction.() -> Unit) = delegate(init, { uiDevice.findObject(it).text = text })
    internal fun swipeDownDelegate(steps: Int, init: UiAction.() -> Unit) = delegate(init, {uiDevice.findObject(it).swipeDown(steps) })
    internal fun swipeLeftDelegate(steps: Int, init: UiAction.() -> Unit) = delegate(init, {uiDevice.findObject(it).swipeLeft(steps) })
    internal fun swipeRightDelegate(steps: Int, init: UiAction.() -> Unit) = delegate(init, {uiDevice.findObject(it).swipeRight(steps) })
    internal fun swipeUpDelegate(steps: Int, init: UiAction.() -> Unit) = delegate(init, {uiDevice.findObject(it).swipeUp(steps) })
    internal fun waitForExistsDelegate(timeout: Long, init: UiAction.() -> Unit) = delegate(init, {uiDevice.findObject(it).waitForExists(timeout) })
    internal fun waitUntilGoneDelegate(timeout: Long, init: UiAction.() -> Unit) = delegate(init, {uiDevice.findObject(it).waitUntilGone(timeout) })
    internal fun pressKeyCodeDelegate(keyCode: Int, init: UiAction.() -> Unit) = delegate(init, {uiDevice.pressKeyCode(keyCode) })
    internal fun pressDeleteDelegate(init: UiAction.() -> Unit) = delegate(init, {uiDevice.pressDelete() })
    internal fun pressEnterDelegate(init: UiAction.() -> Unit) = delegate(init, {uiDevice.pressEnter() })
    internal fun pressHomeDelegate(init: UiAction.() -> Unit) = delegate(init, {uiDevice.pressHome() })
    internal fun pressMenuDelegate(init: UiAction.() -> Unit) = delegate(init, {uiDevice.pressMenu() })
    internal fun pressRecentAppsDelegate(init: UiAction.() -> Unit) = delegate(init, {uiDevice.pressRecentApps() })
    internal fun pressSearchDelegate(init: UiAction.() -> Unit) = delegate(init, {uiDevice.pressSearch() })
    internal fun pressBackDelegate(init: UiAction.() -> Unit) = delegate(init, {uiDevice.pressBack() })
    internal fun openNotificationDelegate(init: UiAction.() -> Unit) = delegate(init, {uiDevice.openNotification() })
    internal fun openQuickSettingsDelegate(init: UiAction.() -> Unit) = delegate(init, {uiDevice.openQuickSettings() })
    internal fun sleepDelegate(init: UiAction.() -> Unit) = delegate(init, {uiDevice.sleep() })
    internal fun wakeUpDelegate(init: UiAction.() -> Unit) = delegate(init, {uiDevice.wakeUp() })
    internal fun takeScreenshotDelegate(file: File, init: UiAction.() -> Unit) = delegate(init, {uiDevice.takeScreenshot(file) })





    private fun delegate(init: UiAction.() -> Unit, action: (UiSelector) -> Unit) {
        UiAction(init, action).invoke()
    }
}




