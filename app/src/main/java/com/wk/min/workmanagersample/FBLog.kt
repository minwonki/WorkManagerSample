package com.wk.min.workmanagersample

import android.os.Bundle

class FBLog : TrackingLog {

    override fun setScreen(name: String) {
        println("FB setScreen: $name")
        // setScreen
        // setScreen(Event.ADS_DISPLAY.key, bundle)
    }

    override fun setEvent(event: Event, params: Map<String, String>) {
        println("FB setEvent: ${event.key}")

        val bundle = Bundle()
        for (key in params.keys) {
            params[key]
            bundle.putString(key, params[key])
        }
        println("FB seEvent bundle : $bundle")
        // setEvent
        // setEvent(Event.ADS_DISPLAY.key, bundle)
    }

    override fun setUser() {
        println("FB setUser")
    }
}