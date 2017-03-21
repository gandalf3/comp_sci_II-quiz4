class Course {
    String title;
    String subject;
    String description;
    ArrayList<Course> prereqs;
    int crn;

    public Course(String title) {
      this.title = title;
    }
    public Course(String title, String subject) {
      this(title);
      this.subject = subject;
    }

}
