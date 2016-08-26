package com.jpreddy.scala.programming.functions

object PartiallyAppliedFunctions extends App {
  
  
  
  val myFunction = (name:String,  phone : String) => {  new String(s"This is $name with phone number $phone") }
  
  val myFunction1 = myFunction("JP",_:String)
  
  println(myFunction1("0470037352"))
}