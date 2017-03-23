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
}
