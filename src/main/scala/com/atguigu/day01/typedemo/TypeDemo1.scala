package com.atguigu.day01.typedemo

object TypeDemo1 {
    def main(args: Array[String]): Unit = {
        //        var a: Int = 10
        var a = 10
        a = 20
    
        println(foo())
        
    }
    
    def foo():Unit ={
    
    }
}

/*
var:
    1. 类型在后
    2. 类型可以省略, scala会自动推断
val:
    声明常量

Int  1 2 3
Unit ()
 */
