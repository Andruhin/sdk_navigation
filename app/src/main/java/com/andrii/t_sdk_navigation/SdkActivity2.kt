package com.andrii.t_sdk_navigation

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class SdkActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_2)
        findViewById<Button>(R.id.btn_start_activity).setOnClickListener {
            val intent = Intent(this@SdkActivity2, SdkActivity3::class.java)
            startActivity(intent)

        }
        findViewById<Button>(R.id.btn_start_main_activity).setOnClickListener {
            val intent = Intent(this@SdkActivity2, PrepareSdkActivity::class.java)
            startActivity(intent)
        }
        Log.d("ActivityState:", "Activity2 onCreate")
    }

    override fun onStart() {
        super.onStart()
        Log.d("ActivityState:", "Activity2 onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.d("ActivityState:", "Activity2 onResume")
    }

    override fun onNewIntent(intent: Intent?) {
        super.onNewIntent(intent)
        Log.d("ActivityState:", "Activity2 onNewIntent")
    }

    override fun onStop() {
        super.onStop()
        Log.d("ActivityState:", "Activity2 onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("ActivityState:", "Activity2 onDestroy")
    }
}