package com.fkw.kotlin.learn_01.ui.activitylifecycle

import android.os.Bundle
import android.util.Log
import com.blankj.utilcode.util.ScreenUtils
import com.fkw.kotlin.learn_01.R
import com.fkw.kotlin.learn_01.base.BaseActivity

class DialogActivity : BaseActivity() {
    companion object {
        private const val TAG = "DialogActivity"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dialog)
        val attributes = window.attributes
        attributes.width = (ScreenUtils.getScreenWidth()*0.65).toInt()
        attributes.height = (ScreenUtils.getScreenHeight() * 0.65).toInt()
        window.attributes = attributes
        Log.i(TAG, "onCreate: ")

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