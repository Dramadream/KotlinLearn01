package com.fkw.kotlin.learn_01.ui.activitylifecycle

import android.os.Bundle
import android.util.Log
import com.fkw.kotlin.learn_01.R
import com.fkw.kotlin.learn_01.base.BaseActivity

class NormalActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_normal)
        Log.i(TAG, "onCreate: ")
    }

    companion object {
        private const val TAG = "NormalActivity"
    }

    override fun onStart() {
        super.onStart()
        Log.i(Companion.TAG, "onStart: ")
    }

    override fun onResume() {
        super.onResume()
        Log.i(Companion.TAG, "onResume: ")
    }

    override fun onPause() {
        super.onPause()
        Log.i(Companion.TAG, "onPause: ")
    }

    override fun onStop() {
        super.onStop()
        Log.i(Companion.TAG, "onStop: ")
    }

    override fun onRestart() {
        super.onRestart()
        Log.i(Companion.TAG, "onRestart: ")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i(Companion.TAG, "onDestroy: ")
    }
}