package com.atguigu.day02.abstractdemo

object AbstDemo1 {
    def main(args: Array[String]): Unit = {
        // 多态:编译时类型和运行时类型不一致
        val f: Father = new Son
        if (f.isInstanceOf[Son]) { // f instanceof Son
            f.asInstanceOf[Son] // java中的强制转换 (Son)f
        }
    
        val f2: Father = new Father {
            override var a: Int = _
        
            override def eat(): Int = ???
        }
        
    }
}

abstract class Father {
    // 没有初始化的字段, 就叫抽象字段
    var a: Int
    
    // 抽象方法
    def eat(): Int
    
    def foo = {
    
    }
}

class Son extends Father {
    override var a: Int = _
    
    override def eat(): Int = {
        10
    }
    
    def f1() = {
    
    }
}


