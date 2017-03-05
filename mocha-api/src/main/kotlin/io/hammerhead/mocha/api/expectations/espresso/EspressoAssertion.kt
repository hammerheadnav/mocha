package io.hammerhead.mocha.api.expectations.espresso

import android.support.test.espresso.Espresso
import android.support.test.espresso.ViewInteraction
import android.support.test.espresso.assertion.ViewAssertions
import android.support.test.espresso.matcher.ViewMatchers
import io.hammerhead.mocha.api.uiactions.SideEffectDelegator


class EspressoAssertion(val id: Int, init: EspressoAssertion.() -> Unit) {
    val viewInteraction: ViewInteraction = Espresso.onView(ViewMatchers.withId(id))

    var visibility: ViewMatchers.Visibility by SideEffectDelegator({
        viewInteraction.check(ViewAssertions.matches(ViewMatchers.withEffectiveVisibility(it)))
    })

    var text: String by SideEffectDelegator({
        viewInteraction.check(ViewAssertions.matches(ViewMatchers.withText(it)))
    })

    var textResId: Int by SideEffectDelegator({
        viewInteraction.check(ViewAssertions.matches(ViewMatchers.withText(it)))
    })

    var spinnerText: String by SideEffectDelegator({
        viewInteraction.check(ViewAssertions.matches(ViewMatchers.withSpinnerText(it)))
    })

    init {
        init()
    }
}
