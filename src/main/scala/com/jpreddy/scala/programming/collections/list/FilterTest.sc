package com.jpreddy.scala.programming.collections.list

object FilterTest {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
   val l= List("Hel lo","tes ting", "sc ala","collec tions")
                                                  //> l  : List[String] = List(Hel lo, tes ting, sc ala, collec tions)
   val l1 = l.filter(x => x.contains("o"))        //> l1  : List[String] = List(Hel lo, collec tions)
   val l2 = l.filter(x => x.contains("e"))        //> l2  : List[String] = List(Hel lo, tes ting, collec tions)
  
  val nums = (0 to 100).toList                    //> nums  : List[Int] = List(0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 1
                                                  //| 5, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 3
                                                  //| 4, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 5
                                                  //| 3, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 7
                                                  //| 2, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 9
                                                  //| 1, 92, 93, 94, 95, 96, 97, 98, 99, 100)
}