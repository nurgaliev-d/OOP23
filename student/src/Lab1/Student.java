package Lab1;
public class Student {
	private String name;
	int age;
	int id;
	int[] grades;
	static int counter;
	Faculty major;
	public Student() {
		id = counter++;
	}
	public Student(String name) {
		this.name = name;
		
	}
	public Student(String name, int age) {
		this( );
		this.name = name;
		this.age = age;
		
	}
	public void setGrades(int[] grades) {
        this.grades = grades;
    }
	public String toString() {
        return "Student Name: " + name;
    }
	public Student (String name, int age, Faculty major) {
		this(name, age);
		this.major = major;
		
	}
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

}
