package com.capgemini.quiz.day2;

public class Test6 {
public static void main(String[] args) {
	Quiz6 q=new Quiz6();
	Quiz6 q1=new Quiz6();
	
	q.x=0;
	q.y=0;
	q.cal(1, 2);
	q1.x=0;
	q1.cal(2,3);
	System.out.println(q.x+" "+q1.y);
	
}
}
//1   5