package com.fkw.kotlin.learn_01.ui._08;

import kotlin.reflect.KProperty


fun main() {
    //testClass()
    testProperties()
}

fun testProperties() {
    val myClass = MyClass()
    println(myClass.test)
    myClass.test = "hello World"
    println(myClass.test)
}


class MyClass() {
    var test: String by Delegate()
}

class MyClass2() {
    /**
     * 这里是val，所以可以不用实现对应的setValue函数
     */
    val test: String by Delegate()
}

class Delegate() {
    private var privateValue: Any = ""

    /**
     * @param myClass 声明该类Delegate可以被在哪个类中使用
     * @param prop 是一个属性操作类，在当前场景下用不着，但是必须在方法参数上声明
     */
    operator fun getValue(myClass: MyClass, prop: KProperty<*>): String {
        return "${privateValue} 123"
    }

    /**
     * @param myClass 声明该类Delegate可以被在哪个类中使用
     * @param prop 是一个属性操作类，在当前场景下用不着，但是必须在方法参数上声明
     * @param value 调用setValue函数时，传过来的对象，这里的value的类型必须是委托属性的父类，
     */
    operator fun setValue(myClass: MyClass, prop: KProperty<*>, value: CharSequence) {
        privateValue = value as String
    }

    operator fun getValue(myClass: MyClass2, prop: KProperty<*>): String {
        return "${privateValue} 123"
    }

}


fun testClass() {
    val mySet: MySet<String> = MySet<String>(HashSet<String>())
    mySet.isEmpty()
    mySet.add("1")
    mySet.add("15")
}


class MySet<T>(val helperSet: HashSet<T>) : MutableSet<T> by helperSet {
    override fun isEmpty(): Boolean = false
}


