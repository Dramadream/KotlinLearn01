package com.fkw.kotlin.learn_01.ui.list

import com.fkw.kotlin.learn_01.R

object FruitUtil {

    fun getData(): ArrayList<Fruit> {
        val data = ArrayList<Fruit>()
        repeat(2) {
            data.add(Fruit("Apple", R.drawable.ic_apple))
            data.add(Fruit("Banana", R.drawable.ic_banana))
            data.add(Fruit("Cherry", R.drawable.ic_cherry))
            data.add(Fruit("Grape", R.drawable.ic_grape))
            data.add(Fruit("Mango", R.drawable.ic_mango))
            data.add(Fruit("Orange", R.drawable.ic_orange))
            data.add(Fruit("Pear", R.drawable.ic_pear))
            data.add(Fruit("PineApple", R.drawable.ic_pineapple))
            data.add(Fruit("Strawberry", R.drawable.ic_strawberry))
            data.add(Fruit("Watermelon", R.drawable.ic_watermelon))
        }
        return data
    }
}