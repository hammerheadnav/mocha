package io.hammerhead.mocha.dsl

import io.hammerhead.mocha.api.setup.ActivityManagerI
import io.hammerhead.mocha.api.setup.Setup

fun Setup.lauchActivity(init: ActivityManagerI.() -> Unit) {
    launchActivityDelegate(init)
}
