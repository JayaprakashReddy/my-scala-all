package com.jpreddy.scala.functionalprogramming.functor

import scala.concurrent.ExecutionContext.Implicits.global

import scalaz._
import Scalaz._

object FunctorDemo extends App {
  
  
  def addOne(ls:List[Int]) =   {
    Functor[List].map(ls) { _ + 1}
  }
  
  val lt = List(1,4,7,3)
  val lt1 = addOne(lt)
  lt1.foreach(x => print(" "+x))
}