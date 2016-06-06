package com.jpreddy.scala.databricks_styleguide

/**
 * This is code snippet to explain suugested use of Monadic Chaining idiom
 */
object MonadicChaining extends App {
  
  class Person(val data: Map[String, String])
val database = Map[String, Person]()
// Sometimes the client can store "null" value in the  store "address"

// A monadic chaining approach
def getAddress1(name: String): Option[String] = {
  database.get(name).flatMap { elem =>
    elem.data.get("address")
      .flatMap(Option.apply)  // handle null value
  }
}

// A more readable approach, despite much longer
def getAddress2(name: String): Option[String] = {
  if (!database.contains(name)) {
    return None
  }

  database(name).data.get("address") match {
    case Some(null) => None  // handle null value
    case Some(addr) => Option(addr)
    case None => None
  }
}
}