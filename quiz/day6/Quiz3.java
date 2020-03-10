package com.capgemini.quiz.day6;

 interface Quiz3 {
			void draw();  
		}  
		  
		class Quiz31 implements Quiz3{  
		public void draw(){
			System.out.println("drawing rectangle");}  
		}  
		class Circle implements Quiz3{  
		public void draw(){
			System.out.println("drawing circle");}  
		}  
		

