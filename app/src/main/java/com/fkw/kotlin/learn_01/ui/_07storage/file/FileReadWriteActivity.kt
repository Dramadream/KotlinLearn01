package com.fkw.kotlin.learn_01.ui._07storage.file

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.fkw.kotlin.learn_01.R
import com.fkw.kotlin.learn_01.base.BaseActivity
import kotlinx.android.synthetic.main.activity_file_read_write.*
import java.io.*

class FileReadWriteActivity : BaseActivity() {

    companion object {
        const val FILE_NAME = "fileReadAndWrite"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_file_read_write)

        btn_write.setOnClickListener { writeToFile() }
        btn_read.setOnClickListener { readFromFile() }
    }

    /**
     * 从File文件中读取数据
     */
    private fun readFromFile() {
        val sb = StringBuilder()
        try {
            val openFileInput = openFileInput("12312")
            val bufferedReader = BufferedReader(InputStreamReader(openFileInput))
            // 注意 use 和 forEachLine函数的使用
            bufferedReader.use {
                bufferedReader.forEachLine {
                    sb.append(it)
                }
            }
        } catch (e: FileNotFoundException) {
            e.printStackTrace()
        }
        tv_file.text = sb.toString()
    }

    /**
     * 获取EditText中的文本，放到File中
     */
    private fun writeToFile() {
        var text = et_file.text.toString()
        if (text.isNullOrEmpty()) {
            text = "Your input is empty！！"
        }

        // mode参数有两种方式，MODE_PRIVATE指当已有文件时，新内容会覆盖旧内容
        // MODE_APPEND表示当已有文件时，新的内容会追加进去
        val openFileOutput = openFileOutput(FILE_NAME, Context.MODE_APPEND)
        val bufferedWriter = BufferedWriter(OutputStreamWriter(openFileOutput))
        // use函数，能保证Lambda表达式中的代码全部执行之后，自动将外层的流关闭
        bufferedWriter.use { it.write(text) }

    }
}