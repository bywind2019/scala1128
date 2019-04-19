package com.atguigu.day04.matchdemo

/**
  * Author lzc
  * Date 2019-04-19 15:34
  */
object MathType1 {
    def main(args: Array[String]): Unit = {
        val list1: Any = Map[Double, Int]()
        
        list1 match {
            case arr: Array[Int] => println("Array[Int]")   // new int[]
            case arr: Array[String] => println("Array[String]")
            case list: List[_] => println("List[_]")
            case map: Map[_, _] => println("Map")
            case _ =>
        }
        
    }
}
