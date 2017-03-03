package io.hammerhead.mocha.api.expectations.espresso

import android.support.test.espresso.ViewInteraction
import android.support.test.espresso.assertion.ViewAssertions
import android.support.test.espresso.matcher.ViewMatchers
import io.hammerhead.mocha.api.uiactions.SideEffectDelegator


class EspressoAssertion(init: EspressoAssertion.() -> Unit, val viewInteraction: ViewInteraction) {
    var visibility: ViewMatchers.Visibility by SideEffectDelegator({
        viewInteraction.check(ViewAssertions.matches(ViewMatchers.withEffectiveVisibility(it)))
    })

    init {
        init()
    }
}
