package com.class10;

public class HW1 {
	public static void main(String[] args) {

		for (int a = 5; a >= 1; a--) {//rows
			for (int b = 1; b <= a; b++) {//cols
				System.out.print(a);
			}
			System.out.println();
		}
	}
}
