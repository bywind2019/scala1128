package com.atguigu.day03.funhigh

object CurringDemo1 {
    implicit val aa = 100
    implicit val bb = 100.0
    def main(args: Array[String]): Unit = {
        //
        /*println(add(6)(10))
        println(add(60)(10))*/
        println(add(10))
    }
    def add(a:Int)(implicit b:Int, c: Double) = a + b
    
//    def add(a:Int, b:Int) = a + b
    /*def add(a: Int) = {
        x: Int => x + a  // x:Int => x + 6
    }*/
}

/*
函数的柯里化:
    简化了函数的调用
    把单个参数列表, 换成多个参数列表
 */
