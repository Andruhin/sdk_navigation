package com.andrii.t_sdk_navigation

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class PrepareSdkActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_prepare_sdk)
        findViewById<Button>(R.id.btn_start_activity).setOnClickListener {
            val intent = Intent(this@PrepareSdkActivity, SdkActivity2::class.java)
            startActivity(intent)
        }

        findViewById<Button>(R.id.btn_start_main_activity).setOnClickListener {
            val intent = Intent(this@PrepareSdkActivity, PrepareSdkActivity::class.java)
            startActivity(intent)
        }

        Log.d("ActivityState:", "PrepareSdkActivity onCreate starterIntent hash="+intent.hashCode())
    }

    override fun onStart() {
        super.onStart()
        Log.d("ActivityState:", "PrepareSdkActivity onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.d("ActivityState:", "PrepareSdkActivity onResume")
    }

    override fun onNewIntent(intent: Intent?) {
        super.onNewIntent(intent)
        Log.d("ActivityState:", "PrepareSdkActivity onNewIntent: hash=" + intent?.hashCode())
        if (intent?.hasExtra("data") == true){
            setResult(Activity.RESULT_OK)
            finish()
            Toast.makeText(this, "Received data success!", Toast.LENGTH_SHORT).show()
        }
    }

    override fun onRestart() {
        super.onRestart()
        Log.d("ActivityState:", "PrepareSdkActivity onRestart")
    }

    override fun onStop() {
        super.onStop()
        Log.d("ActivityState:", "PrepareSdkActivity onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("ActivityState:", "PrepareSdkActivity onDestroy")
    }
}