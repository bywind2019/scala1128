package com.atguigu.day01.loopdemo

object ForDemo4 {
    
    
    def main(args: Array[String]): Unit = {
        println(preAndPost("atgugiu", "<<", ">>"))  // <<atguigu>>
        println(preAndPost("atgugiu"))  // <<atguigu>>
        println(preAndPost("atgugiu", "||"))  // <<atguigu>>
        
        // 命名参数
        println(preAndPost("hello", post = "???", pre = "--"))
    
        println(add(1, 100))
        add1(3, 100, 0)
        
    }
    // 参数的默认值
    def preAndPost(s:String, pre: String = "<<",post: String = ">>")={
        pre + s + post
    }
    //
    def add(from: Int, to: Int):Int ={
        if(from == to) to
        else from + add(from + 1, to)
    }
    // 1 + 2... 1000
    def add1(from: Int, to: Int, sum: Int):Int ={
        if(from == to) from + sum
        else add1(from + 1, to, sum + from)
    }
}
