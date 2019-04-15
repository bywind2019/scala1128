package com.atguigu.day01.loopdemo

object ForDemo5 {
    def main(args: Array[String]): Unit = {
        println(a)
        println(b)
        println(c)
    
        println(a)
        println(b)
        println(c)
    
    }
    
    def a = {
        
        println("a...")
        1
    }
    lazy val c = {
        println("c...")
        3
    }
    val b = {
        println("b...")
        2
    }
}
