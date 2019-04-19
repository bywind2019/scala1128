package com.atguigu.day04.matchdemo

/**
  * Author lzc
  * Date 2019-04-19 16:25
  */
object MatchList {
    def main(args: Array[String]): Unit = {
        /*val list1 = List(30, 50, 70)
        list1 match {
            //            case List(30, _*) => println("List(30, _*)")
            //            case List(30, a@_*) => println("List(30, a@_*)")
            // :: :::
            //            case 30::50::70::Nil => println("30::50::70::Nil")
            case 30 ::40:: abc => println(abc)
        }*/
    
        val user = new User(20)
        +user
        user.unary_+
    }
    
    
}

class User(var age: Int){
    def unary_+ = {
        println("unary_+")
    }
}
