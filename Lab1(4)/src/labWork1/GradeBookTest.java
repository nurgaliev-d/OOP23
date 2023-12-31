package labWork1;
import Lab1.Student;

import java.util.Arrays;
import java.util.Scanner;

public class GradeBookTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Course course = new Course("Java Programming", "Introductory Java Programming", 3, new String[]{"None"});

        GradeBook gradeBook = new GradeBook(course);

        for (int i = 1; i <= 3; i++) {
            System.out.print("Enter student name: ");
            String name = scanner.nextLine();
            System.out.print("Enter grades (comma-separated): ");
            String[] gradeStr = scanner.nextLine().split(",");
            int[] grades = Arrays.stream(gradeStr).mapToInt(Integer::parseInt).toArray();

            Student student = new Student(name);
            student.setGrades(grades);
            gradeBook.addStudent(student);
        }

        gradeBook.displayMessage();


        System.out.println(gradeBook);
    }
}
