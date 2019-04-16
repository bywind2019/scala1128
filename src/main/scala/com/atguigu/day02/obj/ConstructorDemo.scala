package com.atguigu.day02.obj

object ConstructorDemo {
    def main(args: Array[String]): Unit = {
        //        new User("lisi", 10)
//        new User("lisi", 10)
    }
}

//主构造
class User private (var name: String, val age: Int) {
    
    // 辅助构造函数
    def this(name: String) {
        // name只能在当前辅助构造函数内当做普通的常量使用
        // 辅助构造的首行必须是调用主构造
        this(name, 10)
    }
    
    def this(age: Int, sex: String) {
        //        this("lisi", age)
        this("lisi")
    }
    
    
}


