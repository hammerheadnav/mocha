package io.hammerhead.mocha.api.uiactions.espresso

import android.support.test.espresso.Espresso
import android.support.test.espresso.ViewInteraction
import io.hammerhead.mocha.api.expectations.espresso.EspressoAssertion
import org.hamcrest.core.AllOf


class EspressoExpectDelegator {
    private var viewInteraction: ViewInteraction? = null
    internal fun onDelegate(init: EspressoUiAction.() -> Unit) = delegate(init)

    internal fun assertDelegate(init: EspressoAssertion.() -> Unit) = EspressoAssertion(init, viewInteraction)

    private fun delegate(init: EspressoUiAction.() -> Unit) {
        viewInteraction = EspressoUiAction(init, {
            Espresso.onView(AllOf.allOf(it))
        }).invoke()
    }
}
