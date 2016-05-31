package com.jpreddy.scala.snippets

object MyApplication extends App {

  println("*******************************************************")
  println("This is MyApplication")
  
  println("Step1 : Map creation and usage")
  val map1 =Map[String,Int] ("name" -> 4, "age" -> 3, "email" -> 5)
  println(s"Map size=${map1.size}")
  println(s"Map value for key name=${map1 get "name"}")
  println("Step2 : List creation")
  println("Step3 : Set creation")
  println("Step5 : Done")
  println("*******************************************************")

  def createVariables={
   val s= List[String]("My","Name")
   println(s.size)



  }


}
