package com.capgemini.quiz.day4;

interface Multiply{
	  
	   public abstract int multiplyTwo(int n1, int n2);
	   
	   
	   int multiplyThree(int n1, int n2, int n3);

	  	}

	class Quiz6 implements Multiply{
	   public int multiplyTwo(int num1, int num2){
	      return num1*num2;
	   }
	   public int multiplyThree(int num1, int num2, int num3){
	      return num1*num2*num3;
	   }
	   public static void main(String args[]){
	      Multiply obj = new Quiz6();
	      System.out.println(obj.multiplyTwo(3, 7));
	      System.out.println(obj.multiplyThree(1, 9, 0));
	   }
	}