package com.fkw.kotlin.learn_01.base

import android.app.Application

class App : Application() {

    override fun onCreate() {
        super.onCreate()
        registerActivityLifecycleCallbacks(ActivityStack)
    }
}