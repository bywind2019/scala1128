package com.atguigu.day04.highfun

object ReduceDemo {
    def main(args: Array[String]): Unit = {
        val arr1 = Array(30, 50, 70, 60, 10, 20).toList
        //        println(arr1.reduce((r, c) => r + c))
        //        println(arr1.reduce(_ + _))
        println(arr1.reduce(_ - _))
        println(arr1.myMakeString(":"))
    }
    
    // 使用 reduce 来完成 模拟 makeString  (",")  隐式转换  myMakeString
    implicit class MyList(list: List[Any]){
        def myMakeString(sep: String) ={
            list.reduce(_ + sep + _).toString
        }
    }
}

/*
reduce 聚合
 */
