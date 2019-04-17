package com.atguigu.day03.listdemo

object ListDemo1 {
    def main(args: Array[String]): Unit = {
        val list1 = List(10, 20, 30, 3)
        val list2 = List(100, 200, 300, 30)
        //        println(list1 :+ 10)
        //        println(10 +: list1)  // 所有的集合通用
        //        println(10 :: list1)  // List 专用
        //        println(list1 ::: list2)
        
        println(20 +: 10 +: Nil)
        println(20 :: 10 :: Nil)
        
        
    }
}

/*

:: 在List 头部追加
::: 两个拼接List
Nil 空的List
Nil 去构造List
 */