package com.atguigu.day04.highfun

/**
  * Author lzc
  * Date 2019-04-19 10:20
  */
object GroupByDemo {
    def main(args: Array[String]): Unit = {
        val list1 = List(30, 5, 70, 60, 11, 20, 10, 20, 30, 50, 60, 11)
        //        val map = list1.groupBy(ele => if (ele % 2 == 0) "偶数" else "奇数")
        //        val map2 = map.map(kv => (kv._1, kv._2.length))
        val map2 = list1.groupBy(x => x).map(kv => (kv._1, kv._2.size))
        println(map2)
    }
}
