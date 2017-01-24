package com.jpreddy.scala.functionalprogramming.io

object IODriver extends App {
  
  val a=1 to 5
  val b= 6 to 10
  val c=for{ x <- a
             y <- b
            // z <- if(y % 2 == 1)
      } yield(x + y)
  println(c)
  
  
 val f = (x:Int) => x
 val g = List.fill(100000)(f).foldLeft(f)(_ compose _)
 g(42)
 
 //trampolined function uses Kleisli composition
}