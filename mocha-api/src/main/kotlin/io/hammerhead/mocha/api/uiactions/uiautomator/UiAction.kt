package io.hammerhead.mocha.api.uiactions.uiautomator

import android.support.test.uiautomator.UiSelector
import io.hammerhead.mocha.api.uiactions.SideEffectDelegator
import io.hammerhead.mocha.dsl.DslTagMarker

@DslTagMarker
class UiAction(init: UiAction.() -> Unit, val action: (UiSelector) -> Unit) {
    var uiSelector = UiSelector()

    var resourceId: String by SideEffectDelegator { uiSelector = uiSelector.resourceId(it) }
    var text: String by SideEffectDelegator { uiSelector = uiSelector.text(it) }

    init {
        init()
    }

    fun invoke() {
        action(uiSelector)
    }
}
