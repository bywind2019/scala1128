package com.atguigu.day03.arraydemo

import scala.collection.JavaConversions._
import scala.collection.mutable
import scala.collection.mutable.ArrayBuffer

object ArrayDemo4 {
    def main(args: Array[String]): Unit = {
        val buffer = ArrayBuffer(10, 20)
        // scala -> java
        val list: java.util.List[Int] = buffer
        println(list)
        // java -> scala
        val buffer1: mutable.Buffer[Int] = list
    }
}
