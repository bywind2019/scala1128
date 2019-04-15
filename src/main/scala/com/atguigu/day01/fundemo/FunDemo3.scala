package com.atguigu.day01.fundemo

object FunDemo3 {
    def main(args: Array[String]): Unit = {
        //        println(sqrt(1.2))
        //        println(add(1))
        //        println(add(1, 2, 3))
//        val arr: Range.Inclusive = 1 to 10
        // 把序列 arr展开, 一个一个的传给函数
//        println(add(arr: _*))
    }
    
    def add(a: Int*) = {
        var sum = 0
        for (elem <- a) {
            sum += elem
        }
        sum
    }
    
    
    /*def sqrt(d: Double) ={
        if(d >= 0){
            Math.sqrt(d)
        }else{
            throw NumberFormatException
        }
    }*/
    
    // 5. 如果显示的return, 则一定要显示声明返回值类型
    /*def foo(): Int = {
        for (i <- 1 to 4) {
            if (i == 5) return i
        }
        1
    }*/
    
    // 4. 如果省略 = , 永远返回 Unit
    /*def foo() {
        println("foo...")
        1
        
    }*/
    
}
