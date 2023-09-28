package Lab1;
public class Student {
	private String name;
	int age;
	int id;
	static int counter;
	Faculty major;
	public Student() {
		id = counter++;
	}
	public Student(String name) {
		this( );
		this.name = name;
		
	}
	public Student(String name, int age) {
		this( );
		this.name = name;
		this.age = age;
		
	}
	public String toString() {
		return this.name+ " " + age;
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
