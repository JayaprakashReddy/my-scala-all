package com.jpreddy.scala.functionalprogramming.fpinscala.errorhandling

sealed trait Option[+A]{
	def map[B](f: A => B): Option[B] =
			this match {
			case None => None
			case Some(a) => Some(f(a))
	}

	def flatmap[B](f: A => Option[B]):Option[B] = this match
			{
			case None => None
			case Some(a) => f(a)
			}

	def getOrElse[B >: A](default: => B): B = this match{

	case None => default
	case Some(a) => a

	}

	def orElse[B >: A](ob : => Option[B]) : Option[B] = this match{
	case None => ob
	case oa => oa

	}

	def filter(f :A => Boolean) : Option[A] = this match {
	case None => None
	case Some(a) => if(f(a)) Some(a) else None
	}

}
object Option
{
	def mean(xs: Seq[Double]) : Option[Double]=
		{
				if(xs.length == 0) None
				else{
					val m =xs.sum/ xs.length
							Some(m)
				}
		}	  
	def variance(xs: Seq[Double]): Option[Double]={

			val r= mean(xs).flatmap(m => mean(xs.map( x => math.pow(x-m, 2))))
					r
	}
	def myFunction[A,B](f: A => B) : List[A] => Int = _ length
			def lift[A,B](f: A => B) :  Option[A] => Option[B]=  _ map f

			def map2[A,B,C](a: Option[A], b: Option[B])(f: (A, B) => C): Option[C]=
		{
				a.flatmap(aa => b.map( bb => f(aa,bb)))
		}
			def sequence[A](a: List[Option[A]]): Option[List[A]]=
				{
						a match{
						case Nil => Some(Nil)
						case(h :: t) =>   h.flatmap( hh => sequence(t).map(hh :: _))
						}
				}
			def Try[A](a: => A): Option[A] =
					try Some(a)
					catch { case e: Exception => None }

			def parseInts(a: List[String]): Option[List[Int]] =
				{
           val a1= a.map(e => Try(e.toInt))
           sequence(a1)
				}
}
case class Some[+A](get :A) extends Option[A]
case object None extends Option[Nothing]
