package com.fkw.kotlin.learn_01.ui.activitylifecycle

import android.content.Intent
import android.os.Bundle
import android.util.Log
import com.fkw.kotlin.learn_01.R
import com.fkw.kotlin.learn_01.base.BaseActivity
import kotlinx.android.synthetic.main.activity_life_cycle.*

class LifeCycleActivity : BaseActivity() {
    companion object {
        private const val TAG = "LifeCycleActivity"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_life_cycle)
        Log.i(TAG, "onCreate: ")

        btn_normal.setOnClickListener { startActivity(Intent(this, NormalActivity::class.java)) }
        btn_dialog.setOnClickListener { startActivity(Intent(this, DialogActivity::class.java)) }

    }

    override fun onStart() {
        super.onStart()
        Log.i(TAG, "onStart: ")
    }

    override fun onResume() {
        super.onResume()
        Log.i(TAG, "onResume: ")
    }

    override fun onPause() {
        super.onPause()
        Log.i(TAG, "onPause: ")
    }

    override fun onStop() {
        super.onStop()
        Log.i(TAG, "onStop: ")
    }

    override fun onRestart() {
        super.onRestart()
        Log.i(TAG, "onRestart: ")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i(TAG, "onDestroy: ")
    }


}