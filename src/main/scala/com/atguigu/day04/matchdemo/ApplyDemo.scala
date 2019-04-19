package com.atguigu.day04.matchdemo

import scala.collection.mutable

object ApplyDemo {
    def main(args: Array[String]): Unit = {
        val p1 = Person("abc")
        println(p1.name)
        println(p1("name")) // p1.apply(name)
        println(p1("age")) // p1.apply(name)
        
        val list1 = mutable.ListBuffer(30, 50, 70, 60, 10, 20)
        list1(0)
        list1(0) = 100
        
        p1("name") = "lisi"
        //        p1.name = "lisi"
        println(p1.name)
        
    }
}

class Person(var name: String, var age: Int) {
    def apply(prop: String) = {
        prop match {
            case "name" => name
            case "age" => age
        }
    }
    
    def update(prop: String, value: String) = {
        prop match{
            case "name" => name = value
        }
    }
}

object Person {
    def apply(name: String) = new Person(name, 20)
}

/*
Apply:
 */
