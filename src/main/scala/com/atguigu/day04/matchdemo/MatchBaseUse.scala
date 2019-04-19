package com.atguigu.day04.matchdemo

/**
  * Author lzc
  * Date 2019-04-19 14:55
  */
object MatchBaseUse {
    def main(args: Array[String]): Unit = {
        println(operator(3, 4, "%"))
    }
    
    def operator(x: Int, y: Int, opt: String): Any = {
        opt match {
            case "+" => x + y
            case "-" => x - y
            case "*" => x * y
            case "/" => x.toDouble / y
            case _ =>
        }
    }
}

/*
模式匹配要不java的switch强大的很多



byte char short int  enum  String(1.7)
switch (x){
    case 常量:
            ...
            break;
    case ...:
    
            break;
    default:
            ...
}

 */
