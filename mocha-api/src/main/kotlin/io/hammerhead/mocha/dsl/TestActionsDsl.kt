package io.hammerhead.mocha.dsl

import io.hammerhead.mocha.api.TestAction
import io.hammerhead.mocha.api.setup.Setup
import io.hammerhead.mocha.api.uiactions.espresso.EspressoActionsDelegator
import io.hammerhead.mocha.api.uiactions.uiautomator.UiActions

fun testAction(description: String, init: TestAction.() -> Unit) {
    val testAction = TestAction(description)
    testAction.init()
}

fun TestAction.setup(init: Setup.() -> Unit) {
    Setup().init()
}

fun TestAction.action(init: EspressoActionsDelegator.() -> Unit) {
    EspressoActionsDelegator().init()
}

fun TestAction.automatorAction(init: UiActions.() -> Unit) {
    UiActions().init()
}

