package com.wk.min.workmanagersample

object JPTrackingLog: TrackingLog {

    private var trackingList : MutableList<TrackingLog> = ArrayList()

    fun addTrackingStrategy(item: TrackingLog) {
        trackingList.add(item)
    }

    override fun setScreen(name: String) {
        for (item in trackingList) {
            item.setScreen(name)
        }
    }

    override fun setEvent(event: Event, params: Map<String, String>) {
        for (item in trackingList) {
            item.setEvent(Event.DISPLAY_ACTION, params)
        }
    }

    override fun setUser() {
        for (item in trackingList) {
            item.setUser()
        }
    }

}