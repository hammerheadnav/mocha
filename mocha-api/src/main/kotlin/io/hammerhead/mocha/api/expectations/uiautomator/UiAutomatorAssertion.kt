package io.hammerhead.mocha.api.expectations.uiautomator

import android.support.test.uiautomator.UiObject
import io.hammerhead.mocha.api.uiactions.SideEffectDelegator


class UiAutomatorAssertion(init: UiAutomatorAssertion.() -> Unit, private val uiObject: UiObject) {
    var text: String by SideEffectDelegator { check(uiObject.text == it, { "Expected $it Actual ${uiObject.text}" }) }
    var exists: Boolean by SideEffectDelegator { checkExists(uiObject, it) }

    init {
        init()
    }

    private fun checkExists(uiObject: UiObject, isExist: Boolean) {
        if (isExist)
            check(uiObject.exists(), { "Element does not exist" })
        else
            check(!uiObject.exists(), { "Element exists" })
    }
}

