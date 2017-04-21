package io.hammerhead.mocha.dsl

import io.hammerhead.mocha.api.uiactions.espresso.EspressoActionsDelegator
import io.hammerhead.mocha.api.uiactions.espresso.EspressoExpectDelegator
import io.hammerhead.mocha.api.uiactions.espresso.EspressoUiAction

fun EspressoActionsDelegator.click(init: EspressoUiAction.() -> Unit) {
    this.clickDelegate(init)
}

fun EspressoActionsDelegator.setText(stringToSet: String, init: EspressoUiAction.() -> Unit) {
    this.setTextDelegate(stringToSet, init)
}

fun EspressoActionsDelegator.clearText(init: EspressoUiAction.() -> Unit){
    this.clearTextDelegate(init)
}

fun EspressoActionsDelegator.swipeDown(init: EspressoUiAction.() -> Unit){
    this.swipeDownDelegate(init)
}

fun EspressoActionsDelegator.swipeUp(init: EspressoUiAction.() -> Unit){
    this.swipeUpDelegate(init)
}

fun EspressoActionsDelegator.swipeRight(init: EspressoUiAction.() -> Unit){
    this.swipeRightDelegate(init)
}

fun EspressoActionsDelegator.swipeLeft(init: EspressoUiAction.() -> Unit){
    this.swipeLeftDelegate(init)
}

fun EspressoActionsDelegator.pressKey(int: Int){
    this.pressKeyDelegate(int)
}

fun EspressoActionsDelegator.expect(init: EspressoExpectDelegator.() -> Unit) {
    EspressoExpectDelegator().init()
}
