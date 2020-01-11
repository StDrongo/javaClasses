package com.class08;

import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {
		//task
		for(int i=1;i<=50;i++) {
	        if(i%3==0) {
	            continue;
	        }
	        System.out.println(i);
	    }
		//2 task
		String card;
		Scanner scan = new Scanner(System.in);
		
		for (int q = 1; q <= 10; q++) {
			System.out.println("Are you apply to a credit card?");
			card = scan.nextLine();
			if (card.equalsIgnoreCase("Yes")) {
				break;
			}
		}
	}
}
