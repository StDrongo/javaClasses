package com.class23;

public class Student {
	
	String name;
	int grade1, grade2, grade3;
	
	Student(String studentName, int gr1, int gr2, int gr3){
		name=studentName;
		grade1=gr1;
		grade2=gr2;
		grade3=gr3;
	}
	
	public static void main(String[] args) {
		Student student1=new Student("John", 90, 78, 100);
		student1.caculateAverage();
		
		Student student2=new Student("Anna", 90, 88, 100);
		student2.caculateAverage();
		
		Student student3=new Student("Ibrahim", 88, 78, 100);
		student3.caculateAverage();
		
		Student student4=new Student("Mehmet", 90, 88, 80);
		student4.caculateAverage();
		
		Student student5=new Student("Ozlem", 90, 68, 80);
		student5.caculateAverage();
	}
	
	public void caculateAverage() {
		int average=(grade1+grade2+grade3)/3;
		System.out.println("Student "+name+" has an average grade of "+average);
	}
	
	public void hello() {
		System.out.println("hello "+name);
	}
}
