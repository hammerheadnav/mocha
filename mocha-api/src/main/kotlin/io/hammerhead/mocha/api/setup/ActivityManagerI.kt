package io.hammerhead.mocha.api.setup


interface ActivityManagerI{
    var packageName: String
    fun launchActivity()
}
