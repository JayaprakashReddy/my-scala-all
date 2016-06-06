package com.jpreddy.scala.programming.misc

object LazyEvalTest {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  val x = true && { println("Hello");  false}     //> Hello
                                                  //| x  : Boolean = false
  println(x)                                      //> false
}