package com.atguigu.day01

import scala.beans.BeanProperty

object UserDemo {
    def main(args: Array[String]): Unit = {
        val user1 = new User("lisi", 20, "nan")
        println(user1.name)
        user1.name = ""
        println(user1.name)
        println(user1.getName)
    }
}

//主构造器
class User(@BeanProperty var name: String, @BeanProperty val age: Int, @BeanProperty sex: String) {
    
    @BeanProperty
    var color: String = "黄色"
    private var a: Int = 10
    println("abc")
    
    def foo = {
        println(sex)
    }
}

/*{
    // 主构造器的代码
    
    // 类的代码也在这里
} */
