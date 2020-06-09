package com.fkw.kotlin.learn_01.ui.uitest

import android.app.Activity
import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import androidx.constraintlayout.widget.ConstraintLayout
import com.blankj.utilcode.util.ToastUtils
import com.fkw.kotlin.learn_01.R
import kotlinx.android.synthetic.main.layout_title_bar.view.*

class TitleBar(context: Context, attrs: AttributeSet) : ConstraintLayout(context, attrs) {


    init {
        LayoutInflater.from(context).inflate(R.layout.layout_title_bar, this)

        btn_title_back.setOnClickListener {
            val activity = context as Activity
            activity.onBackPressed()
        }

        btn_title_edit.setOnClickListener {
            ToastUtils.showShort("You clicked edit button")
        }
    }

    fun setTitle(msg: String) {
        tv_title.setText(msg)
    }
}