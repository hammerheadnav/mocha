package io.hammerhead.mocha.api.uiactions.uiautomator

import android.support.test.InstrumentationRegistry
import android.support.test.uiautomator.UiDevice
import android.support.test.uiautomator.UiObject
import io.hammerhead.mocha.api.expectations.uiautomator.UiAutomatorAssertion


class UiAutomatorExpectDelegator {
    private var uiObject: UiObject? = null

    internal fun onDelegate(init: UiAction.() -> Unit) {
        UiAction(init, {
            uiObject = UiDevice.getInstance(InstrumentationRegistry.getInstrumentation()).findObject(it)
        }).invoke()
    }

    internal fun assertDelegate(init: UiAutomatorAssertion.() -> Unit) {
        checkNotNull(uiObject, { "Missing on { } block before assert { }" })
        UiAutomatorAssertion(init, uiObject!!)
    }

}
