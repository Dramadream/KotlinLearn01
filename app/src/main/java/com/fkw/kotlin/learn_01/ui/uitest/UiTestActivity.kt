package com.fkw.kotlin.learn_01.ui.uitest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.app.AlertDialog
import com.fkw.kotlin.learn_01.R
import kotlinx.android.synthetic.main.activity_ui_test.*

class UiTestActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ui_test)
        supportActionBar?.hide()
        btn.setOnClickListener { showDialog() }
        title_bar.setTitle("Ui Test")

    }

    private fun showDialog() {

        AlertDialog.Builder(this).apply {
            setTitle("This is a dialog")
            setCancelable(false)
            setPositiveButton("Confirm") { dialog, which -> dialog.dismiss() }
            setNegativeButton("Cancel") { dialog, which -> }
            show()
        }
    }
}