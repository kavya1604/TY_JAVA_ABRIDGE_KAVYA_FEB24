package com.capgemini.quiz.day4;

public class Test1 implements Quiz1{
	
	  
	   public void method1()
	   {
		System.out.println("implementation of method1");
	   }
	   public void method2()
	   {
		System.out.println("implementation of method2");
	   }
	   public static void main(String arg[]){
		Test1 t= new Test1();
		t.method1();
		t.method2();
	   }
	}
