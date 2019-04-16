package com.atguigu.day02.implicitdemo

import java.time.LocalDate

class User(val name: String) {
    override def equals(obj: scala.Any): Boolean = {
        val other: User = obj.asInstanceOf[User]
        this.name == other.name
    }
}

object RichDateDemo {
    implicit def int2RichDate(day: Int) = new RichDate(day)
    
    def main(args: Array[String]): Unit = {
        //  2 days ago    // 2019-04-14
        //  2 days later    // 2019-04-18
        val age = "ago"
        val later = "later"
        println(52 days age)
        println(211 days later)
    }
}

class RichDate(day: Int) {
    def days(when: String) = {
        val today: LocalDate = LocalDate.now
        if (when == "ago") {
            today.minusDays(day).toString
        } else {
            today.plusDays(day).toString
        }
    }
}

/*
scala中的  == 等价于 java中的equals

scala中的 eq  等价于java中的    ==

 */