package com.atguigu.day01

object StuDemo1 {
    def main(args: Array[String]): Unit = {
        val stu1 = new Student
        /*stu1.name = "lisi"
        stu1.age = 10
        println(stu1.name)*/
        /*println(stu1.name)
        stu1.name = "lisi"
        stu1.name_$eq("abc")
        println(stu1.name)*/
        
    }
}

class Student {
   private var name: String = _
    var age: Int = _
    val sex: String = "男"
}

/*
数字: 0 0.0
布尔值:false
对象: null
 */