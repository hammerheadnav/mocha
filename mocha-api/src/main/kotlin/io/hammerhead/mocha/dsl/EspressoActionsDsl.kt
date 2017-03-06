package io.hammerhead.mocha.dsl

import io.hammerhead.mocha.api.uiactions.espresso.EspressoActionsDelegator
import io.hammerhead.mocha.api.uiactions.espresso.EspressoExpectDelegator
import io.hammerhead.mocha.api.uiactions.espresso.EspressoUiAction

fun EspressoActionsDelegator.click(init: EspressoUiAction.() -> Unit) {
    this.clickDelegate(init)
}

fun EspressoActionsDelegator.expect(init: EspressoExpectDelegator.() -> Unit) {
    EspressoExpectDelegator().init()
}
