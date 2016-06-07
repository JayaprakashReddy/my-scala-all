package com.jpreddy.scala.programming.collections.list

object FoldLeftTest extends App {
  
  val l1 = List(1,34,45,76,43)
  val s1 =l1.foldLeft(1)((a:Int,b:Int) => a+ b%2)
  println(s1)
  
  val s2 =l1.foldLeft(2.5f)((a:Float,b:Int) => a + b%2)
  println(s2)
  
  val s3 =l1.foldLeft("Hello")((a:String,b:Int) => a + " "+b.toString)
  println(s3)
}