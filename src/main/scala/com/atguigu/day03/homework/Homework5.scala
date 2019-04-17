package com.atguigu.day03.homework

object Homework5 {
    def main(args: Array[String]): Unit = {
        println(50!)
    }
    
    implicit class factorial(n: Int){
        def ! = {
            // 迭代
            f(n)
        }
        
        def f(n: Int): Long ={
            if(n == 1) 1
            else n * f(n - 1)
        }
    }
}


