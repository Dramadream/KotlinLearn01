package com.fkw.kotlin.learn_01.ui._07storage.sp

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.fkw.kotlin.learn_01.R
import com.fkw.kotlin.learn_01.base.BaseActivity

class SpActivity : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sp)

        val sharedPreferences = getSharedPreferences("test", Context.MODE_PRIVATE)
        val edit = sharedPreferences.edit()
        edit.putString("SP_STR","test")

        // 在不涉及到跨进程通过SharedPreferences共享数据的情况，就永远使用apply，
        // apply方法执行后可以立即在任意地方读取到更新后对应的key值，不会出现因为apply是异步就需要等待一会儿，再读取的情况。
        edit.apply()
        // edit.commit()
    }
}