package com.capgemini.assignment.first;

public class Palindrome {
public static void main(String[] args) {
	int value=palindrome(143);
	System.out.println(value);
}
static int palindrome(int i) {
	int rev=0,rem;
	while(i!=0) {
		rem=i%10;
		rev=rev*10+rem;
		i=i/10;
	}
	return rev;
}
}
