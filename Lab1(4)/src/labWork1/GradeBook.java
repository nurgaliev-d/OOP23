package labWork1; 
import java.util.ArrayList;
import java.util.List;
import Lab1.Student;

public class GradeBook {
    private Course course;
    private List<Student> students;

    public GradeBook(Course course) {
        this.course = course;
        this.students = new ArrayList<>();
    }

        public void addStudent(Student student) {
        students.add(student);
    }

        public void displayMessage() {
        System.out.println("Welcome to the GradeBook for the course: " + course.getName());
    }


    public String toString() {
        return "Course: " + course +
               "\nNumber of Students: " + students.size();
    }
}
