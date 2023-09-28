
public class Student {

	String name;
    int yearOfStudy;
	private static int counter = 0;
	int id;
	
	public Student() {
		id = counter++;
	}
	public Student(String name, int yearOfStudy) {
		this( );
		this.name = name;
		this.yearOfStudy = yearOfStudy;
		
	}
	public String toString() {
		return this.name+" "+", Year of study: "+ yearOfStudy+", ID: " + id;
	}
	public String getName() {
		return this.name;
	}
	public void setName(String newName) {
		this.name = newName;
	}
	public int getID() {
		return id;
	}
	public int getCount() {
		return counter;
	}
}
