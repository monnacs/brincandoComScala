package com.scala

object esqueleto extends App {
  
	def soma (a:Int, b:Int) = {
		a + b;
	}
	
	def fact (x:Int):Int = {
	  if (x == 1) 1
	  else x * fact(x-1)
	}
	
	println (soma (10,30));
	println (fact (5));
	
	def ordena (x:Array[Int]) = {
	  
	  for (j <- 0 to x.length - 1) {
		  
		  var min:Int = x(j);
		  var minind:Int = j;
		  
		  for (i <- j + 1 to x.length - 1) {
		    if (min > x(i)) {
		      min = x(i)
		      minind = i
		    } 
		    else ()
		  }
		  
		  var aux:Int = x(j);
		  x(j) = min;
		  x(minind) = aux;
	  }
	  
	}
	
	
	var array = Array[Int](8,2,7,4)
	ordena(array)
	
	for (i <- 0 to array.length - 1)
		println(array(i))
}