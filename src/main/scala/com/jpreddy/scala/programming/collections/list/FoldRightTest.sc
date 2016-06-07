package com.jpreddy.scala.programming.collections.list

object FoldRightTest {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  val l1 = List(1,34,45,76,43)                    //> l1  : List[Int] = List(1, 34, 45, 76, 43)
  val s1 =l1.foldRight(1)((a:Int,b:Int) => a+ b%2)//> s1  : Int = 2
 
  
  val s2 =l1.foldRight(2.5f)((a:Int,b:Float) => a%5 + b)
                                                  //> s2  : Float = 11.5
  
  
  val s3 =l1.foldRight("Hello")((a:Int,b:String) => a.toString + " "+b)
                                                  //> s3  : String = 1 34 45 76 43 Hello
 //
}