package com.atguigu.day02.implicitdemo

import java.io.File

import scala.io.Source

object ImpDemo2 {
    def main(args: Array[String]): Unit = {
        implicit def file2RichFile(file: File) = new RichFile(file)
    
        val msg: String = new File("C:\\Users\\lzc\\Desktop\\class_code\\2018_11_28\\06_scala\\scala1128\\src\\main\\scala\\com\\atguigu\\day02\\implicitdemo\\ImpDemo2.scala")
            .readContent
        println(msg)
        
        //  2 days age    // 2019-04-14
        //  2 days later    // 2019-04-18
        
    }
}

class RichFile(file: File) {
    def readContent = {
        // [1,2,3,4]  1234
        Source.fromFile(file).mkString
    }
}

/*
把强制完成, 使用自动来实现

隐式转换

    隐式函数

    隐式类
    
    隐式参数和隐式值
 */