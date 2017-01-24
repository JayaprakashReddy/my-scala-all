package com.jpreddy.scala.functionalprogramming.sciabarra

object HOFDSLDemo extends App{
  
  def loop(n:Int)(cmd : => Unit) =
{ 
  for(_  <- 1 to n) cmd
  
}
  
  val lp = loop(5){ println("Hello") }
  
}