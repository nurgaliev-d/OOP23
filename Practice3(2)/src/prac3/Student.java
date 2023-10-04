package prac3;

public class Student extends Person{
	String program;
	int year;
	double fee;
	
	
	public Student(String name, String address, String program, int year, double fee) {
		super(name, address);
		this.program = program;
		this.year = year;
		this.fee = fee;
	}
	
	public Student() {
		
	}
	
	public String getProgram() {
		return this.program;
	}
	public void setProgram(String program) {
		this.program = program;
	}
	public int getYear() {
		return this.year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public double getFee() {
		return this.fee;
	}
	public void setFee(double fee) {
		this.fee = fee;
	}
	public String toString() {
		return super.toString() +"Program: "+this.program + " Year: " + this.year +" Fee: " + this.fee; 
	}
}
