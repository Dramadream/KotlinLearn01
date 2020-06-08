package com.fkw.kotlin.learn_01.ui.startand

import android.os.Bundle
import com.blankj.utilcode.util.LogUtils
import com.fkw.kotlin.learn_01.R
import com.fkw.kotlin.learn_01.base.BaseActivity

class StandardActivity : BaseActivity() {

    private val list = listOf<String>("Apple", "Pear", "Banana", "Grape")


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_with)

        // with函数会接受两个参数，第一个参数是任意类型的对象，第二个参数是Lambda表达式。
        // 第一个参数是Lambda表达式的上下文，也就是可以直接省略receiver.
        // 并且Lambda表达式的最后一行是with函数的返回值
        val recevicer = ""
        // 之前讲过，lambda表达式如果是最后一个参数，可以放到括号外面
        // val result = with(recevicer, { })
        // val result = with(recevicer) { }


        traditionFun()
        // with函数，两个参数，第一个参数是lambda表达式的上下文，Lambda表达式最后一行是返回值
        withFun()
        // run函数，一个参数，调用者是lambda表达式的上下文，Lambda表达式最后一行是返回值
        runFun()
        // apply函数，一个参数，调用者是lambda表达式的上下文，返回值是调用者对象本身
        applyFun()

        alsoFun()

    }

    private fun alsoFun() {

        val result = StringBuilder().also {
            it.append("123")
        }
        LogUtils.i(result.toString())
    }

    private fun applyFun() {
        val result = StringBuilder().apply {
            append("Start eating fruits:\n")
            for (fruit in list) {
                append(" ").append(fruit).append(" ")
            }
            append("\nAll was ate").toString()
        }
        LogUtils.i(result.toString())

    }

    private fun runFun() {
        val result = StringBuilder().run {
            append("Start eating fruits:\n")
            for (fruit in list) {
                append(" ").append(fruit).append(" ")
            }
            append("\nAll was ate").toString()
        }
        LogUtils.i(result)
    }

    private fun withFun() {
        val result = with(StringBuilder()) {
            append("Start eating fruits:\n")
            for (fruit in list) {
                append(" ").append(fruit).append(" ")
            }
            append("\nAll was ate").toString()
        }
        LogUtils.i(result)
    }

    private fun traditionFun() {
        val builder = StringBuilder()
        builder.append("Start eating fruits:\n")
        for (fruit in list) {
            builder.append(" ").append(fruit).append(" ")
        }
        val result = builder.append("\nAll was ate").toString()
        LogUtils.i(result)
    }
}