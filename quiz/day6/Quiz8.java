package com.capgemini.quiz.day6;

interface Quiz8 {
	
		  public void animalSound(); 
		  public void sleep(); 
}
		
		class Pig implements Quiz8 {
		  public void animalSound() {
		   
		    System.out.println("The pig says: wee wee");
		  }
		  public void sleep() {
		    
		    System.out.println("Zzz");
		  }
		}

		

