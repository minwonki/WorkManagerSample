package com.wk.min.workmanagersample

import android.content.Context
import androidx.work.OneTimeWorkRequestBuilder
import androidx.work.WorkManager
import androidx.work.workDataOf

class JPlog(private val context: Context): TrackingLog {

    override fun setScreen(name: String) {
        val uploadWorkRequest = OneTimeWorkRequestBuilder<UploadWorker>().build()
        WorkManager.getInstance(context).enqueue(uploadWorkRequest)
    }

    override fun setEvent(event: Event, params: Map<String, String>) {
        val listPair : MutableList<Pair<String, Any?>> = ArrayList()
        for (key in params.keys) {
            listPair.add(Pair(key, params[key]))
        }

        val bundleData = workDataOf(*listPair.toTypedArray())
        val uploadWorkRequest = OneTimeWorkRequestBuilder<UploadWorker>()
            .setInputData(bundleData)
            .build()
        WorkManager.getInstance(context).enqueue(uploadWorkRequest)
    }

    override fun setUser() {
        // not working
    }
}