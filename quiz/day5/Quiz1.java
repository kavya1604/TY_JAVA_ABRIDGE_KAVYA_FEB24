package com.capgemini.quiz.day5;

public class Quiz1 {
	
		public int getData1() {//For method overloading,methods must have different 
			// signatures
			return 0;
		}

		public long getData() {
			return 1;
		}

		public static void main(String[] args) {
			Quiz1 q = new Quiz1();
			System.out.println(q.getData1());
		}
	}

