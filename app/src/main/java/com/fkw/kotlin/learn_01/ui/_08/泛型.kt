package com.fkw.kotlin.learn_01.ui._08


fun main() {

}

fun <T : Comparable<T>> sort(list: List<T>) {}

fun <T> copyWhenGreater(list: List<T>, threshold: T): List<String>
        where T : CharSequence,
              T : Comparable<T> {
    return list.filter { it > threshold }.map { it.toString() }
}