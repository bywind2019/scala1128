package com.atguigu.day02.traitdemo

object Demo4 {

}

trait Logger{
    // 自身类型
    this: Exception =>
    def log() ={
        //
        println(getMessage)
    }
}

class Console  extends RuntimeException with Logger{

}


class Console1 extends Exception with Logger{

}
