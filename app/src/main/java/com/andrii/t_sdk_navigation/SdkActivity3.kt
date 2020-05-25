package com.andrii.t_sdk_navigation

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class SdkActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)
        findViewById<Button>(R.id.btn_start_activity).setOnClickListener {
            val intent = Intent(this@SdkActivity3, PrepareSdkActivity::class.java)
            intent.flags = Intent.FLAG_ACTIVITY_SINGLE_TOP or Intent.FLAG_ACTIVITY_CLEAR_TOP
            intent.putExtra("data", "success")
            startActivity(intent)
            this@SdkActivity3.finish()
        }
        Log.d("ActivityState:", "Activity3 onCreate")
    }

    override fun onStart() {
        super.onStart()
        Log.d("ActivityState:", "Activity3 onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.d("ActivityState:", "Activity3 onResume")
    }

    override fun onNewIntent(intent: Intent?) {
        super.onNewIntent(intent)
        Log.d("ActivityState:", "Activity3 onNewIntent")
    }

    override fun onStop() {
        super.onStop()
        Log.d("ActivityState:", "Activity3 onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("ActivityState:", "Activity3 onDestroy")
    }
}