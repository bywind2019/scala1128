package com.atguigu.day03.collectionhigh

object FilterDemoDemo {
    def main(args: Array[String]): Unit = {
        var list1 = List(10, 20, "abc", 100, "aa", "bbb")
        
        val list2: List[Any] = list1
            .filter(_.isInstanceOf[Int])
            .map(_.asInstanceOf[Int] + 1)
        println(list2)
        
        /*val list2: List[Any] = list1.map(x => {
            if (x.isInstanceOf[Int]) {
                x.asInstanceOf[Int] + 1
            } else {
                None
            }
        })*/
        
        
    }
}

/*
forEach
    遍历集合中的元素. 用来替换循环

Map
    可以更改我们数据类型
 */
