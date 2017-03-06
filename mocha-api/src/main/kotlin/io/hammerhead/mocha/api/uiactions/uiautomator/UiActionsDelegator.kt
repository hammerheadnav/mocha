package io.hammerhead.mocha.api.uiactions.uiautomator

import android.support.test.InstrumentationRegistry
import android.support.test.uiautomator.UiDevice
import android.support.test.uiautomator.UiSelector
import io.hammerhead.mocha.dsl.DslTagMarker

@DslTagMarker
class UiActionsDelegator {
    val uiDevice = UiDevice.getInstance(InstrumentationRegistry.getInstrumentation())

    internal fun clickDelegate(init: UiAction.() -> Unit) = delegate(init, { uiDevice.findObject(it).click() })

    internal fun expectNotNullDelegate(init: UiAction.() -> Unit) = delegate(init, { checkNotNull { uiDevice.findObject(it) } })

    private fun delegate(init: UiAction.() -> Unit, action: (UiSelector) -> Unit) {
        UiAction(init, action).invoke()
    }
}

