package com.capgemini.quiz.day3;
class Product{
double price;
}
public class Quiz4{
	public void updatePrice(Product product,double price ) {
		price=price*2;
		product.price=product.price+price;
	}
	public static void main(String[] args) {
		Product prt=new Product();
		prt.price=200;
		double newPrice=100;
		Quiz4 q=new Quiz4();
		q.updatePrice(prt, newPrice);
		System.out.println(prt.price+":"+newPrice);
	}
		
		
	
}
