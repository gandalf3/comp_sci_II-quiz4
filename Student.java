import java.util.Date;
import java.text.DateFormat;
import java.util.ArrayList;

public class Student {
	String name;
	double age;
	int grade;
	double gpa;
	ArrayList<Course> courses;

	public Student() {}
	public Student(String name) {
		this.name = name;
	}
	public Student(String name, double age) {
		this(name);
		this.age = age;
	}

	public void addClass();
	/*
	public void addClass()

	public void dropClass();
	*/


}
