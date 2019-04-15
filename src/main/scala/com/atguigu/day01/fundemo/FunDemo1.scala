package com.atguigu.day01.fundemo

object FunDemo1 {
    var s = 10
    
    def main(args: Array[String]): Unit = {
        lazy val c = add(1, 3)
        println(c)
        println(c)
        FunDemo1.add(2, 4)
    }
    
    def add(a: Int, b: Int) = {
        println("a")
        //        println(a, b)
        //        s = 100
        a + b
    }
}

/*
纯函数:
 1. 高并发
 2. 提高计算的性能
 */