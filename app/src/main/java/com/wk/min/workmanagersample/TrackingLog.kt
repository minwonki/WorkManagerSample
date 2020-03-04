package com.wk.min.workmanagersample

interface TrackingLog {
    fun setScreen(name: String)
    fun setEvent(event: Event, params: Map<String, String>)
    fun setUser()
}

enum class Event(val key: String) {
    IMPRESS_ACTION("impression"),
    DISPLAY_ACTION("display")
}
