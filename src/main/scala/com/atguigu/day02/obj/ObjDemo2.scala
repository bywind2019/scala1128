package com.atguigu.day02.obj

object ObjDemo2 {
    def main(args: Array[String]): Unit = {
        type P3 = PersonPersonPerson
        val p1 = new P3
        val p2 = new PersonPersonPerson
        println(p1.getClass)
        println(p2.getClass)
        
    }
}

class PersonPersonPerson
