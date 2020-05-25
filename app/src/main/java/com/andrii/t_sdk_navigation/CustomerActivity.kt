package com.andrii.t_sdk_navigation

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button

class CustomerActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_customer)
        findViewById<Button>(R.id.btn_start_prepare_sdk_activity).setOnClickListener {
            val intent = Intent(this@CustomerActivity, PrepareSdkActivity::class.java)
            startActivityForResult(intent, REQUEST_CODE)
        }
        Log.d("ActivityState:", "CustomerActivity onCreate")
    }

    override fun onStart() {
        super.onStart()
        Log.d("ActivityState:", "CustomerActivity onStart")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d("ActivityState:", "CustomerActivity onRestart")
    }

    override fun onResume() {
        super.onResume()
        Log.d("ActivityState:", "CustomerActivity onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.d("ActivityState:", "CustomerActivity onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d("ActivityState:", "CustomerActivity onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("ActivityState:", "CustomerActivity onDestroy")
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        Log.d("ActivityState:", "onActivityResult requestCode= $requestCode resultCode= $resultCode")
    }

    companion object{
        const val REQUEST_CODE : Int = 123
    }
}