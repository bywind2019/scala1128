package com.atguigu.day04.matchdemo

/**
  * Author lzc
  * Date 2019-04-19 15:25
  */
object MatchVarVal {
    def main(args: Array[String]): Unit = {
        val ch = 'z'
        'y' match {
            case 'a' => println("a...")
            case 'b' => println("b...")
            case 'c' => println("c...")
            case ch => println("ch: " + ch)
            case _ => println("_....")
        }
    }
}
/*
当首字母大写的时候,才会当做常量来处理
 */
