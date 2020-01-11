package com.class04;

public class Task {
	public static void main(String[] args) {
/*Create a Java program and store values 
 * of mortgage rate and mortgage price. 
 * program should check if rate is higher 
 * than 4.5 user will not buy a house, 
 * otherwise user will consider buying. 
 * Once user decides to buy a house, 
 * if price of the house is larger than 200000 than user will take a loan,
 * otherwise user will pay cash.*/
		
		double rate=5.5;
		double price=20000;
		
		if (rate>=4.5) {
			System.out.println("I am not bying the house");
		}else {
			System.out.println("I will consider bying the house");
			
			if (price>200000) {
				System.out.println("I will need a loan to by house");
			}else {
				System.out.println("I will pay cash for my house");
			}
		}
		
	}
}
