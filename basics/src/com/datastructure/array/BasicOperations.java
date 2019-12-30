package com.datastructure.array;

class Student{
	public int rollNo;
	public String name;
	
	public Student(int rollNo, String name) {
		this.rollNo = rollNo;
		this.name = name;
	}
	
}

public class BasicOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student[] student;
		
//		allocating the memory for 5 object of type student
		student = new Student[5];
		
//		initialize the first element of the array
		student[0] = new Student(1, "A");
		
		student[1] = new Student(2, "B");
		student[2] = new Student(3, "C");
		student[3] = new Student(4, "D");
		student[4] = new Student(5, "E");
		
		for(int count = 0;count<student.length;count++)
		{
			System.out.println(student[count].rollNo+" : "+student[count].name);
		}
		
		
	}

}
