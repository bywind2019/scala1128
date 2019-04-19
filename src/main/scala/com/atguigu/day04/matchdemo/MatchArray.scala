package com.atguigu.day04.matchdemo

/**
  * Author lzc
  * Date 2019-04-19 15:49
  */
object MatchArray {
    def main(args: Array[String]): Unit = {
        val arr1 = Array(30, 1, 2, 3)
        
        arr1 match {
            //            case Array(30, 50, 70) => println("Array(30, 50, 70)")
            //            case Array(30, _, _) => println("Array(30, _, _)")
            //            case Array(a, b, c) => println(a + " " + b + " " + c)
            //            case Array(30, _*) => println("30 , _*")
//            case Array(30, a@_*) => println(a.mkString(","))
            case Array(_, _, 3) => println()
        }
    }
}
