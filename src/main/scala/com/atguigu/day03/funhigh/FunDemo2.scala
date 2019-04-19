package com.atguigu.day03.funhigh

object FunDemo2 {
    def main(args: Array[String]): Unit = {
        /*val f1 = () => {
            println("abc")
        }   // 函数表达式
        f1()*/
        
//        val f1 = (a: Int, b: Int) => a + b
//        foo(f1)
//        foo1(a => a + 1)
        foo((a: Int, b: Int) => a + b)  // 原始版本
        foo((a, b) => a + b)  // 省略类型
        foo(_ + _)  // 省略类型
        
        
        
    }
    def foo1(f: Int => Int) ={
    
    }
    // 函数名, 参数列表的类型, 返回值类型
    def foo(f: (Int, Int) => Int) = {
        //调用
        println(f(3, 4))
    }
    
    
}

/*
匿名函数的作用:
    1. 作为参数直接传给其他的函数
    
    2. 作为一个返回值值返回给调用者

能够接收函数作为参数的函数,或者返回一个函数给调用者     , 就叫高阶函数
 */
