package io.hammerhead.mocha.api.uiactions.espresso

import android.support.test.espresso.ViewInteraction
import android.support.test.espresso.matcher.ViewMatchers
import android.view.View
import io.hammerhead.mocha.api.expectations.espresso.withImageDrawable
import io.hammerhead.mocha.api.uiactions.SideEffectDelegator
import io.hammerhead.mocha.dsl.DslTagMarker
import org.hamcrest.Matcher
import org.hamcrest.Matchers.startsWith

@DslTagMarker
class EspressoUiAction(init: EspressoUiAction.() -> Unit, val action: (List<Matcher<View>>) -> ViewInteraction) : Function0<ViewInteraction> {
    val matchersList = ArrayList<Matcher<View>>()

    var id: Int by SideEffectDelegator { matchersList.add(ViewMatchers.withId(it)) }
    var resName: String by SideEffectDelegator { matchersList.add(ViewMatchers.withResourceName(it)) }
    var text: String by SideEffectDelegator { matchersList.add(ViewMatchers.withText(it)) }
    var assignableFrom: Class<out View> by SideEffectDelegator { matchersList.add(ViewMatchers.isAssignableFrom(it)) }
    var textStartsWith: String by SideEffectDelegator { matchersList.add(ViewMatchers.withText(startsWith(it))) }
    var imageDrawableId: Int by SideEffectDelegator { matchersList.add(withImageDrawable(it)) }

    init {
        init()
    }

    override fun invoke(): ViewInteraction {
        return action(matchersList)
    }
}
