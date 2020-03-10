package com.capgemini.quiz.day4;

 
	interface Quiz10 {
	    void getArea(int length, int breadth);
	}

	class Rectangle implements Quiz10 {
	    public void getArea(int length, int breadth) {
	        System.out.println("The area of the rectangle is " + (length * breadth));
	    }
	}

	class Main {
	    public static void main(String[] args) {
	        Rectangle r1 = new Rectangle();
	        r1.getArea(5, 6);
	    }
	}

