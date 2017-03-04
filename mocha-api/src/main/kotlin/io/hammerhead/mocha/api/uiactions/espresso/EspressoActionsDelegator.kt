package io.hammerhead.mocha.api.uiactions.espresso

import android.support.test.espresso.Espresso.onView
import android.support.test.espresso.ViewAction
import android.support.test.espresso.action.ViewActions.click
import io.hammerhead.mocha.api.expectations.espresso.EspressoAssertion
import io.hammerhead.mocha.dsl.DslTagMarker
import org.hamcrest.core.AllOf.allOf

@DslTagMarker
class EspressoActionsDelegator {

    internal fun clickDelegate(init: EspressoUiAction.() -> Unit) = delegate(init, { click() })

    internal fun assertDelegate(id : Int,init: EspressoAssertion.() -> Unit) {
        EspressoAssertion(id, init)
    }

    private fun delegate(init: EspressoUiAction.() -> Unit, action: (() -> ViewAction)) {
        EspressoUiAction(init, {
            onView(allOf(it)).perform(action())
        }).invoke()
    }

}
