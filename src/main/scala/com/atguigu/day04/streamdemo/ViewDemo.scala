package com.atguigu.day04.streamdemo

/**
  * Author lzc
  * Date 2019-04-19 14:11
  */
object ViewDemo {
    def main(args: Array[String]): Unit = {
        // 得到一个视图
        val list1 = List(30, 50, 70, 60, 10, 20)
        val view= list1.view.map(x => {
            println("x:" + x)
            x * x
        })
        println(view.head)
        println(view.head)
        
    }
}
