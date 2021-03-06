package com.fkw.kotlin.learn_01.ui.list

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.fkw.kotlin.learn_01.R
import com.fkw.kotlin.learn_01.base.BaseActivity
import kotlinx.android.synthetic.main.activity_recycler.*

class RecyclerActivity : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recycler)

        val data = FruitUtil.getData()
        val layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        recyclerView.layoutManager = layoutManager
        val adapter = FruitRecyclerAdapter(data)
        recyclerView.adapter = adapter

    }
}