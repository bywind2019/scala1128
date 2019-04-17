package com.atguigu.day03.setdemo

import scala.collection.mutable

object SetDemo1 {
    def main(args: Array[String]): Unit = {
        // 不可变的
        val set1 = Set(1, 2, 10, 4, 9, 10, 1, 2)
        println(set1)
        // 可变
        val set2 = mutable.Set(10, 20, 1, 4)
    
        println(set1)
        /*for (elem <- set1) {
            println(elem)
        }*/
    }
}
