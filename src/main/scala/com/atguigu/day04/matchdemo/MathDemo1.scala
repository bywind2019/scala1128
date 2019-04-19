package com.atguigu.day04.matchdemo

/**
  * Author lzc
  * Date 2019-04-19 15:21
  */
object MathDemo1 {
    def main(args: Array[String]): Unit = {
        for (ch <- "+-3&3aaa...%") {
            var digit = 0
            val sign = ch match {
                case '+' => 1
                case '-' => -1
                case _ if Character.isDigit(ch) => digit = Character.digit(ch, 10)
                case _ => 0
            }
            println("ch = " + ch)
            println("sign = " + sign)
            println("digit = " + digit)
            println("---------")
        }
    }
}
