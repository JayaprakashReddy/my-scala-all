package com.jpreddy.scala.programming.collections.list

object SortingTest extends App {
  
  val l1 = List(1,4,3,78,45,23)
  val l1Sorted = l1.sorted
  l1Sorted.foreach{x => print(x.toString+" ") }
  println
  
  val l1SortWith = l1.sortWith(_ > _)
  l1SortWith.foreach{x => print(x.toString+" ") }
  println
  
  case class  Person(name:String, age:Int)
  val listPersons = List(Person("JP", 34),Person("Aadhya",1),Person("Sammu",6))
  val listPersonsSortBy = listPersons.sortBy(_.name)
  listPersonsSortBy.foreach{x => print(x.toString+" ") }
  
  println
  val listPersonsSortBy1 = listPersons.sortBy(_.age)
  listPersonsSortBy1.foreach{x => print(x.toString+" ") }
  
  println
  val listPersonsSortWith = listPersons.sortWith(_.age > _.age)
  listPersonsSortWith.foreach{x => print(x.toString+" ") }
  
}