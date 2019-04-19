package com.atguigu.day04.highfun

import scala.collection.mutable

/**
  * Author lzc
  * Date 2019-04-19 09:16
  */
object FoldLeftDemo {
    def main(args: Array[String]): Unit = {
        val list1 = List(30, 30, 50, 70, 60, 10, 20, 30, 50, 90)
        // 统计每个数字出现的个数
        // 30-> 2 40 -> 5  ...
        val map = mutable.Map[Int, Int]()
        val m2: mutable.Map[Int, Int] = list1.foldLeft(map)((m, ele) => {
            m(ele) = m.getOrElse(ele, 0) + 1
            m
        })
        println(m2)
        
    }
    
    
}

/*
foldLeft
    是 reduce的加强版

 */