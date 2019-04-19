package com.atguigu.day04.matchdemo

/**
  * Author lzc
  * Date 2019-04-19 15:34
  */
object MathType {
    def main(args: Array[String]): Unit = {
        val list1 = List(30, "a", 70, "b", 10, 20, false)
        
        for (elem <- list1) {
            elem match {
                case n: Int => println(n + 10)
                case s: String => println("----")
                case _ =>
            }
            
        }
    }
}
