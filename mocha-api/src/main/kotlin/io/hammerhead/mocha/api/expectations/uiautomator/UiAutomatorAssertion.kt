package io.hammerhead.mocha.api.expectations.uiautomator

import android.support.test.uiautomator.UiObject
import io.hammerhead.mocha.api.uiactions.SideEffectDelegator


class UiAutomatorAssertion(init: UiAutomatorAssertion.() -> Unit, private val uiObject: UiObject) {
    var text: String by SideEffectDelegator { check(uiObject.text == it, { "Expected $it Actual ${uiObject.text}" }) }
    var exists: Boolean by SideEffectDelegator { check(uiObject.exists() == it) }
    var waitForExists: Long by SideEffectDelegator { check(uiObject.waitForExists(it) == true)  }

    init {
        init()
    }
}

