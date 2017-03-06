package io.hammerhead.mocha.dsl

import io.hammerhead.mocha.api.expectations.uiautomator.UiAutomatorAssertion
import io.hammerhead.mocha.api.uiactions.uiautomator.UiAction
import io.hammerhead.mocha.api.uiactions.uiautomator.UiAutomatorExpectDelegator


fun UiAutomatorExpectDelegator.on(init: UiAction.() -> Unit) = onDelegate(init)
fun UiAutomatorExpectDelegator.assert(init: UiAutomatorAssertion.() -> Unit) = assertDelegate(init)
