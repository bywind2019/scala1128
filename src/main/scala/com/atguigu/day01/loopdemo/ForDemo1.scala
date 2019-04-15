package com.atguigu.day01.loopdemo

object ForDemo1 {
    def main(args: Array[String]): Unit = {
        /* for(c <- "abcdef"){
             println(c)
         }*/
        
        /*for(i <- 1 to 100 ){
            println(i)
        }*/
        
        /*for(i <- 0 until (100, 2) reverse){  // i < 100
            println(i)
        }*/
        // 循环守卫
        /*for(i <- 1 to 100 if i % 2 == 0){
            
            println(i)
        }*/
        // for 推导
        var arr = for (i <- 1 to 10) yield i * i
        
        println(arr)
        
    }
}

/*

for "循环", 是一种遍历
 */
