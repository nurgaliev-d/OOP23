import java.util.Scanner;
public class problem2 {
	public static void main(String[] args) {
	Scanner x = new Scanner(System.in);
	int a = x.nextInt();
	int p = a*4;
	int s = a*a;
	double d = a * Math.sqrt(a);
	System.out.println("Input the value of side:");
	System.out.println("The area if the square is: " + s);
	System.out.println("The perimeter if the square is: " + p);
	System.out.println("The diagonal if the square is: " + d);

	x.close();
	
}
  }
