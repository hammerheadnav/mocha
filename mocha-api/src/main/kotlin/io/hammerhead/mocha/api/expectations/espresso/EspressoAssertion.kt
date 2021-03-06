package io.hammerhead.mocha.api.expectations.espresso

import android.support.test.espresso.ViewInteraction
import android.support.test.espresso.assertion.ViewAssertions
import android.support.test.espresso.matcher.ViewMatchers
import android.support.test.espresso.matcher.ViewMatchers.*
import android.view.View
import org.hamcrest.CoreMatchers.not
import org.hamcrest.Matcher
import kotlin.properties.ReadWriteProperty
import kotlin.reflect.KProperty


class EspressoAssertion(init: EspressoAssertion.() -> Unit, private val viewInteraction: ViewInteraction?) {
    var visibility: ViewMatchers.Visibility by Delegator(::withEffectiveVisibility)
    var text: String by Delegator(::withText)
    var textResId: Int by Delegator(::withText)
    var spinnerText: String by Delegator(::withSpinnerText)
    var enabled: Boolean by Delegator(::withEnabled)
    var checked: Boolean by Delegator { if (it) isChecked() else isNotChecked() }
    var color: Int by Delegator(::withTextColor)
    var displayed: Boolean by Delegator {  if(it) isDisplayed() else not(isDisplayed())}
    var backgroundResId: Int by Delegator(::withBackground)

    inner class Delegator<K, T>(val block: (T) -> Matcher<View>) : ReadWriteProperty<K, T> {
        override fun getValue(thisRef: K, property: KProperty<*>): T {
            throw UnsupportedOperationException("not implemented")
        }

        override fun setValue(thisRef: K, property: KProperty<*>, value: T) {
            checkNotNull(viewInteraction, { "Missing 'on { }' block before 'assert { }'" })
            viewInteraction?.check(ViewAssertions.matches(block(value)))
        }
    }

    init {
        init()
    }
}
