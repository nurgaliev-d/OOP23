package prac3;

public class Capybara extends Animal {

	void Message() {
		System.out.println("Child class constructor");
	}
	void Display() {
		Message();
		super.Message();
	}
	
	public Capybara() {
		
	}
	
	//Overloading
	public Capybara(String name, int age) {
		super(name, age);
	}
    //Overloading
	public Capybara(String name, int age, boolean isHungry) {
		super(name, age, isHungry);
	}
	
	
	//Overriding
	public String toString() {
		return super.toString();
	}
	//OVerriding
	public void Voice() {
		System.out.println("Hrhrhrhrhrhrhrhr");
	} 
	
	
}
