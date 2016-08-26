package com.jpreddy.scala.programming.functions

import scala.collection.mutable.ListBuffer

object FunctionReturnFunction extends App {
  
  val alg1=getAlgorithm("LR")
  alg1(ListBuffer("OK","THIS","IS","TEST"))
  
  val alg2=getAlgorithm("KNN")
  alg2(ListBuffer("OK","THIS","IS","TEST"))
  
  val   getAlgorithm =(name:String) => {
    (data :ListBuffer[String]) =>  name match{
    case "KNN" =>  data.head 
    case "LR"  =>   data.length 
  }
}
  
}