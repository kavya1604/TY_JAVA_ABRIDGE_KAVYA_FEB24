package com.capgemini.quiz.day7;

public class Quiz7 {
	
		public static void main(String args[]) {
			// Creating Wrapper class object
			Boolean obj = new Boolean(false);

			// Converting the wrapper object to primitive datatype
			boolean num = obj.booleanValue();

			System.out.println(num + " " + obj);

			Double r = new Double(98.99999);

			// Converting the wrapper object to primitive datatype
			// without giving xxxvalue method

			double k = r;// AutoUnBoxing
			System.out.println(r + " " + k);

			char d = 'v';

			Character m = d;// AutoBoxing
			// converting primitive datatype to wrapper object
			System.out.println(d + " " + m);

		
	}
}
