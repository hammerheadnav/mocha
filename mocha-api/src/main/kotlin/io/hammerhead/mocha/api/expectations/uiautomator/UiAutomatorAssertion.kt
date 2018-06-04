package io.hammerhead.mocha.api.expectations.uiautomator

import android.support.test.uiautomator.UiObject
import io.hammerhead.mocha.api.uiactions.SideEffectDelegator


class UiAutomatorAssertion(init: UiAutomatorAssertion.() -> Unit, val uiObject: UiObject) {
    var text: String by SideEffectDelegator { check(uiObject.text == it, { "Expected $it Actual ${uiObject.text}" }) }
    var exists: Boolean by SideEffectDelegator { check(uiObject.exists() == it) }
    var waitForExists: Long by SideEffectDelegator { check(uiObject.waitForExists(it) == true)  }
    var isEnabled: Boolean by SideEffectDelegator { check(uiObject.isEnabled() == it)}
    var isFocusable: Boolean by SideEffectDelegator { check(uiObject.isFocusable() == it)}
    var isFocused: Boolean by SideEffectDelegator { check(uiObject.isFocused() == it)}
    var isCheckable: Boolean by SideEffectDelegator { check(uiObject.isCheckable() == it)}
    var isChecked: Boolean by SideEffectDelegator { check(uiObject.isChecked() == it)}
    var isClickable: Boolean by SideEffectDelegator { check(uiObject.isClickable() == it)}
    var isLongClickable: Boolean by SideEffectDelegator { check(uiObject.isLongClickable() == it)}
    var isScrollable: Boolean by SideEffectDelegator { check(uiObject.isScrollable() == it)}
    var isSelected: Boolean by SideEffectDelegator { check(uiObject.isSelected() == it)}
    var longClick: Boolean by SideEffectDelegator { check(uiObject.longClick() == it)}
    var customCheck: (() -> Boolean) by SideEffectDelegator { check(it()) }

    init {
        init()
    }
}

