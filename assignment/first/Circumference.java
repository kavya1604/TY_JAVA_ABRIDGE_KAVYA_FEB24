package com.capgemini.assignment.first;

public class Circumference {
	static double circumference(int r) {
		double p=2*3.14*r;
		return p;
	}
	public static void main(String[] args) {
		double value=circumference(10);
		System.out.println(value);
	}

}
