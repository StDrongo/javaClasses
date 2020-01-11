package com.class20;

public class Task1 {
	public static void main(String[] args) {
		//I just added this line for fun.
		Task1 task = new Task1();

		String str = "Anna";

		String result = task.reverseString(str);
		System.out.println(result);

		boolean result2 = task.isPalindrome(str);
		System.out.println("Is \"" + str + "\" Palindrome? " + result2);

		String[] strArray = task.arrayOfWords("What a beautiful day is today!");
		System.out.println("The length of the array is: " + strArray.length);
		
		for (String word : strArray) {
			System.out.println(word);
		}
	}

	public boolean isPalindrome(String param) {
		boolean result = false;

		String reverse = reverseString(param);

		if (param.equalsIgnoreCase(reverse)) {
			result = true;
		} else {
			result = false;
		}

		return result;
	}

	String reverseString(String param) {
		String result = "";

		char[] charArray = param.toCharArray();

		for (int i = charArray.length - 1; i >= 0; i--) {
			result += charArray[i];
		}

		return result;
	}

	private String[] arrayOfWords(String sentence) {
//		String[] stringArray;
//		stringArray = sentence.split(" ");
//		return stringArray;

		return sentence.split(" ");
	}

}
