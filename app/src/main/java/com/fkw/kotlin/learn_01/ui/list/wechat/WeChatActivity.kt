package com.fkw.kotlin.learn_01.ui.list.wechat

import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.fkw.kotlin.learn_01.R
import com.fkw.kotlin.learn_01.base.BaseActivity
import kotlinx.android.synthetic.main.activity_we_chat.*

class WeChatActivity : BaseActivity() {

    lateinit var list: List<Msg>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_we_chat)


        val linearLayoutManager = LinearLayoutManager(this)
        recyclerView.layoutManager = linearLayoutManager

        val data = MsgUtil.getMockData()
        val adapter = WeChatAdapter(data)
        recyclerView.adapter = adapter


        btnSendMsg.setOnClickListener {
            val msg = etWeChat.text.toString()
            msg.let {
                val last = data.last()
                val type = if (last.type === Msg.TYPE_FATHER) Msg.TYPE_DAUGHTER else Msg.TYPE_FATHER
                data.add(Msg(msg, type))
                adapter.notifyItemInserted(data.size - 1)
                recyclerView.scrollToPosition(data.size - 1)
            }
            etWeChat.setText("")

        }

        // 延迟初始化的非空判断
        val initialized = ::list.isInitialized
    }
}