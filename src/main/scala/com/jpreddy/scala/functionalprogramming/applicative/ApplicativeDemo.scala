package com.jpreddy.scala.functionalprogramming.applicative
import scala.concurrent.ExecutionContext.Implicits.global
import scalaz._
import Scalaz._

object ApplicativeDemo extends App {
  //Applicative Functor def ap[A,B](fa: => F[A])(f: => F[A => B]): F[B]
  val r1 = List(1,2,3,4) <*> List({(_:Int ) * 3})
  println(r1)
  
  val r2 = Apply[List].ap(List(1,2,3,4))( List({(_:Int ) * 4}) )
  println(r2)
  
// val r3 = ApplyOps[List] <*> List({(_:Int ) * 5})
   
  val r4 = Applicative[List].point{ x:Int => x*5}
  val r5 = Applicative[List].ap( List(1,2,3,4))(r4)
  println(r5)
  
  val r6 = { (_:Int)* 6}.point[List]
  val r7 = List(1,2,3,4) <*> r6
  println(r7)
  
  val r8 = List(1,2,4) <*> List({(_:Int) * 3},{(_:Int) * 4}) 
  println(r8)
  
  val r9 = List(1,2,4) <*> List({(_:Int) * 3}) <*> List({(_:Int) * 4}) 
  println(r9)
  
  val r10 =  List(1,2,4).map{(_:Int) * 3}.map{(_:Int) * 4}
  println(r10)
}