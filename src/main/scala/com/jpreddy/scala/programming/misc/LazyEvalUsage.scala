package com.jpreddy.scala.programming.misc

object LazyEvalUsage extends App {
  
  object LazyEvalDemo {
    lazy val x= {println("Initializing the x value"); 100}
  }
  LazyEvalDemo
  LazyEvalDemo.x
  
   object NoLazyEvalDemo {
    val z= {println("Initializing the z value"); 200}
  }
  NoLazyEvalDemo
//  NoLazyEvalDemo.z
  
}