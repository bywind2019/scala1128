package com.atguigu.day04.highfun

/**
  * Author lzc
  * Date 2019-04-19 10:43
  */
object SortedDemo {
    def main(args: Array[String]): Unit = {
        implicit val userOrdering = new Ordering[User] {
            override def compare(x: User, y: User): Int = {
                x.age - y.age
            }
        }
        //        val list1 = List(30, 50, 70, 60, 10, 20)
        //        println(list1.sorted(Ordering.Int.reverse))
        
        val users = List(new User("a", 10), new User("b", 20), new User("c", 15))
        println(users.sorted(userOrdering.reverse))
    }
}

class User(val name: String, val age: Int) extends Ordered[User]{
    override def toString: String = s"[name = $name , age = $age]"
    
    override def compare(that: User): Int = {
        if (this.age == that.age) {
            this.name.compare(that.name)
        } else {
//            this.age - that.age
            this.age.compare(that.age)
        }
    }
}

/*
排序
    sorted
        Ordering.Int.reverse
    
    
    sortWith
         你的类型可以不重新, 匿名函数会变的比较复杂
    
    sortBy
    
    

 */