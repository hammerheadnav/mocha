package io.hammerhead.mocha.api.setup


class Setup {
    val activityManager = ActivityManager()

    fun launchActivityDelegate(init : ActivityManagerI.() -> Unit){
        activityManager.init()
        activityManager.launchActivity()
    }
//    lateinit var
//
//    fun launchActivityDelegate() {
//        val context = InstrumentationRegistry.getContext()
//        val intent = context.packageManager
//                .getLaunchIntentForPackage("io.hammerhead.mocha")
//        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK)
//        context.launchActivityDelegate(intent)
//    }

}
