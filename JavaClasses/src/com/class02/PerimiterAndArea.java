package com.class02;

public class PerimiterAndArea {

	public static void main (String[] args) {
		int width=5;
		int height=8;
		int area=width*height;
		int perimeter=2*(width+height);
		/*
		 * The perimeter of a rectangle with width ___ 
		 * and height ____ is equal to _____ and the area is __”
		 */
		System.out.println("The perimiter of rectangle with width "+width
				+ " and height "+height+" is equal to "+perimeter
				+" and the area is "+area);
		
		String message="The perimiter of rectangle with width "+width
				+ " and height "+height+" is equal to "+perimeter
				+" and the area is "+area;
		
		System.out.println(message);
	}
}
