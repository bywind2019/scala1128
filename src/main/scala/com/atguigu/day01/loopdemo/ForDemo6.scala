package com.atguigu.day01.loopdemo

object ForDemo6 {
    var a = 1
    def main(args: Array[String]): Unit = {
        foo()  // 2
        foo()  // 3
        foo()  // 4
        foo(1)
    }
    def f() = {
        a += 1
        a
    }
    
    def foo(a: Int = f()) ={
        println(a)
    }
}
