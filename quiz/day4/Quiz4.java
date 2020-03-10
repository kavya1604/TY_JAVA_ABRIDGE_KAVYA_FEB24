package com.capgemini.quiz.day4;

abstract class Quiz41{
	   public void myMethod(){
	      System.out.println("Hello");
	   }
	   abstract public void anotherMethod();
	}
	public class Quiz4 extends Quiz41{

	   public void anotherMethod() { 
	        System.out.print("Abstract method"); 
	   }
	   public static void main(String args[])
	   { 
	      	     Quiz41 obj = new Quiz4();
	      obj.anotherMethod();
	   }
	}