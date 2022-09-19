package org.student;



import org.department.Department;

public class Student extends Department  {

	public void StudentName() {
		System.out.println("Janani");
	}
	public void StudentDepartment() {
		System.out.println("ECE");
	}
	public void StudentId() {
		System.out.println("722816106039");
	}
	public static void main(String[] args) {
		Student obj=new Student();
		obj.DepartmentName();
		obj.StudentName();
		obj.StudentId();
		obj.StudentDepartment();
		obj.CollegeName();
		obj.CollegeCode();
		obj.CollegeRank();

	}

}
