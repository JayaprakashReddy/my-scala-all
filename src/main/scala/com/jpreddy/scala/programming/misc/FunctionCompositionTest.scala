package com.jpreddy.scala.programming.misc

object FunctionCompositionTest extends App {

	object funcompose { 
		def lift(ls: List[Int]) = ls map { x => Option(x)} 
		def findNElem(elem: Int, ls: List[Option[Int]]): Boolean = ls match {
		case Nil => false
		case x :: xs => if (elem == x.get) true else findNElem (elem, xs)
		}
	}
 
	val findElemCurried = (funcompose.findNElem _).curried
	val f1 =findElemCurried(3)
//	val l1= List(Option(1),Option(3))
//	val f2 =findElemCurried(l1)
	val f3 = funcompose.lift _
	val fcompl = findElemCurried(3) compose funcompose.lift _
	
	val r=fcompl(List(1,2,4,56))
	println(r)
	
	val r1=fcompl(List(1,2,3,4,56))
	println(r1)
}