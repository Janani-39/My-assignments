package week3.assignment1;

public class Student {
	public void getStudentInfo(int id) {
		System.out.println("Student ID: " +id);
	}
	public void getStudentInfo(int id,String name) {
		System.out.println("Student ID: " +id+  " Studentname: " + name);
	}
	public void getStudentInfo(String email,long phone) {
		System.out.println("email: " +email+ " Phone: " + phone);
	}

	public static void main(String[] args) {
		Student obj=new Student();
		obj.getStudentInfo(318);
		obj.getStudentInfo(318,"Jan abi");
		obj.getStudentInfo("janabi39@gmail.com", 9876543210l);

	}

}
