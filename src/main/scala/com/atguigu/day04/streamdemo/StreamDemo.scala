package com.atguigu.day04.streamdemo

/**
  * Author lzc
  * Date 2019-04-19 13:47
  */
object StreamDemo {
    def main(args: Array[String]): Unit = {
        // 获取流
        val list1 = List(30, 50, 70, 60, 10, 20)
//        val s1: Stream[Int] = list1.toStream
//        println(s1)
//        println(s1.head)
//        println(s1.tail)
//        println(s1.tail.tail)
//        s1.foreach(println)
        val s: Stream[BigInt] = numFrom(10)
        val s1: Stream[BigInt] = s.take(10)
        println(s1.head)
        println(s1.tail)
        println(s1.tail.head)
    }
    
    def numFrom(n: BigInt): Stream[BigInt]={
        println("n: " + n)
        n #:: numFrom(n + 1)
    }
}
