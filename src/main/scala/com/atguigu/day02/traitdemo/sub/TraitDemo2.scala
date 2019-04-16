package com.atguigu.day02.traitdemo.sub

object TraitDemo2 {
    def main(args: Array[String]): Unit = {
        /*val c = new C
        c.foo*/
        // 动态混入: 创建对象的时候, 才混入trait
        // 增加对象的功能
//        val d = new D with A with B
//        d.foo
        new C
    }
}
class D


trait F{
    println("F 的构造函数")
    def foo:Unit ={
        println("F...")
    }
}

trait A extends F{
    println("A 的构造函数")
    override def foo = {
        println("A...")
        super.foo
    }
}
trait B extends F{
    println("B 的构造函数")
    override def foo = {
        println("B...")
        // 指定super
        super.foo
    }
}

class AA{
    println("AA类的构造 ...")
}

class C extends AA with A with B{
    println("C 的构造函数")
    override def foo: Unit = {
        println("C...")
        super.foo
    }
}
/*
java:
    父类的静态代码块
    子类的静态代码
    父类的构造代码块
    父类的构造函数
    子类的构造代码块
    子类的构造函数

scala:
    父类的构造
    
    最上层的特质
    按照特质的混入顺序的那些构造
    
    子类的构造
    
 */