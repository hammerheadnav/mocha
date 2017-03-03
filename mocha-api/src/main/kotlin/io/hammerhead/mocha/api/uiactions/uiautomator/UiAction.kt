package io.hammerhead.mocha.api.uiactions.uiautomator

import android.support.test.InstrumentationRegistry
import android.support.test.uiautomator.UiDevice
import android.support.test.uiautomator.UiSelector
import io.hammerhead.mocha.api.uiactions.SideEffectDelegator
import io.hammerhead.mocha.dsl.DslTagMarker

@DslTagMarker
abstract class UiAction(init: UiAction.() -> Unit) {
    val uiDevice = UiDevice.getInstance(InstrumentationRegistry.getInstrumentation())
    var uiSelector = UiSelector()

    var resourceId: String by SideEffectDelegator({ uiSelector = uiSelector.resourceId(it) })

    init {
        init()
    }

    abstract fun invoke()
}
