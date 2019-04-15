package com.atguigu.day01.exceptiondemo

import java.io.{FileInputStream, FileNotFoundException}

object ExcepDemo1 {
    
    def main(args: Array[String]) : Unit = {
        
        try {
            new FileInputStream("")
        } catch {
            case e: FileNotFoundException => println(e)
            case _ =>
        }finally {
            throw new FileNotFoundException()
        }
        println("aaa")
    }
}
