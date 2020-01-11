package com.class02;

public class Task {

	public static void main(String[] args) {
		/*
		 * In your program create different
		 * type of variables to store student’s information
		 * name lastName grade city state phoneNumber b) 
		 * Change student’s city, state, phone number and grade. And print those updated
		 * values.
		 */
		
		String studentName="Michael";
		String studentLastName="Johnes";
		char studentGrade='B';
		String studentCity="Chantilly";
		String studentState="VA";
		String studentPhoneNumber="(123)456-7890";
		
		//String studentCity="Washington DC";// we do not need to declare
		//variable again
		studentCity="Washington DC";
		studentState="DC";
		studentPhoneNumber="(987)654-43210";
		studentGrade='A';
		
		System.out.println(studentCity);
		// My name is __
		// I live in city of ___
		// My phone number is__
	}
}
