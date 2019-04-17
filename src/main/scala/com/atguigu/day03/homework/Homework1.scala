package com.atguigu.day03.homework

object Homework1 {
    def main(args: Array[String]): Unit = {
        val p1 = Point(3, 4) // 约定  约定大于配置
        val p2 = Point(3, 9) // 约定  约定大于配置
        println(p1.distance(p2))
        
    }
}

class Point(val x: Int, val y: Int) {
    override def toString: String = s"x = $x, y = $y"
    
    // 可以计算两个点之间的距离
    def distance(other: Point) =
        Math.sqrt((this.x - other.x) * (this.x - other.x) + (this.y - other.y) * (this.y - other.y))
    
    
}

object Point {
    def apply(x: Int, y: Int) = new Point(x, y)
}

/*
1. 定义一个 Point 类和一个伴生对象,
使得我们可以不用 new 而直接用 Point(3,4)来构造 Point 实例
*/