package com.capgemini.quiz.day6;

 interface Quiz5 {
	  
		 void print();  
		 }  
		 interface Showable{  
		 void show();  
		 }  
		 class A7 implements Quiz5,Showable{  
		 public void print(){
			 System.out.println("Hello");
			 }  
		 public void show(){
			 System.out.println("Welcome");
			 }  
		   
		 public static void main(String args[]){  
		 A7 obj = new A7();  
		 obj.print();  
		 obj.show();  
		  }  
		 }  


