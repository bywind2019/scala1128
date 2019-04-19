package com.atguigu.day04.highfun

/**
  * Author lzc
  * Date 2019-04-19 10:07
  */
object ZipDemo1 {
    def main(args: Array[String]): Unit = {
        val list1 = List(30, 50, 70, 60)
        val list2 = List(3, 5, 7, 6, 1, 2)
        // 数量不等, 多余的丢弃.  spark 如果输了不等, 会抛异常
//        val tuples: List[(Int, Int)] = list1.zip(list2)
        // 如果数量不等, 使用默认值来补齐
        val list3: List[(Int, Int)] = list1.zipAll(list2, 1000, 2000)
        println(list3)
        val t2: (List[Int], List[Int]) = list3.unzip
        println(t2)
        
    }
}
