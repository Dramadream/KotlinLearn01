package com.fkw.kotlin.learn_01.base

import android.app.Activity
import android.app.Application
import android.os.Bundle

object ActivityStack : Application.ActivityLifecycleCallbacks {

    init {

    }

    private val list = ArrayList<Activity>()


    override fun onActivityCreated(activity: Activity, savedInstanceState: Bundle?) {
        list.add(activity)
    }


    override fun onActivityStarted(activity: Activity) {
    }


    override fun onActivityResumed(activity: Activity) {
    }

    override fun onActivityPaused(activity: Activity) {
    }

    override fun onActivityStopped(activity: Activity) {
    }

    override fun onActivityDestroyed(activity: Activity) {
        list.remove(activity)
    }

    override fun onActivitySaveInstanceState(activity: Activity, outState: Bundle) {
    }

    fun finishAll() {
        for (activity in list) {
            if (!activity.isFinishing) {
                activity.finish()
            }
        }
        list.clear()
    }


}