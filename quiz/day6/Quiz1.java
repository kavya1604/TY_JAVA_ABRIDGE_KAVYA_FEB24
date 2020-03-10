package com.capgemini.quiz.day6;
 interface Quiz1 {
	
		   void getArea();
		   default void getSides() {
		      System.out.println("I can get sides of polygon.");
		   }
		}

		class Rectangle implements Quiz1{
		   public void getArea() {
		      int length = 6;
		      int breadth = 5;
		      int area = length * breadth;
		      System.out.println("The area of the rectangle is "+area);
		   }

		   public void getSides() {
		      System.out.println("I have 4 sides.");
		   }
		}

		class Square implements Quiz1 {
		   public void getArea() {
		      int length = 5;
		      int area = length * length;
		      System.out.println("The area of the square is "+area);
		   }
		}

		class Main {
		   public static void main(String[] args) {
		      Rectangle r1 = new Rectangle();
		      r1.getArea();
		      r1.getSides();

		      Square s1 = new Square();
		      s1.getArea();
		   }
		}

