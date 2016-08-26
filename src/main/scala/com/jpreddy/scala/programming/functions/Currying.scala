package com.jpreddy.scala.programming.functions

object Currying extends App {
  
  
  def myFunction(name:String)( phone : String) ={  new String(s"This is $name with phone number $phone") }
  
  val myFunction1 = myFunction("JP")_
  
  println(myFunction1("0470037352"))
}