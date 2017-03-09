package io.hammerhead.mocha.api.expectations.espresso

import android.support.test.espresso.matcher.BoundedMatcher
import android.view.View
import android.widget.TextView
import org.hamcrest.Description
import org.hamcrest.Matcher


fun withTextColor(color: Int): Matcher<View> {
    return object : BoundedMatcher<View, TextView>(TextView::class.java) {
        override fun matchesSafely(textView: TextView): Boolean {
            return color == textView.currentTextColor
        }

        override fun describeTo(description: Description) {
            description.appendText("with text color: $color")
        }
    }
}

fun withEnabled(shouldBeEnabled: Boolean): Matcher<View> {
    return object : BoundedMatcher<View, View>(View::class.java) {
        override fun matchesSafely(view: View): Boolean {
            return shouldBeEnabled == view.isEnabled
        }

        override fun describeTo(description: Description) {
            description.appendText("with enabled state: $shouldBeEnabled")
        }
    }
}
