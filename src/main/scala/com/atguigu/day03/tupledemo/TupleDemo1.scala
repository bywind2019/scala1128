package com.atguigu.day03.tupledemo

object TupleDemo1 {
    def main(args: Array[String]): Unit = {
        val a: (Int, Int, String, Boolean) = (10, 20, "abc", true)
        
        println(a._1)
        println(a._2)
        
        val t1: (String, Int) = foo()
        val (a1, _): (String, Int) = foo()
        println(a1)
    
        for (elem <- t1.productIterator) {
            println(elem)
        }
        
        var t2: (Int, (Int, String)) = (10, (20, "abc"))
        
    }
    
    def foo() = {
        ("hello", 1)
    }
}

/*
元组的主要用处: 就是用来给方法返回多个值
 而且这些值的类型不要求一样, 实际上, 这些值的类型通常是不一样
 
元组只有不可变, 没有可变

(a, b) 二维元组: 对偶
 */
