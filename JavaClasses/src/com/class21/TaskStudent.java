package com.class21;

public class TaskStudent {
	public String studentName;
	public int studentId;
	public static int numberOfStudent;

	public static void main(String[] args) {
		TaskStudent s1 = new TaskStudent();
		s1.studentName = "Ali";
		s1.studentId = 345;
		TaskStudent.numberOfStudent++;

		TaskStudent s3 = new TaskStudent();
		s3.studentName = "Seval";
		s3.studentId = 456;
		TaskStudent.numberOfStudent++;
		
		TaskStudent s5 = new TaskStudent();
		s5.studentName = "Samuel";
		s5.studentId = 567;
		TaskStudent.numberOfStudent++;

		System.out.println("The total number of students is: " + TaskStudent.numberOfStudent);
//		System.out.println("The total number of students is: " + s1.numberOfStudent);
//		System.out.println("The total number of students is: " + s3.numberOfStudent);
//		System.out.println("The total number of students is: " + s5.numberOfStudent);
}

}
