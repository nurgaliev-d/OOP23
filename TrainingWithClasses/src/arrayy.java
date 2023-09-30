// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.Scanner;

class arrayy {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int arr[][] = new int[4][4];
        for(int i=0; i< 4; i++){
            for(int j = 0; j <4; j++){
                arr[i][j] = in.nextInt();
            }
        }
         for(int i=0; i< 4; i++){
            for(int j = 0; j <4; j++){
                System.out.print(arr[i][j] + " ");
            }
             System.out.println();
        }
    }
}