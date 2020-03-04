package com.wk.min.workmanagersample

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_click.setOnClickListener {
            val maps = HashMap<String, String>()
            maps["id"] = "12345"
            maps["type"] = "click"
            JPTrackingLog.setEvent(Event.DISPLAY_ACTION, maps)
        }
    }

    override fun onResume() {
        super.onResume()
        println("MainActivity onResume")
        JPTrackingLog.setScreen("main")
    }

}
