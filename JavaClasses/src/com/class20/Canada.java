package com.class20;

public class Canada {
	public static void main(String[] args) {
		USA us1 = new USA();
		System.out.println("Access from Canada class");

		System.out.println(us1.mainState);
		System.out.println(us1.school);
		//capitalCity is private
//		System.out.println(us1.capitalCity);
	}
}
