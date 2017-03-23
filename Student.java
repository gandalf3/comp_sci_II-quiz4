import java.util.Date;
import java.text.DateFormat;
import java.util.ArrayList;

public class Student extends Role {
	String name;
	double age;
	int grade;
	private double gpa;

	ArrayList<Course> courses;
	ArrayList<Character> grades = new ArrayList<>();



	public Student() {	}
	public Student(String name) {
		this.name = name;
	}
	public Student(String name, double age) {
		this(name);
		this.age = age;
	}

	public String getName(){
	    String name = this.name;
	    return name;
    }
    private void setGPA(double gpa){
        int score = 0;
        int numOfCourses = 0;
        for (char grade : grades){
            if (grade == 'A'){
                score+=4;
                numOfCourses ++;
            }else if (grade=='B'){
                score+='3';
                numOfCourses++;
            }else if(grade =='C'){
                score+=2;
                numOfCourses++;
            }else if (grade=='D'){
                score+=1;numOfCourses++;
            }else{
                numOfCourses++;
            }
        }
        gpa = score/numOfCourses;
    }

    public double getGPA(double gpa){
        return gpa;
    }

	public void addClass(String addName){
        Course course = new Course(addName);
        courses.add(course);
	}

	public void dropClass(String removeCourse){
        courses.remove(removeCourse);
	}
}
