package prac3;
import java.util.Vector;

public class Person {
	String name;
	String address;
	static Vector<Person> persons;
	
	static {
		persons = new Vector<Person>();
	}
	{
		persons.add(this);
	}
	
	public Person() {
		
	}
	
	public Person(String name, String address) {
		this.name = name;
		this.address = address;
	}
	public String getName() {
		return this.name;
	}
	public String getAddress() {
		 return this.address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String toString() {
		return "Name: " + this.name + " Address: " + this.address; 
	}
	public Vector<Person> getVector() {
		for (int i = 0; i < persons.size(); i++) {
			Person elem = persons.get(i);
			System.out.println(elem);
		}
		return null;
	}
}
