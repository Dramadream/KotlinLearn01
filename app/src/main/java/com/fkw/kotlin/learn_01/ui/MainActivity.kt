package com.fkw.kotlin.learn_01.ui

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import com.blankj.utilcode.util.LogUtils
import com.fkw.kotlin.learn_01.R
import com.fkw.kotlin.learn_01.base.BaseActivity
import com.fkw.kotlin.learn_01.ui.activitylifecycle.LifeCycleActivity
import com.fkw.kotlin.learn_01.ui.frag.NewsActivity
import com.fkw.kotlin.learn_01.ui.list.ListActivity
import com.fkw.kotlin.learn_01.ui.list.RecyclerActivity
import com.fkw.kotlin.learn_01.ui.list.wechat.WeChatActivity
import com.fkw.kotlin.learn_01.ui.startand.StandardActivity
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

        btnListView.setOnClickListener {
            val java: Class<out Activity> = ListActivity::class.java
            startActivity(Intent(this, java))
        }

        btnRecyclerView.setOnClickListener {
            startActivity(Intent(this, RecyclerActivity::class.java))
        }

        btnWeChat.setOnClickListener {
            startActivity(Intent(this, WeChatActivity::class.java))
        }

        btn_frag.setOnClickListener {
            startActivity(Intent(this, NewsActivity::class.java))
        }

    }


}