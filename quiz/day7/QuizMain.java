package com.capgemini.quiz.day7;

public class QuizMain {
	
		 public static void main (String[] args) 
		    { 
		        // declares an Array of integers. 
		        Quiz5[] arr; 
		  
		        // allocating memory for 5 objects of type Student. 
		        arr = new Quiz5[5]; 
		  
		        // initialize the first elements of the array 
		        arr[0] = new Quiz5(1,"aman"); 
		  
		        // initialize the second elements of the array 
		        arr[1] = new Quiz5(2,"vaibhav"); 
		  
		        // so on... 
		        arr[2] = new Quiz5(3,"shikar"); 
		        arr[3] = new Quiz5(4,"dharmesh"); 
		        arr[4] = new Quiz5(5,"mohit"); 
		  
		        // accessing the elements of the specified array 
		        for (int i = 0; i < arr.length; i++) 
		            System.out.println("Element at " + i + " : " + 
		                        arr[i].roll_no +" "+ arr[i].name); 
		    } 
		} 


