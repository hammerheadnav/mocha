package io.hammerhead.mocha.api.uiactions.uiautomator

import io.hammerhead.mocha.api.uiactions.uiautomator.UiAction
import io.hammerhead.mocha.dsl.DslTagMarker

@DslTagMarker
class UiActions

class ClickAction(init: UiAction.() -> Unit) : UiAction(init) {
    override fun invoke() {
        uiDevice.findObject(uiSelector).click()
    }
}
