package labWork1;

public class testTemp {

	public static void main(String[] args) {
		Temperature almaty = new Temperature(45, "C");
		System.out.println(almaty);
		Temperature qyzylorda = new Temperature();
		System.out.println(qyzylorda);
		almaty.setBoth(100, "C");
		System.out.println("Temperature in Farenheit: "+ almaty.toF());
		System.out.println("The scale is: "+almaty.getScale());
		
	}

}
