package com.fkw.kotlin.learn_01.ui

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import com.fkw.kotlin.learn_01.R
import com.fkw.kotlin.learn_01.base.BaseActivity
import com.fkw.kotlin.learn_01.ui._07storage.file.FileReadWriteActivity
import com.fkw.kotlin.learn_01.ui.activitylifecycle.LifeCycleActivity
import com.fkw.kotlin.learn_01.ui.coroutine.PracticeActivity1
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

        btn_activity_life_cycle.setOnClickListener { jump(LifeCycleActivity::class.java) }
        btn_standard_fun_with.setOnClickListener { jump(StandardActivity::class.java) }
        btn_ui_test.setOnClickListener { jump(UiTestActivity::class.java) }
        btnListView.setOnClickListener { jump(ListActivity::class.java) }
        btnRecyclerView.setOnClickListener { jump(RecyclerActivity::class.java) }
        btnWeChat.setOnClickListener { jump(WeChatActivity::class.java) }
        btn_frag.setOnClickListener { jump(NewsActivity::class.java) }
        btn_storage_file.setOnClickListener { jump(FileReadWriteActivity::class.java) }
        btn_coroutine_pratice1.setOnClickListener { jump(PracticeActivity1::class.java) }

    }

    private fun jump(clz: Class<out Activity>) {
        startActivity(Intent(this, clz))
    }


}