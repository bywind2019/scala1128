package com.atguigu.day02.extendsdemo

object ExtDemo{
    def main(args: Array[String]): Unit = {
        val b = new B
        val a: A = b
    
        println(b.a)
        println(a.a)
    }
}


class A {
    val a = 10
    
    def getA: Int = this.a
}

class B extends A {
    override val a = 20
    
    override def getA: Int = this.a
}

class Father(val name: String, var age: Int, sex: String){
    def foo = {
        1
    }
    
    def eat() ={
    
    }
    
    
}

class Son(override val name: String, override val foo: Int, sex: String) extends Father(name, 20, ""){
    override def eat() ={
    
    }
}

/*
属性覆写:
 1. 子类的 val可以覆写父类的 val, 和父类的没有使用 () 的def
 
 2. 子类 var 只能覆写父类抽象的 var (抽象属性)
 
 方法的覆写:
    2同2小1大
 */