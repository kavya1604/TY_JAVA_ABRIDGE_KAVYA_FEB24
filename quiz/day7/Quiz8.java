package com.capgemini.quiz.day7;

public class Quiz8 {
	
		public static void main(String[] args) {
			System.out.println("Find greatest & least numbers 10,20,40,23,12?");
			System.out.println("");
			int A = Integer.max(10, 20);
			int B = Integer.max(A, 40);
			int C = Integer.max(B, 23);
			int D = Integer.max(C, 12);
			System.out.println("greatest of 10,20,40,23,12 is " + D);
			System.out.println(" ");
			int a = Integer.min(10, 20);
			int b = Integer.min(a, 40);
			int c = Integer.min(b, 23);
			int d = Integer.min(c, 12);
			System.out.println("least of 10,20,40,23,12 is " + D);
		}
	}

