package com.wk.min.workmanagersample

import android.content.Context
import androidx.work.Worker
import androidx.work.WorkerParameters

class UploadWorker(context: Context, workerParams: WorkerParameters) :
    Worker(context, workerParams) {

    override fun doWork(): Result {
        val input = inputData.keyValueMap
        println("do work map : $input")
        uploadImages()
        return Result.success()
    }

    private fun uploadImages() {
        println("workManager uploadImages")
    }

}