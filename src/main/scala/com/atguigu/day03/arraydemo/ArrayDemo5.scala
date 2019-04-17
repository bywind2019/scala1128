package com.atguigu.day03.arraydemo

import scala.collection.mutable.ArrayBuffer

object ArrayDemo5 {
    def main(args: Array[String]): Unit = {
        val buffer1 = ArrayBuffer(10, 20)
        val buffer2 = ArrayBuffer(1, 2, 3)
        
//        buffer1 ++=: buffer2
        1000 +=: buffer1
        println(buffer1)
        println(buffer2)
    
//        println(buffer1 ++ buffer2)  // 拼接集合
//        println(buffer1.++(buffer2))  //
//
//        println(buffer1 ++: buffer2)  // buffer2.++:(buffer1)
//
//        println(buffer1 :+ 100)  // 拼接元素
//        println(1000 +: buffer1)  // buffer1.+:(1000)
//
//        println(buffer2.head)
//        println(buffer2.tail)
        
    }
}
/*
++ ++: 运算符都是合并两个集合
:+
+:

结合性:
    左结合
        大部分都是左结合
    右结合
        1. 如果运算符以 : 结尾, 他的结合性是右结合
        2. 一元运算符
            +a
            -a
            !a
            ~a

 */
