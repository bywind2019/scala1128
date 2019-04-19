package com.atguigu.day03.arraydemo

object ArrayDemo1 {
    def main(args: Array[String]): Unit = {
        // 定长数组
        val arr: Array[Int] = Array(10, 20, 30, 40)
        println(arr(0))
        arr(0) = 100
        println(arr.mkString(", "))
        println(arr.size)
        println(arr.length)
        
    }
}
