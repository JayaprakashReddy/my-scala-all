package com.jpreddy.scala.functionalprogramming.monad

import scala.concurrent.ExecutionContext.Implicits.global

import scalaz._
import Scalaz._
object MonadDemo extends App {
  //Monad
  //def bind[A, B](fa: F[A])(f: A => F[B]) : F[B]
  val r1 = Monad[List].map(List("HI THIS","IS JP"," REDDY")){_.length}
  r1.foreach(x => print(x+" "))
  println
  val r2= Monad[List].bind(List("HI THIS","IS JP"," REDDY")){_.split(" ").toList}
  println(r2)
  
//  val fb = (a: String) => Applicative[List].point{x:String => x.length}
//  val r= Applicative[List].ap( List(1,2,3,4))(r4)
//  val r3= Monad[List].bind(List("HI THIS","IS JP"," REDDY"))( fb )
//  println(r3)
  
}