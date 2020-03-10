package com.capgemini.quiz.day4;
import java.io.*; 

public interface Quiz8 {
	
	
	
	 
		void m1(); 
	} 

	interface Quiz81 
	{ 
		void m2(); 
	} 


	class sample implements Quiz8, Quiz81 
	{ 
		@Override
		public void m1() 
		{ 
			System.out.println("Welcome: inside the method m1"); 
		} 

		@Override
		public void m2() 
		{ 
			System.out.println("Welcome: inside the method m2"); 
		} 
	} 

	


