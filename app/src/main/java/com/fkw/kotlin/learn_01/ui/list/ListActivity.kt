package com.fkw.kotlin.learn_01.ui.list

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.blankj.utilcode.util.ToastUtils
import com.fkw.kotlin.learn_01.R
import kotlinx.android.synthetic.main.activity_list.*

class ListActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list)
        val data = FruitUtil.getData()
        val adapter = FruitListAdapter(this, R.layout.item_fruit, data)
        listView.adapter = adapter
        // lambda表达式中，未使用的到的参数尽量用下划线来代替
        listView.setOnItemClickListener { _, _, position, _ ->
            //LogUtils.i(data[position])
            ToastUtils.showShort(data[position].name)
        }
    }


}