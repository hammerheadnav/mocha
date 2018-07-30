package io.hammerhead.mocha.api.uiactions.uiautomator

import android.support.test.uiautomator.By
import android.support.test.uiautomator.BySelector
import android.support.test.uiautomator.UiSelector
import io.hammerhead.mocha.api.uiactions.SideEffectDelegator
import io.hammerhead.mocha.dsl.DslTagMarker

@DslTagMarker
class UiAction2(init: UiAction2.() -> Unit, val action: (BySelector) -> Unit) {

    var className = By.clazz("ff")



//    var resourceId: String by SideEffectDelegator { uiSelector = uiSelector.resourceId(it) }
//    var text: String by SideEffectDelegator { uiSelector = uiSelector.text(it) }
//    var textContains : String by SideEffectDelegator { uiSelector = uiSelector.textContains(it)}
//    var className : String by SideEffectDelegator { uiSelector = uiSelector.className(it)}
//    var classNameMatches : String by SideEffectDelegator { uiSelector = uiSelector.classNameMatches(it)}
//    var resourceIdMatches : String by SideEffectDelegator { uiSelector = uiSelector.resourceIdMatches(it)}
//    var textMatches : String by SideEffectDelegator { uiSelector = uiSelector.textMatches(it)}
//    var textStartsWith : String by SideEffectDelegator { uiSelector = uiSelector.textStartsWith(it)}

    init {
        init()
    }

    fun invoke() {
        return action(className)
    }

}