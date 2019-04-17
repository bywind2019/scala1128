package com.atguigu.day03.funhigh

object FunDemo3 {
    def main(args: Array[String]): Unit = {
        val arr1 = Array(1, 2, 10, 3, 5)
        // 算子  高阶函数  全栈工程师
//        arr1.foreach(e => println(e + 1))
//        arr1.foreach(println(_ + 1))
//        arr1.foreach(println(_))
        // println这个函数已经满足了foreach要求
//        arr1.foreach(println)
        
        /*arr1.foreach(e => {
            println("arr1...")
            println(e)
        })*/
        var r = {
            println("arr1...")
            println(_:Int)
        }
        arr1.foreach({
            println("arr1...")
            println(_:Int)
        })
        
    }
}
/*

 */
