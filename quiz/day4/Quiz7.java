package com.capgemini.quiz.day4;

 interface Quiz7 {
	 
	
	     
	   final int a=10;
	   void display();
	} 
	  
	
	class TestClass implements Quiz7 
	{ 
	   	    public void display() 
	    { 
	        System.out.println("Geek"); 
	    } 
	  
	    
	    public static void main (String[] args) 
	    { 
	        TestClass t = new TestClass(); 
	        t.display(); 
	        System.out.println(a); 
	    } 
	} 


