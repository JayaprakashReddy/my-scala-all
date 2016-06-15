package com.jpreddy.scala.functionalprogramming.errorhandling

import java.util.NoSuchElementException

trait Option[+A]{
  def map[B](f: A => B): Option[B]
  def flatMap[B](f: A => Option[B]) : Option[B]
  def filter(f: A => Boolean) : Option[A]
  def getOrElse[B >: A](default: => B): B
  def orElse[B >: A](ob: => Option[B]) : Option[B]
}

abstract class MyOption[+A] extends Option[A] {
  def isEmpty: Boolean 
  def get : A 
  def map[B](f: A => B ): Option[B] =  if(isEmpty) MyNone else new MySome[B](f(get))
  def flatMap[B](f: A => Option[B]) : Option[B] =  if(isEmpty) MyNone else f(get)
  def filter(f: A => Boolean) : Option[A] =  if(isEmpty || !f(get) ) MyNone else this
  def getOrElse[B >: A](default: => B) = {
    if(!isEmpty) get
    else default
  }
  def orElse[B >: A](ob: => Option[B]) ={
     if(!isEmpty) this
    else ob
  }
}

class MySome[+A](opt:A) extends MyOption[A]{
  def isEmpty = false
  def get =opt
}

object MyNone extends MyOption[Nothing]{
  def isEmpty = true
  def get = throw new NoSuchElementException("MyNone.get")
}

object Option {
   def lift[A,B](f: A => B): Option[A] => Option[B] =   _ map f 
 def map2[A,B,C](a: Option[A], b: Option[B])(f: (A, B) => C): Option[C] ={
   a.flatMap( vala => b.map(valb => f(vala,valb)) )  
 }
   
  def sequence[A](a: List[Option[A]]): Option[List[A]] =
  {
    a.foldRight[Option[List[A]]](new MySome(Nil))( (x,y) => map2(x,y)(_::_))
  }
  def traverse[A, B](a: List[A])(f: A => Option[B]): Option[List[B]] = {
    
    a.foldRight[Option[List[B]]](new MySome(Nil))( (x,y) => map2(f(x),y)(_::_))
  }
}
class MyMath{
  
 def mean(xs: Seq[Double]): Option[Double]={
    if(xs.length == 0) MyNone
    else new MySome(xs.sum/xs.length)
  }
  
 def variance(xs: Seq[Double]): Option[Double]=
 {
  mean(xs).flatMap( m => mean(xs.map( x => math.pow(x -m,2)) ) )
 }
 

 
 
}
  
  
  
