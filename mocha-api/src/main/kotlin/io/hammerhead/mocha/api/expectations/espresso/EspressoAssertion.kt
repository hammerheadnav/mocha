package io.hammerhead.mocha.api.expectations.espresso

import android.support.test.espresso.Espresso
import android.support.test.espresso.ViewInteraction
import android.support.test.espresso.assertion.ViewAssertions
import android.support.test.espresso.matcher.ViewMatchers
import io.hammerhead.mocha.api.uiactions.SideEffectDelegator


class EspressoAssertion(init: EspressoAssertion.() -> Unit) {
    private var viewInteraction: ViewInteraction? = null
    var visibility: ViewMatchers.Visibility by SideEffectDelegator({
        checkNotNull(viewInteraction, { "Resource Id must be set to do visibility assertion" })
        viewInteraction!!.check(ViewAssertions.matches(ViewMatchers.withEffectiveVisibility(it)))
    })
    var id: Int by SideEffectDelegator({
        viewInteraction = Espresso.onView(ViewMatchers.withId(it))
    })

    init {
        init()
    }
}
