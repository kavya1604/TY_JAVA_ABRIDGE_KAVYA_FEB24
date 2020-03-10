package com.capgemini.quiz.day6;

public class Quiz10 {
	
	   private String name;
	   private long amount;
	    Quiz10(String name, long amount)
	   {
	      this.name = name;
	      setAmount(amount);
	   }
	   void deposit(long amount)
	   {
	      this.amount += amount;
	   }
	   String getName()
	   {
	      return name;
	   }
	   long getAmount()
	   {
	      return amount;
	   }
	   void setAmount(long amount)
	   {
	      this.amount = amount;
	   }
	}

