package com.atguigu.day04.streamdemo

/**
  * Author lzc
  * Date 2019-04-19 14:31
  */
object SliceDemo {
    def main(args: Array[String]): Unit = {
        // 1 2 3 4 5 6 7
        // 得到跳转流  "1->2"  "2->3", '6->7'
        val pages: List[Int] = (1 to 7).toList
        
        val prePages: List[Int] = pages.slice(0, pages.length - 1)
        val postPages: List[Int] = pages.slice(1, pages.length)
        
        val tuples: List[(Int, Int)] = prePages.zip(postPages)
        println(tuples)
        val list: List[String] = tuples.map(xy => xy._1 + "->" + xy._2)
        println(list)
    }
}
