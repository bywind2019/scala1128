package com.atguigu.day02.pack
object ADemo{
    def main(args: Array[String]): Unit = {
        val a = new A
        a.foo
    }
}

class A {
    private[pack] def foo ={
    
    }
}


class B extends A{
    def foo1 = {
//        foo
//        val a = new A
//        a.foo
    }
}
/*
更加精细化的控制访问权限
 */