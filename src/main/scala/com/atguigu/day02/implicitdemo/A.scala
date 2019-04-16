package com.atguigu.day02.implicitdemo

object B {

}

class B[T]

class A {
    def foo() = {
    
    }
}

object A {

}

class C

object C {
    implicit def b2a(b: B[C]) = new A
}

object D {
    def main(args: Array[String]): Unit = {
        // 去B的伴生对象, 和B相关的类型的伴生对象里面找
        val b = new B[C]
        b.foo
    }
}



