package com.atguigu.day02.traitdemo

object Demo3{
    def main(args: Array[String]): Unit = {
    
    }
}

class BB {
    def foo = {
        println("BB")
    }
}
class DD extends BB

// 将来混入CC的那些类的直接父类一定必须是BB或者BB的子类
trait CC extends BB{
    def say() ={
        foo
    }
}

class EE extends DD with CC

// 自身类型