package com.jpreddy.scala.programming.misc

object MyGlobalImplicits {
  
  implicit class StringUtilities(val s:String){
    def increment:String={
      val s1=s.map{c => (c+1).toChar}
      s1.toString
    }
  }
}