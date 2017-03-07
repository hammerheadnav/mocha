package io.hammerhead.mocha.api.expectations.uiautomator

import android.support.test.uiautomator.UiObject
import io.hammerhead.mocha.api.uiactions.SideEffectDelegator


class UiAutomatorAssertion(init: UiAutomatorAssertion.() -> Unit, private val uiObject: UiObject) {
    var text: String by SideEffectDelegator { check(uiObject.text == it, { "Expected $it Actual ${uiObject.text}" }) }
    var exists: Boolean by SideEffectDelegator { checkExists(uiObject, it, 0) }
    var waitForExists: Long by SideEffectDelegator { checkExists(uiObject, true, it) }

    init {
        init()
    }

    private fun checkExists(uiObject: UiObject, shouldExist: Boolean, timeOut: Long) {
        if (shouldExist)
            check(uiObject.waitForExists(timeOut), { "Element does not exist" })
        else
            check(!uiObject.waitForExists(timeOut), { "Element exists" })
    }
}

