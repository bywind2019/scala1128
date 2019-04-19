package com.atguigu.day04.highfun

/**
  * Author lzc
  * Date 2019-04-19 09:16
  */
object FoldLeftDemo2 {
    def main(args: Array[String]): Unit = {
        val list1 = List(30, 30, 50, 70, 60, 10, 20, 30, 50, 90)
        // /: foldLeft
        //val m2= list1./:(mutable.Map[Int, Int]())((m, ele) => {
        //  m(ele) = m.getOrElse(ele, 0) + 1
        //m
        //})
//        val r: Int = (0 /: list1) (_ + _)
        val r: Int = (list1 :\ 0)(_ + _)
        println(r)
        
    }
    
    
}

/*
foldLeft  (/:) ***
    是 reduce的加强版
    
foldRight (:\)
fold

reduce ***

reduceLeft
reduceRight

 */