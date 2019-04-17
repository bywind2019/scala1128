package com.atguigu.day03.listdemo

import scala.collection.mutable.ListBuffer

object ListDemo2 {
    def main(args: Array[String]): Unit = {
        val list1 = ListBuffer(10, 20, 30, 3)
        list1 += 100
        1000 +=: list1
        println(list1)
        
    }
}

/*

:: 在List 头部追加
::: 两个拼接List
Nil 空的List
Nil 去构造List
 */