package com.jpreddy.scala.programming.methods

object NamedParameters extends App {
  
  
  //Named parameters 
  function1(lastName="Reddy")
  function1(firstName="JP")
  function1(lastName="Reddy", firstName="JP")
  
  println("----------------------")
  //Default paramters
  
  function1()
  function1("JP")
  function1("JP","Reddy")
  
  
  def function1(firstName: String="Unknown", lastName: String="Unknown" ) = { println(s"This is $firstName $lastName ")  }
}