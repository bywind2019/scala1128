package com.atguigu.day03.homework

object Homework4 {
    def main(args: Array[String]): Unit = {
    
    }
}

abstract class Shape {
    def centerPoint: Point
    
    def area: Double
}

class Circle(center: Point, r: Double) extends Shape {
    override def centerPoint: Point = center
    
    override def area: Double = Math.PI * r * r
}

class Rectangle(leftTop: Point, rightBottom: Point) extends Shape {
    override def centerPoint: Point = {
        new Point((rightBottom.x + leftTop.x) / 2, (rightBottom.y + leftTop.y) / 2)
    }
    
    override def area: Double = (rightBottom.y - leftTop.y) * (rightBottom.x - leftTop.x)
}

/*
5. 定义一个抽象类 Shape，一个抽象方法 centerPoint，以及该抽象类的子类 Rectangle 和 Circle。
为子类提供合适的构造器，并重写centerPoint方法, 并提供计算面积的方法 (根据需要添加相应的属性)
 */