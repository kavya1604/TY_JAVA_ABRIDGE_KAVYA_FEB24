package com.capgemini.quiz.day6;

 interface Quiz9 {
			  public void myMethod(); 
		}

		interface SecondInterface {
		  public void myOtherMethod(); 
		}

		class DemoClass implements Quiz9, SecondInterface {
		  public void myMethod() {
		    System.out.println("Some text..");
		  }
		  public void myOtherMethod() {
		    System.out.println("Some other text...");
		  }
		}

		