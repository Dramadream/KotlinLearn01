package com.fkw.kotlin.learn_01.ui.static

class Util2 {

    companion object {
        @JvmStatic
        fun doAction2() {
            println("doAction2")
        }

        @JvmStatic
        val param2: String = "param2"
    }
}