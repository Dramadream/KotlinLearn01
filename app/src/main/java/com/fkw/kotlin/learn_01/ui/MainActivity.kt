package com.fkw.kotlin.learn_01.ui

import android.content.Intent
import android.os.Bundle
import com.blankj.utilcode.util.LogUtils
import com.fkw.kotlin.learn_01.R
import com.fkw.kotlin.learn_01.base.BaseActivity
import com.fkw.kotlin.learn_01.ui.activitylifecycle.LifeCycleActivity
import com.fkw.kotlin.learn_01.ui.startand.StandardActivity
import com.fkw.kotlin.learn_01.ui.static.Util
import com.fkw.kotlin.learn_01.ui.static.Util2
import com.fkw.kotlin.learn_01.ui.static.doAction3
import com.fkw.kotlin.learn_01.ui.static.param3
import com.fkw.kotlin.learn_01.ui.uitest.UiTestActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        LogUtils.i("onCreate")
        btn_activity_life_cycle.setOnClickListener {
            startActivity(Intent(this, LifeCycleActivity::class.java))
        }

        btn_standard_fun_with.setOnClickListener {
            startActivity(Intent(this, StandardActivity::class.java))
        }

        btn_ui_test.setOnClickListener {
            startActivity(Intent(this, UiTestActivity::class.java))
        }

    }
}