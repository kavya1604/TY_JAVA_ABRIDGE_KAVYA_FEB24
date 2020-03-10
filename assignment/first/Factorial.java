package com.capgemini.assignment.first;

public class Factorial {
static int factorial(int j) {
	int f=1;
	for(int i=1;i<=j;i++) {
		f=f*i;
	}
		return f;
	}
public static void main(String[] args) {
int value=factorial(5);
System.out.println(value);
}
}

