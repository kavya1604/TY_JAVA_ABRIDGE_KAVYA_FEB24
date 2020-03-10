package com.capgemini.assignment.second;
import java.util.Scanner;

public class Sample {
	public static void main(String[] args) {
		String name;
		int age;
		long phonenum;
		String email;
		String address;
		Scanner sc=new Scanner(System.in);
		while(true) {
			System.out.println("choose 1 for name");
			System.out.println("choose 2 for age");
			System.out.println("choose 3 for phonenum");
			System.out.println("choose 4 for email");
			System.out.println("choose 5 for address");
	System.out.println("choose 6 for exit");
		int x=sc.nextInt();
		switch(x) {
		case 1:System.out.println("enter your name");
		name=sc.next();
		System.out.println("name");
		break;
		case 2:System.out.println("enter your age");
		age=sc.nextInt();
		System.out.println(age);
		break;
		case 3:System.out.println("enter your phonenum");
		phonenum=sc.nextLong();
		System.out.println(phonenum);
		break;
		case 4:System.out.println("enter your email");
		email=sc.next();
		System.out.println(email);
		break;
		case 5:System.out.println("enter your address");
		address=sc.next();
		System.out.println(address);
		break;
		case 6:System.out.println("for exit");
		break;
		}
		
		
		}
	}
}