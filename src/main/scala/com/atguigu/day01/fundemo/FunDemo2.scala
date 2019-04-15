package com.atguigu.day01.fundemo

object FunDemo2 {
    def main(args: Array[String]): Unit = {
//        println(foo(1, 3))
        foo
        foo
        
    }
    
    /*def foo(a:Int , b: Int): Int = {
        a + b
        500
    }*/
    // 1. 返回值类型的推断
   /* def foo(a: Int, b: Int) = {
        a + b
    }*/
    // 2. 参数列表是空, 调用的时候可以省略 ()
    /*def foo() ={
        println("foo...")
    }*/
    // 3. 如果参数列表是空, 声明的时候 () 可以省略
    def foo ={
            println("foo...")
    }
}
