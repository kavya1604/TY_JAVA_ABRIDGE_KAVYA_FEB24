package com.capgemini.quiz.day5;

import java.io.IOException;

public class Quiz2 {
			public int getData1(String temp) throws IOException{
			//methods that throws different exceptions are not overloaded
			//as their signature are still the same
			return 0;
		}
		public int getData(String temp) throws Exception{
			return 1;
		}
		public static void main(String[] args) {
			Quiz2 q= new Quiz2();
			System.out.println("Question_2");
		}
	}

