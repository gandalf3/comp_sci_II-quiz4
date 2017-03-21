import java.util.Date;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Random;

public class Student {
	String name;
	double age;
	int grade;
	double gpa;

	ArrayList<Course> courses;
	ArrayList<grades> grades;

	Random rand = new Random();
	String alphabet = "ABCDF";
	int n = alphabet.length();
	for (int grades : courses){
		char grade = alphabet.charAt(r.nextInt(N));
		grades.add(grade);
	}

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



	public void addClass(){

	}

	public void dropClass(){

	}

	public int modifyGradeLevel(int grade, String direction){
		if (direction=="+"){
			grade++;
		}else if (direction=="-"){
			grade--;
		}
	}

	public static double gpaCalculator(double gpa, ArrayList grades){
		int result;
		int score;
		int numOfGrades = 0;
		for (grade : grades){
			if (grade == 'A'){
				score+=4;
				numOfGrades ++;
			}else if (grade='B'){
				score+='3';
				numOfGrades++;
			}else if(grade =='C'){
				score+=2;
				numOfGrades++;
			}else if (grade='D'){
				score+=1;numOfGrades++;
			}else{
				numOfGrades++;
			}
		}

		result = score/numOfGrades;
		return result;
	}



}
