package com.capgemini.quiz.day3;
class Student{
	int marks=10;
}
public class Quiz5 {
	public static void main(String[] args) {
		Student s=new Student();
		switch(s.marks) {
		default:System.out.println("100");
		case10:System.out.println("10");
		case98:System.out.println("98");
		}
	}

}
