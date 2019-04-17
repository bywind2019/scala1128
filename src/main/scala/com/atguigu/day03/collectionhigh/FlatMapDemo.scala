package com.atguigu.day03.collectionhigh

import scala.collection.GenTraversableOnce

object FlatMapDemoDemo {
    def main(args: Array[String]): Unit = {
//        val list1 = List(List(1, 2), List(2, 3), List(3, 4))
//         List(1,2,2,3,3,4)
//        val list2: List[Int] = list1.flatMap(list => list.map(_ * 2))
//        println(list2)
        
//        val list1 = List("hello", "world")
//        val list2= list1.flatMap(x => x)
//        println(list2)
        val list1 = List(1,2,3,4)
        // 用的比较多
        val list2: List[Int] = list1.flatMap(x => List(x, x * x))
        println(list2)
        list1.map(println)
        
    }
}

/*
forEach
    遍历集合中的元素. 用来替换循环

Map
    可以更改我们数据类型
 */
