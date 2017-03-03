package io.hammerhead.mocha.api.uiactions.espresso

import android.support.test.espresso.Espresso.onView
import android.support.test.espresso.ViewAction
import android.support.test.espresso.ViewInteraction
import android.support.test.espresso.action.ViewActions.click
import io.hammerhead.mocha.api.expectations.espresso.EspressoAssertion
import io.hammerhead.mocha.dsl.DslTagMarker
import org.hamcrest.core.AllOf.allOf

@DslTagMarker
class EspressoActionsDelegator {
    private lateinit var viewInteraction: ViewInteraction

    internal fun clickDelegate(init: EspressoUiAction.() -> Unit) = delegate(init, { click() })
    internal fun findDelegate(init: EspressoUiAction.() -> Unit) = delegate(init)

    internal fun assertDelegate(init: EspressoAssertion.() -> Unit) {
        EspressoAssertion(init, viewInteraction)
    }

    private fun delegate(init: EspressoUiAction.() -> Unit, action: (() -> ViewAction)? = null) {
        this.viewInteraction = EspressoUiAction(init, {
            if (action == null) {
                onView(allOf(it))
            } else {
                onView(allOf(it)).perform(action())
            }
        }).invoke()
    }

}
