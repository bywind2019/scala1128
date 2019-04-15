package com.atguigu.day01.loopdemo

object WhileDemo {
    def main(args: Array[String]): Unit = {
        var i = 1;
        while(i < 100){
            println(i)
            i += 1
        }
        println(i)
        
    }
}

/*

Scala 的循环:
    
    两种循环:
        while
        
        do while
        
     循环结构的值是 Unit
    

 */
