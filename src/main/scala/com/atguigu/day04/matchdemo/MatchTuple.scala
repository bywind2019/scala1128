package com.atguigu.day04.matchdemo

/**
  * Author lzc
  * Date 2019-04-19 16:19
  */
object MatchTuple {
    def main(args: Array[String]): Unit = {
        /*val t1 = (10, "abc", true)
        
        t1 match {
            case (_, _, false) => println("false...")
        }*/
        
        val tuples = List((1, "a"), (2, "b"))
       /* val result: List[String] = tuples.map(t => {
            t match {
                case (a, b) => a + b
            }
        })*/
       val result: List[String] = tuples.map{
           case (a, b) => a + b
       }
        println(result)
    }
}
