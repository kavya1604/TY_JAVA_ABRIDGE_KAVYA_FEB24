package com.capgemini.quiz.day4;

abstract class Animal{
	   	   public abstract void sound();{
	}
}
	
	public class Quiz2 extends Animal{

	   public void sound(){
		System.out.println("Woof");
	   }
	   public static void main(String args[]){
		Animal obj = new Quiz2();
		obj.sound();
	   }
	}
