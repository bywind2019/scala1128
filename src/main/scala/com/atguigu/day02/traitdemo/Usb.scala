package com.atguigu.day02.traitdemo

import com.atguigu.day02.traitdemo.sub.A

object AB {
    def main(args: Array[String]): Unit = {
        val usb:Usb = new MyUsb
        val msg:Message = new MyUsb
        
    }
}

trait Usb {
    val b: Int
    var a: Int
    var c = 10
    
    def plugin(): Unit
    
    def start() = {
        println("usb 开始工作")
    }
}

trait Message {
    def showMsg(): Unit
}
class A
class MyUsb extends A with Usb with Message {
    override val b: Int = 100
    override var a: Int = _
    
    override def plugin(): Unit = {
        println("usb 已经插入")
    }
    
    override def showMsg(): Unit = {
        println("message ....")
    }
}
