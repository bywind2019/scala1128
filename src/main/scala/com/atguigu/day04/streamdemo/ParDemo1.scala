package com.atguigu.day04.streamdemo

/**
  * Author lzc
  * Date 2019-04-19 14:20
  */
object ParDemo1 {
    def main(args: Array[String]): Unit = {
        val list = (1 to 100).toList
        list.par.foreach(x => {
            println(x + "  " + Thread.currentThread.getName)
        })
    }
}
