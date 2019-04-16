package com.atguigu.day02.traitdemo

object OuterDemo {
    def main(args: Array[String]): Unit = {
        val out1 = new Outer
        val in1 = new out1.Inner
    
        val out2 = new Outer
        val in2= new out2.Inner
        
        in1.foo(in2)
        in2.foo(in1)
    }
}

class Outer {
    my =>
    var name = "李四"
    
    // 普通的成员内部类
    class Inner {
        var name = "zs"
        // 类型投影
        def foo(inner: Outer#Inner): Unit = {
           // 访问外部类的属性
            println(Outer.this.name)
            println(my.name)
        }
    }
    
}