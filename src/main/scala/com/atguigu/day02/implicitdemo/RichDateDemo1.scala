package com.atguigu.day02.implicitdemo

import java.time.LocalDate


object RichDateDemo1 {
    
    def main(args: Array[String]): Unit = {
        
        val age = "ago"
        val later = "later"
        println(52 days age)
        println(211 days later)
        
    }
    
    implicit class Rich(day: Int) {
        def days(when: String) = {
            val today: LocalDate = LocalDate.now
            if (when == "ago") {
                today.minusDays(day).toString
            } else {
                today.plusDays(day).toString
            }
        }
    }
}



/*
隐式类是隐转换函数的升级版

 */