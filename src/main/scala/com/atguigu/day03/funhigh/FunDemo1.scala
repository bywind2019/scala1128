package com.atguigu.day03.funhigh

object FunDemo1 {
    def main(args: Array[String]): Unit = {
        val f1 = foo _  // 表示把函数当一个值来处理, 而不是在调用函数
        
        f1(100)
        foo(10)
        
    }
    
    def foo(a: Int) ={
        println("foo...")
    }
}
/*
对函数操作:
    1. 调用函数
    2. 传递他
        把函数当做一个值来传入另外的函数, 或者把函数作为一个值返回给调用者

 */
