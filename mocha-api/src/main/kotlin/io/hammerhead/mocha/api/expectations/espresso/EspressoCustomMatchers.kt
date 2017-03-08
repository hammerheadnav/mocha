package io.hammerhead.mocha.api.expectations.espresso

import android.support.test.espresso.matcher.BoundedMatcher
import android.support.test.internal.util.Checks
import android.view.View
import android.widget.TextView
import org.hamcrest.Description
import org.hamcrest.Matcher


fun withTextColor(color: Int): Matcher<View> {
    Checks.checkNotNull(color)
    return object : BoundedMatcher<View, TextView>(TextView::class.java) {
        override fun matchesSafely(warning: TextView): Boolean {
            return color == warning.currentTextColor
        }

        override fun describeTo(description: Description) {
            description.appendText("with text color: ")
        }
    }
}
