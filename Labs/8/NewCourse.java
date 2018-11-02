import java.util.*;

public class NewCourse{

	private String courseName;
	private int numOfstudents;
	ArrayList<String> students = new ArrayList<String>();
  
	NewCourse(String coursename) {

		this.courseName=coursename;
		numOfstudents=0;
	}

	public void addStudent(String student) {

		students.add(student);
		numOfstudents++;
	}
	
	public ArrayList<String> getStudents() {
		
		return students;
	}
	
	public int getnumOfstudents() {
		
		return numOfstudents;
	}

	public String getcourseName() {
		
		return courseName;
	}

	public static void main(String []args){
		NewCourse students=new NewCourse("Math");
		students.addStudent("Mathew");
		students.addStudent("John");
		students.addStudent("Luke");
			
		System.out.println(students.getStudents());
		System.out.println(students.getnumOfstudents());
		System.out.println(students.getcourseName());
  
	}
}