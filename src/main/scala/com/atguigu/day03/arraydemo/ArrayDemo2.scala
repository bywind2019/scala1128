package com.atguigu.day03.arraydemo

import scala.collection.mutable
import scala.collection.mutable.ArrayBuffer

object ArrayDemo2 {
    def main(args: Array[String]): Unit = {
        // 可变数组
        val arr = ArrayBuffer(20, 30, 40)
        val arr1 = ArrayBuffer(100, 200, 30, 40)
//        println(arr(0))
//        arr.insert(0, 100, 200)
//        arr += 100
//        arr.appendAll(arr1)
//        arr ++= arr1
//        var arr2 = arr ++ arr1
//        arr -= 10
//        arr --= arr1  // 求差集
//        var arr2 = arr -- arr1
        println(arr.mkString(","))
//        println(arr2.mkString(","))
        println(arr.sum)
        println(arr.max)
        println(arr.min)
        
//        var arr3 = Array('a', 'c', 'b')
//        println(arr3.sum.toInt)
    
    
        
    }
}

/*

+=
++=
++
-= 删除第一个
--= 差集
 */