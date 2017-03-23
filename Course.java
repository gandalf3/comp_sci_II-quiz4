import java.util.Random;
class Course {
    String title;
    String subject;
    String description;
    Random rand = new Random();
    int crn;

    public Course(String title) {
      this.title = title;
    }
    public Course(String title, String subject) {
      this(title);
      this.subject = subject;
    }

    public void setGrade(){
        String validGrades = new String("ABCDF");
        int n = validGrades.length();
        char grade = validGrades.charAt(rand.nextInt(n));
        //grades.add(grade);
    }
}
