package com.atguigu.day02.implicitdemo

object ImpDemo1 {
    def main(args: Array[String]): Unit = {
        implicit def double2Int(d: Double) = d.toInt
        
        var a: Int = 10.1
        println(a)
        
    }
}

/*
把强制完成, 使用自动来实现

隐式转换

    隐式函数

    隐式类
    
    隐式参数和隐式值
 */