package io.hammerhead.mocha.api.expectations.espresso

import android.content.Context
import android.graphics.drawable.BitmapDrawable
import android.graphics.drawable.Drawable
import android.graphics.drawable.StateListDrawable
import android.support.test.espresso.matcher.BoundedMatcher
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import org.hamcrest.Description
import org.hamcrest.Matcher
import org.hamcrest.TypeSafeMatcher


internal fun withTextColor(color: Int): Matcher<View> {
    return object : BoundedMatcher<View, TextView>(TextView::class.java) {
        override fun matchesSafely(textView: TextView): Boolean {
            return color == textView.currentTextColor
        }

        override fun describeTo(description: Description) {
            description.appendText("with text color: $color")
        }
    }
}

internal fun withEnabled(shouldBeEnabled: Boolean): Matcher<View> {
    return object : BoundedMatcher<View, View>(View::class.java) {
        override fun matchesSafely(view: View): Boolean {
            return shouldBeEnabled == view.isEnabled
        }

        override fun describeTo(description: Description) {
            description.appendText("with enabled state: $shouldBeEnabled")
        }
    }
}

internal fun withBackground(resourceId: Int): Matcher<View> {
    return object : TypeSafeMatcher<View>() {

        override fun matchesSafely(view: View): Boolean {
            return sameBitmap(view.context, view.background, resourceId)
        }

        override fun describeTo(description: Description) {
            description.appendText("has background resource " + resourceId)
        }
    }
}

internal fun withCompoundDrawable(resourceId: Int): Matcher<View> {
    return object : BoundedMatcher<View, TextView>(TextView::class.java) {
        override fun describeTo(description: Description) {
            description.appendText("has compound drawable resource " + resourceId)
        }

        public override fun matchesSafely(textView: TextView): Boolean {
            for (drawable in textView.compoundDrawables) {
                if (sameBitmap(textView.context, drawable, resourceId)) {
                    return true
                }
            }
            return false
        }
    }
}

internal fun withImageDrawable(resourceId: Int): Matcher<View> {
    return object : BoundedMatcher<View, ImageView>(ImageView::class.java!!) {
        override fun describeTo(description: Description) {
            description.appendText("has image drawable resource " + resourceId)
        }

        public override fun matchesSafely(imageView: ImageView): Boolean {
            return sameBitmap(imageView.getContext(), imageView.getDrawable(), resourceId)
        }
    }
}

private fun sameBitmap(context: Context, drawable: Drawable?, resourceId: Int): Boolean {
    var drawable = drawable
    var otherDrawable = context.getResources().getDrawable(resourceId)
    if (drawable == null || otherDrawable == null) {
        return false
    }
    if (drawable is StateListDrawable && otherDrawable is StateListDrawable) {
        drawable = drawable.current
        otherDrawable = otherDrawable!!.getCurrent()
    }
    if (drawable is BitmapDrawable) {
        val bitmap = drawable.bitmap
        val otherBitmap = (otherDrawable as BitmapDrawable).bitmap
        return bitmap.sameAs(otherBitmap)
    }
    return false
}
