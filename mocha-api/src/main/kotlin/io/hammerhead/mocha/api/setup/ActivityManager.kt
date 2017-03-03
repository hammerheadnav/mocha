package io.hammerhead.mocha.api.setup

import android.content.Intent
import android.support.test.InstrumentationRegistry
import io.hammerhead.mocha.api.SetupConstants.Companion.INVALID_PACKAGE_NAME


class ActivityManager: ActivityManagerI {

    override var packageName: String = INVALID_PACKAGE_NAME

    override fun launchActivity() {
        val context = InstrumentationRegistry.getContext()
        val intent = context.packageManager
                .getLaunchIntentForPackage(packageName)
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK)
        context.startActivity(intent)
    }

}
