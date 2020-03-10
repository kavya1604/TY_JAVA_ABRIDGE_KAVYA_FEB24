package com.capgemini.quiz.day4;

abstract class AbstractDemo{
	   public void myMethod(){
	      System.out.println("Hello");
	   }
	   abstract public void anotherMethod();
	}
	public class Quiz3 extends AbstractDemo{

	   public void anotherMethod() { 
	        System.out.print("Abstract method"); 
	   }
	   public static void main(String args[])
	   { 
	     
	      AbstractDemo obj = new Quiz3();
	      obj.anotherMethod();
	   }
	}
