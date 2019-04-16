package com.atguigu.day02.implicitdemo

object ImplicitValue {
    implicit var a: Int = 10
    implicit var b: Byte = 10
    
    def main(args: Array[String]): Unit = {
        foo
    }
    
    def foo(implicit a: Int) = {
        println(a)
    }
}
