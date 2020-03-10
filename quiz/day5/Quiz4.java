package com.capgemini.quiz.day5;

public class Quiz4 {
	
		public String function(String temp,int data) {
			return("Question_4");
		}
		private String function(int data,String temp) {
			return("This is Question_4");
		}
		public static void main(String[] args) {
			Quiz4 q=new Quiz4();
			System.out.println(q.function(4,"Question_4"));
		}
	}


