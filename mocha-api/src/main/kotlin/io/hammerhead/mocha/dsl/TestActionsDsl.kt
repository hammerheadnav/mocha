package io.hammerhead.mocha.dsl

import io.hammerhead.mocha.api.TestAction
import io.hammerhead.mocha.api.setup.Setup
import io.hammerhead.mocha.api.uiactions.espresso.EspressoActionsDelegator
import io.hammerhead.mocha.api.uiactions.uiautomator.UiActionsDelegator
import io.hammerhead.mocha.api.uiactions.uiautomator.UiActionsDelegator2

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

fun TestAction.automatorAction(init: UiActionsDelegator.() -> Unit) {
    UiActionsDelegator().init()
}

fun TestAction.automatorAction2(init: UiActionsDelegator2.() -> Unit) {
    UiActionsDelegator2().init()
}

