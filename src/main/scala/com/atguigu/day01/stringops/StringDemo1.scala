package com.atguigu.day01.stringops

import javax.rmi.CORBA.StubDelegate

object StringDemo1 {
    def main(args: Array[String]): Unit = {
        //        printf("name = %s, age = %d  sal= %.2f", "李四", 20, 30.33733)
        //        val name = "李四"
        //        val age = 20
        //        println(s"name = ${name}, age = ${age + 10}")
        val s =
        """
          |
          |
            """.stripMargin
        
        println(s)
        val n1: Int = "123".toInt
        println(n1)
        
        val `  a    +b?d  ---___  sfjlsjf` = 3
        println(`  a    +b?d  ---___  sfjlsjf`)
    }
}

/*
字符串的插值:
 println(s"name = ${name}, age = ${age + 10}")

原始字符串:
    """
     
     """
 */