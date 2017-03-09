package io.hammerhead.mocha.api.uiactions.espresso

import android.support.test.espresso.Espresso.onView
import android.support.test.espresso.ViewAction
import android.support.test.espresso.action.ViewActions.*
import io.hammerhead.mocha.dsl.DslTagMarker
import org.hamcrest.core.AllOf.allOf

@DslTagMarker
class EspressoActionsDelegator {

    internal fun clickDelegate(init: EspressoUiAction.() -> Unit) = delegate(init, { click() })

    internal fun setTextDelegate(stringToSet: String, init: EspressoUiAction.() -> Unit) = delegate(init, { typeText(stringToSet) })

    internal fun clearTextDelegate(init: EspressoUiAction.() -> Unit) = delegate(init, { clearText() })

    private fun delegate(init: EspressoUiAction.() -> Unit, action: (() -> ViewAction)) {
        EspressoUiAction(init, {
            onView(allOf(it)).perform(action())
        }).invoke()
    }

}
