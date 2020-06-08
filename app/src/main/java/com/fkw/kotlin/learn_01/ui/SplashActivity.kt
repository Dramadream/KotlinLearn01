package com.fkw.kotlin.learn_01.ui

import android.os.Bundle
import com.fkw.kotlin.learn_01.R
import com.fkw.kotlin.learn_01.base.BaseActivity

class SplashActivity : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
    }
}