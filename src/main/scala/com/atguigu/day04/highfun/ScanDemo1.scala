package com.atguigu.day04.highfun

/**
  * Author lzc
  * Date 2019-04-19 10:03
  */
object ScanDemo1 {
    def main(args: Array[String]): Unit = {
        val list1 = List(30, 50, 70, 60, 10, 20)
        val list2: List[Int] = list1.scanRight(0)(_ + _)
        println(list2)
        
    }
}
