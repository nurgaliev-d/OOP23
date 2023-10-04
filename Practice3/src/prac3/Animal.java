package prac3;

public abstract class Animal {
	
	String name;
	int age;
	boolean isHungry;
	
	void Message() {
		System.out.println("Parent constructor");
	}
	
	public Animal() {
		
	}
	
	public Animal(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public Animal(String name, int age, boolean isHungry){
		this.name = name;
		this.age = age;
		this.isHungry = isHungry;
	}
	
	
	public String toString() {
		return name + " " + age + " " + isHungry; 
	}
	public abstract void Voice();

}
