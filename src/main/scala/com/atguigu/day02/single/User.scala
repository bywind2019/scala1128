package com.atguigu.day02.single


class User(val name: String, val age: Int){
    override def toString: String = s"name = ${name}, age=$age"
}

object User {
    // 伴生对象的apply
    def apply(name: String, age: Int) = new User(name, age)
    
    
}

object UserDemo {
    def main(args: Array[String]): Unit = {
        // 在调用 User这个object的 apply方法
        val user:User = User("lisi", 20)
        println(user)
        
    }
}
