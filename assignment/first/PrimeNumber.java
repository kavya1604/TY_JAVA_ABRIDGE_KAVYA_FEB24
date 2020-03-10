package com.capgemini.assignment.first;

public class PrimeNumber {
public static void main(String[] args) {
	int value=prime(5);
	System.out.println(value);
}
static int prime(int i) {
	int count=0;
	for(int j=1;j<=i;j++) {
		if(i%j==0) {
			count++;
			
		}
	}
	if(count==2) {
		return 1;
		
	}
	else {
		return 0;
	}
}
}
