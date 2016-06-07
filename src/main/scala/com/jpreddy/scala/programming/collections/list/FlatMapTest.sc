package com.jpreddy.scala.programming.collections.list

object FlatMapTest {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  val l= List("Hel lo","tes ting", "sc ala","collec tions")
                                                  //> l  : List[String] = List(Hel lo, tes ting, sc ala, collec tions)
  val l1 =  l.flatMap(x => x.split(" "))          //> l1  : List[String] = List(Hel, lo, tes, ting, sc, ala, collec, tions)
  
}