package com.class07;

import java.util.Scanner;

public class Homework2 {

	public static void main(String[] args) {
		/* You need to ask user to pay for coffee
		 * You need to keep asking user to pay for it until
		 * entered price is equal =5; 
		 * After user paid then say "Enjoy your coffee!"
		 */
		//1 way with do while
		Scanner scan = new Scanner(System.in);
		int price;
		
		do {
			System.out.println("Please pay for your coffee");
			price=scan.nextInt();
			
		}while(price!=5);
		System.out.println("Enjoy your coffee");
		
		//2 way with while
		int price1;
		System.out.println("Please pay fo your coffee");
		price1=scan.nextInt();//4
		
		while(price1!=5) {
			System.out.println("Please pay for your coffee");
			price1=scan.nextInt();
		}
		
		System.out.println("Enjoy your coffee");
	}
}
