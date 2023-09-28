import java.util.Scanner;
public class Prob4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner x = new Scanner(System.in);
		int num = x.nextInt();
		if (num > 0) {
			System.out.println(Math.sqrt(num));
		}
		else {
			System.out.println("ERROR, The number is negative!");
		}
		x.close();
	}
}
