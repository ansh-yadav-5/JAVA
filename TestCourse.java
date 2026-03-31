 class Course{
  String courseName;
  String[] students;
  int numberOfStudents;

  public Course(String courseName){
    this.courseName = courseName;
    students = new String[100];
    numberOfStudents = 0;
  }

  public String getCourseName(){
    return courseName;
  }

  public void addStudent(String student){
    students[numberOfStudents] = student;
    numberOfStudents++;
  }

  public String[] getStudents(){
    return students;
  }

  public int getNumberOfStudents(){
    return numberOfStudents;
  }

  public void dropStudent(String student){
    for (int i = 0; i < numberOfStudents; i++) {
      if (students[i].equals(student)) {
        for (int j = i; j < numberOfStudents - 1; j++) {
          students[j] = students[j + 1];
        }
        students[numberOfStudents - 1] = null;
        numberOfStudents--;
        break;
      }
    }
  }
}


public class TestCourse {
  public static void main(String[] args) {
    Course course = new Course("Java Programming");
    course.addStudent("Alice");
    course.addStudent("Bob");
    course.addStudent("Charlie");
    System.out.println("Course Name: " + course.getCourseName());
    System.out.println("Number of Students: " + course.getNumberOfStudents());
    System.out.println("Students: ");
    for (int i = 0; i < course.getNumberOfStudents(); i++) {
      System.out.println(course.getStudents()[i]);
    }
    course.dropStudent("Bob");
    System.out.println("After dropping Bob:");
    System.out.println("Number of Students: " + course.getNumberOfStudents());
    System.out.println("Students: ");
    for (int i = 0; i < course.getNumberOfStudents(); i++) {
      System.out.println(course.getStudents()[i]);
    }    
  }
}
