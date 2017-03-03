package io.hammerhead.mocha.dsl

import io.hammerhead.mocha.api.uiactions.uiautomator.ClickAction
import io.hammerhead.mocha.api.uiactions.uiautomator.UiAction
import io.hammerhead.mocha.api.uiactions.uiautomator.UiActions

/**
 * UI Actions
 */
fun UiActions.click(init: UiAction.() -> Unit) {
    val clickAction = ClickAction(init)
    clickAction.invoke()
}
