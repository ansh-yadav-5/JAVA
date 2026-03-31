

class Course{
    String CourseName;
    String[] students;
    int NumberOfStudents;
        public Course course;
    
        
    
        Course( String CourseName ){
           this.CourseName = CourseName;
           students = new String[100];
           NumberOfStudents = 0;
    
        }
    
        String  getCourseName(){
                return CourseName;
            
        }
    
        void addStudent( String student){
            students[NumberOfStudents] = student;
            NumberOfStudents++;
    
        }
    
        // void dropStudent( String students){
    
        // }
    
        String[] getStudents(){
            return students;

    }

    int getNumberOfStudents(){
            return NumberOfStudents;

    }



}



public class TestCourseClass {
    public static void main(String[] args) {
        Course course = new Course("Java Programming");
        course.addStudent("Ansh");
        course.addStudent("Manish");
        course.addStudent("Harsh");

        System.out.println("Course name:   " + course.getCourseName());
        System.out.println("Number of Students:  " + course.getNumberOfStudents());
        for(int i=0; i < course.getNumberOfStudents(); i++){
            System.out.println(course.getStudents()[i]);
        }
      


        
    }
}
