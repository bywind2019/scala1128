package com.atguigu.day01.loopdemo

import scala.util.control.Breaks._


object ForDemo3 {
    def main(args: Array[String]): Unit = {
        
        // 1. 通过守卫退出
        /*for(i <- 1 to 10 if i < 5){
            println(i)
        }*/
        // 2. 使用退出标志
        /*var isStop = false
        for(i <- 1 to 10 if !isStop){
            if(i >= 6) isStop = true
            println(i)
        }*/
        // 3. 真正的退出
        breakable{
            for(i <- 1 to 10){
                if(i == 5) break
                println(i)
            }
        }
        println("hello")
    }
}
