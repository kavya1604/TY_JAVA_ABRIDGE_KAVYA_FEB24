package com.capgemini.quiz.day4;

 interface Quiz1 {
	

	   	   public void method1();
	   public void method2();
	}
	class Demo implements Quiz1{
	
	  
	   public void method1()
	   {
		System.out.println("implementation of method1");
	   }
	   public void method2()
	   {
		System.out.println("implementation of method2");
	   }
	   public static void main(String arg[]){
		Demo d= new Demo();
		d.method1();
		d.method2();
	   }
	}


