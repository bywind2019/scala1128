package com.atguigu.day03.collectionhigh

import scala.collection.immutable

object MapDemo {
    def main(args: Array[String]): Unit = {
        // 得到一个新的集合, 1 4 9 ...
        //        val seq1 = (1 to 10).map(x => x + "a")
//        val seq1 = (1 to 10).map(_ + "a")
//        val seq1 = (1 to 10).map(Math.pow(_, 2))
//        println(seq1)
        
        val list1 = 1 to 10 toList
        
        // (1, 1), (2, 4)...
        val list2: List[(Int, Int)] = list1.map(x => (x, x * x))
        println(list2)
        
    }
}

/*
forEach
    遍历集合中的元素. 用来替换循环

Map
    可以更改我们数据类型
 */
