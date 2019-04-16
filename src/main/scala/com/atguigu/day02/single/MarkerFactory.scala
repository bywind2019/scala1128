package com.atguigu.day02.single

import scala.collection._

class Marker private (val color: String) {
    println(s"Creating ${this}")
    
    override def toString = s"marker color $color"
    
}



object Marker {
    
    private val markers = mutable.Map(
        "red" -> new Marker("red"),
        "blue" -> new Marker("blue"),
        "yellow" -> new Marker("yellow"))
    
    def getMarker(color: String): Marker = markers.getOrElseUpdate(color, new Marker(color))
    
    def main(args: Array[String]): Unit = {
        println(Marker getMarker "blue")
//        println (MarkerFactory getMarker "blue")
//        println (MarkerFactory getMarker "red")
//        println (MarkerFactory getMarker "red")
        println (Marker getMarker "green")
        println (Marker getMarker "green")
    }
}
