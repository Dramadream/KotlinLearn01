package com.fkw.kotlin.learn_01.ui.list.wechat

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.fkw.kotlin.learn_01.R

data class Msg(val content: String, val type: Int) {
    companion object {
        const val TYPE_FATHER = 1
        const val TYPE_DAUGHTER = 2
    }
}

object MsgUtil {
    fun getMockData(): ArrayList<Msg> {
        val data = ArrayList<Msg>()
        data.apply {
            add(Msg("hello daddy", Msg.TYPE_DAUGHTER))
            add(Msg("i love you", Msg.TYPE_DAUGHTER))
            add(Msg("i love you too", Msg.TYPE_FATHER))
        }
        return data
    }
}


sealed class BaseHolder(view: View) : RecyclerView.ViewHolder(view) {
    abstract fun setText(content: String)
}

class LeftHolder(view: View) : BaseHolder(view) {
     val tv: TextView = view.findViewById(R.id.tvWeChatLeft)
    override fun setText(content: String) {
        // 这里为什不能用view ？？？
        tv.text = content
    }
}

class RightHolder(view: View) : BaseHolder(view) {
     val tv: TextView = view.findViewById(R.id.tvWeChatRight)
    override fun setText(content: String) {
        tv.text = content
    }
}
