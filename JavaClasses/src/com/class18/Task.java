package com.class18;

public class Task {

	public static void main(String[] args) {
		Task task1 = new Task();
		task1.largerNumber(300, 300);
		task1.evenOrOdd(99);
		task1.evenOrOdd(10);
		task1.palindrome("hello");//argument
		task1.palindrome("madam");
	}
		//methodName (2 int type parameters)
	void largerNumber(int firstNumber, int secondNumber) {
		if (firstNumber > secondNumber) {
			System.out.println("The larger number is" + " " + firstNumber);
		} else if (firstNumber < secondNumber) {
			System.out.println("The larger number is" + " " + secondNumber);
		} else {
			System.out.println("Numbers are equal");
		}
	}

	void evenOrOdd(int number) {
		if (number % 2 == 0) {
			System.out.println("the number is even number");
		} else {
			System.out.println("the number is odd number");
		}
	}

	void palindrome(String word) {
        String reverse = "";
        for (int i =word.length() - 1; i >= 0; i--) {
              reverse = reverse + word.charAt(i);
        } 
        
		if (word.equals(reverse)) {
			System.out.println("The string is a palindrome.");
		} else {
			System.out.println("The string isn't a palindrome.");
        }
    }
}
