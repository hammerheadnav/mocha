package io.hammerhead.mocha.dsl

import io.hammerhead.mocha.api.expectations.espresso.EspressoAssertion
import io.hammerhead.mocha.api.uiactions.espresso.EspressoExpectDelegator
import io.hammerhead.mocha.api.uiactions.espresso.EspressoUiAction

fun EspressoExpectDelegator.on(init: EspressoUiAction.() -> Unit) = this.onDelegate(init)
fun EspressoExpectDelegator.assert(init: EspressoAssertion.() -> Unit) = this.assertDelegate(init)

