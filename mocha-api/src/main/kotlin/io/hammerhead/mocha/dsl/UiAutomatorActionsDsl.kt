package io.hammerhead.mocha.dsl

import io.hammerhead.mocha.api.uiactions.uiautomator.UiAction
import io.hammerhead.mocha.api.uiactions.uiautomator.UiActionsDelegator

fun UiActionsDelegator.click(init: UiAction.() -> Unit) {
    this.clickDelegate(init)
}

fun UiActionsDelegator.expectNotNull(init: UiAction.() -> Unit) {
    this.expectNotNullDelegate(init)
}
