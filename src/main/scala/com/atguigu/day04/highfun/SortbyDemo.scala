package com.atguigu.day04.highfun

/**
  * Author lzc
  * Date 2019-04-19 11:32
  */
object SortbyDemo {
    def main(args: Array[String]): Unit = {
//        val list1 = List(3, 50, 7, 6, 10, 20)
//        println(list1.sortBy(x => x % 2))
        val ss = List("abc", "aaa", "a", "bbbb", "aaaaaa", "b")
        println(ss.sortBy(x => (x.length, x))(Ordering.Tuple2(Ordering.Int.reverse, Ordering.String.reverse)))
    
//        val users = List(new User("a", 10), new User("b", 20), new User("c", 15), new User("a", 15))
//        println(users.sortBy(user => (user.age, user.name)))
    }
}

/*
Ordering  => Comparator
    compare
    lt
    gt
        ...
Ordered  => Comparable
    compare
    >
    <
        ...

 */