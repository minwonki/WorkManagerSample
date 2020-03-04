package com.wk.min.workmanagersample

import android.app.Application

@Suppress("unused")
class WMApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        println("WMApplication onCreate")


        JPTrackingLog.addTrackingStrategy(FBLog())
        JPTrackingLog.addTrackingStrategy(JPlog(this))

    }

}