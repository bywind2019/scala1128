package com.atguigu.day04.highfun

/**
  * Author lzc
  * Date 2019-04-19 11:15
  */
object SortWithDemo {
    def main(args: Array[String]): Unit = {
        //        val list1 = List(30, 50, 70, 60, 10, 20)
        //        println(list1.sortWith((x, y) => x > y))
        val users = List(new User("a", 10), new User("b", 20), new User("c", 15), new User("a", 15))
    
        /*val list2: List[User] = users.sortWith((user1, user2) => {
            if (user1.age == user2.age) {
                user1.name > user2.name
            } else {
                user1.age > user2.age
            }
        })*/
        val list2: List[User] = users.sortWith((user1, user2) => {
            user1 < user2
        })
        println(list2)
    }
}
