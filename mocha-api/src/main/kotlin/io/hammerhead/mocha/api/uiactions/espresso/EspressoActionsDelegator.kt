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

    internal fun swipeDownDelegate(init: EspressoUiAction.() -> Unit) = delegate(init, { swipeDown() })

    internal fun swipeUpDelegate(init: EspressoUiAction.() -> Unit) = delegate(init, { swipeUp() })

    internal fun swipeRightDelegate(init: EspressoUiAction.() -> Unit) = delegate(init, { swipeRight() })

    internal fun swipeLeftDelegate(init: EspressoUiAction.() -> Unit) = delegate(init, { swipeLeft() })

    internal fun pressKeyDelegate(int: Int, init: EspressoUiAction.() -> Unit) = delegate(init, { pressKey(int) })

    private fun delegate(init: EspressoUiAction.() -> Unit, action: (() -> ViewAction)) {
        EspressoUiAction(init, {
            onView(allOf(it)).perform(action())
        }).invoke()
    }

}
