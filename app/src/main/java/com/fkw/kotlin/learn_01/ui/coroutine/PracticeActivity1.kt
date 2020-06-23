package com.fkw.kotlin.learn_01.ui.coroutine

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.fkw.kotlin.learn_01.R
import kotlinx.android.synthetic.main.activity_main.view.*
import kotlinx.android.synthetic.main.activity_practice1.*
import kotlinx.coroutines.*

private const val TAG = "PracticeActivity1"

class PracticeActivity1 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_practice1)

        GlobalScope.launch(Dispatchers.Main) {
            val data = getData()
            val processData = processData(data)
            textView.text = processData
        }


    }

    private suspend fun getData(): String = withContext(Dispatchers.IO) {
        delay(300)
        Log.i(TAG, "getData: " + Thread.currentThread().name)
        "hen_coder"
        //return "hen_coder"
    }


    private suspend fun processData(data: String): String =
        withContext(Dispatchers.IO) {
            delay(200)
            Log.i(TAG, "getData: " + Thread.currentThread().name)

            // 假设这个函数也比较耗时
            data.split("_") // 将"hen_coder"变成"hen"和"coder"
                .map { it.capitalize() }// 将"hen"和"coder"变成"Hen"和"Coder"
                .reduce { acc, s -> acc + s }// 将"Hen"和"Coder"变成"HenCoder"

        }
}