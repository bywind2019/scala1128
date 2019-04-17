package com.atguigu.day03.funhigh

object ClosureDemo1 {
    
    def main(args: Array[String]): Unit = {
        
        val f1: () => Unit = foo()
        
        f1() // 21
        f1() // 22
        val f2: () => Unit = foo()
        f2() // 21
    }
    
    def  foo() ={
        var a = 20
        val f = () => {
            a += 1
            println(a)
        }
        a = 100
        f
    }
}
/*
闭包:
    
    内部函数会持有外部函数的作用域
    
    会持有外部函数的作用域内的变量
    
    闭包访问到的外部变量的值一定是最新的

 */
