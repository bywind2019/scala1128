package com.atguigu.day03.mapdemo

import scala.collection.mutable

object MapDemo1 {
    def main(args: Array[String]): Unit = {
        // 不可变集合
        val map1 = Map(("b", 1), ("a", 2), ("c", 3))
        val map2 = Map("aa" -> 1, "cc" -> 2, "dd" -> 3)
        println(map1)
        println(map2)
        
        // 可变集合
        val map3 = mutable.Map("aa" -> 1, "cc" -> 2, "dd" -> 3)
        // map中添加元素
        map3 += "e" -> 2
        println(map3)
    
        println(map3("aa"))
        println(map3("cc"))
//        println(map3("ff"))  // 如果key不存在会抛异常
//        println(map3.get("aa"))
        println(map3.getOrElse("ff", 100))  // 可变map和不可变map都支持
        println(map3.getOrElseUpdate("ff", 200))  // 只有可变才支持. 如果key不存, 则更新map
        println(map3("ff"))
        
        map3 -= "aa"
        println(map3)
        /*for (elem <- map3) {
            println(elem._1)
        }*/
    
        /*for ((key, _) <- map3) {
            println(key)
        }*/
        /*for ((key, _) <- map3) {
            println(key)
        }*/
    }
}
