package io.hammerhead.mocha.dsl

import io.hammerhead.mocha.api.expectations.espresso.EspressoAssertion
import io.hammerhead.mocha.api.uiactions.espresso.EspressoActionsDelegator
import io.hammerhead.mocha.api.uiactions.espresso.EspressoUiAction

fun EspressoActionsDelegator.click(init: EspressoUiAction.() -> Unit) {
    this.clickDelegate(init)
}

fun EspressoActionsDelegator.find(init: EspressoUiAction.() -> Unit) {
    this.findDelegate(init)
}

fun EspressoActionsDelegator.expect(init: EspressoAssertion.() -> Unit) {
    this.assertDelegate(init)
}
