package com.atguigu.day03.setdemo

import scala.collection.mutable

object SetDemo2 {
    def main(args: Array[String]): Unit = {
        
        val set1 = Set(1, 2, 10, 4, 9, 10, 1, 2)
        val set2 = mutable.Set(10, 20, 1, 4)
    
        println(set1 & set2)
        println(set1 intersect set2)
    
        println(set1 &~ set2)
        println(set1 -- set2)
    
        println(set1 | set2)
        println(set1 union  set2)
        
        // 所有集合通用
        println(set1.take(3))
    }
}
