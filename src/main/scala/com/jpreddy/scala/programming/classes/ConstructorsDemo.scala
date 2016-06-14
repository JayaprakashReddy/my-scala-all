package com.jpreddy.scala.programming.classes

/**
 * @author JPReddy
 */
object ConstructorsDemo extends App {
  
  class Person (val email: String,private var _age:Int=0){
   
//    def this(email:String)={
//      this(email,24)
//    }
    
    def this()={
      this("",-1)
    }
   def age=_age
    def age_=(ageV:Int)  {_age=ageV }
    
  }
  
  val p =new Person("JP",35)
  println(p.email)
  println(p.age)
  
  p.age= 36;
  println(p.age)
  
  
  val p1=new Person("Summu")
  println(p1.age)
  
  
  p1.age=40
  println(p1.age)
  
  
  class Stock (private var _symbol: String) {

  // getter
  def symbol = _symbol

  // setter
  def symbol_= (s: String) {
   _symbol = s
    println(s"symbol was updated, new value is $symbol")
  }

}
  
 val st= new Stock("GBR") 
 println(st.symbol)
 st.symbol = "OKF"
 println(st.symbol)
 

  class MyStock (private var _symbol: String) {
   
   def compare(m:MyStock)={this._symbol > m._symbol}
 }
  val mstck = new MyStock("TEST")
//  mstck._symbol = "dsfs"
//  println(mstck._symbol)
  
   val mstck1 = new MyStock("APPLE")
   println(mstck.compare(mstck1))
  
}