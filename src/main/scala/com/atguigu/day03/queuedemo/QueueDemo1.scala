package com.atguigu.day03.queuedemo

import scala.collection.mutable

object QueueDemo1 {
    def main(args: Array[String]): Unit = {
        // 1. 创建空队列
//        val queue1 = mutable.Queue[Int]()
        // 2. 创建队列, 并给队列初始化两个值
        var queue2 = mutable.Queue(10, 20, 30)
        queue2.enqueue(100)
        queue2 += 200
        println(queue2.dequeue)
        println(queue2)
    }
}
