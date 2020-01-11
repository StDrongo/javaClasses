package com.class02;

public class Task2 {
	public static void main(String[] args) {
/*
 * Write a Java program to add, subtract, multiply and divide 2 decimals
 * Your program should say. 
 * “The _______ of 2 numbers ___ and ___ is equal to _____”
 */
		double num1, num2;
		
		num1=20.50;
		num2=10.77;
		
		double sum=num1+num2;
		double sub=num1-num2;
		double mult=num1*num2;
		double div=num1/num2;
		
		System.out.println("The addition of 2 numbers "+num1+" and "+num2+" is equal to "+sum);
		System.out.println("The subtraction of 2 numbers "+num1+" and "+num2+" is equal to "+sub);
		System.out.println("The multiplication of 2 numbers "+num1+" and "+num2+" is equal to "+mult);
		System.out.println("The division of 2 numbers "+num1+" and "+num2+" is equal to "+div);
		
		/*
		 * Write a program to find the square of the number 3.9. 
		 * You program should say “The square of the ____ is ____ “
		 */
		
		double number=3.9;
		double square=3.9*3.9;
		
		String message="The square of the "+number+" is "+square;
		System.out.println(message);
	}
}
