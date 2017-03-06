package io.hammerhead.mocha.dsl

import io.hammerhead.mocha.api.uiactions.uiautomator.UiAction
import io.hammerhead.mocha.api.uiactions.uiautomator.UiActionsDelegator
import io.hammerhead.mocha.api.uiactions.uiautomator.UiAutomatorExpectDelegator

fun UiActionsDelegator.click(init: UiAction.() -> Unit) = this.clickDelegate(init)
fun UiActionsDelegator.clickAndWait(delay: Long, init: UiAction.() -> Unit) = this.clickAndWaitDelegate(delay, init)
fun UiActionsDelegator.expect(init: UiAutomatorExpectDelegator.() -> Unit) = UiAutomatorExpectDelegator().init()

