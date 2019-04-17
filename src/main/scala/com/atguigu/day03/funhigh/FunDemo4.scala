package com.atguigu.day03.funhigh

object FunDemo4 {
    def main(args: Array[String]): Unit = {
        val pow2: Double => Double = Math.pow(2, _)
        println(pow2(10))
        println(pow2(3))
        println(pow2(4))
        
        val f1: Int => Int = foo(_)
        
    }
    
    def foo(a:Int) ={
        a + 10
    }
    
}
/*
部分应用函数:
 
 
 */
