package com.atguigu.day03.arraydemo

import scala.collection.mutable.ArrayBuffer

object ArrayDemo3 {
    def main(args: Array[String]): Unit = {
        /*// 可变数组
        val arr = ArrayBuffer(200, 30, 400)
        // 升序
        val buffer: ArrayBuffer[Int] = arr.sorted
        println(buffer)
        println(arr.sortWith(_ < _))*/
    
        // 创建一个 2 * 3 的二维数组
        val matrix: Array[Array[Int]] = Array.ofDim[Int](2, 3)
        // 访问其中的元素使用两对圆括号
        matrix(0)(0) = 100
        val i: Int = matrix(0)(0)
        println(i)
    
        // 创建不规则的数组
        var matrix2 = new Array[Array[Int]](3)
        for (i <- 0 until matrix2.length) {
            matrix2(i) = new Array[Int](i + 1)
        }
        for (m1 <- matrix2) {
            for (elem <- m1) {
                println(elem)
            }
        }

    }
}

/*

+=
++=
++
-= 删除第一个
--= 差集
 */