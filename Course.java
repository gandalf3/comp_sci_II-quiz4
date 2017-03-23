import java.util.Random;
class Course {
    String title;
    String subject;
    String description;
    Random rand = new Random();
    int crn;

    ArrayList<Character> grades = new ArrayList<>();

    public Course(String title) {
      this.title = title;
    }
    public Course(String title, String subject) {
      this(title);
      this.subject = subject;
    }
<<<<<<< HEAD
=======

    public void setGrade(){
        String validGrades = new String("ABCDF");
        int n = validGrades.length();
        char grade = validGrades.charAt(rand.nextInt(n));
        //grades.add(grade);
    }
>>>>>>> 9d231ed9d5af56192e7d4c1288645ff1b243b7cf
}
