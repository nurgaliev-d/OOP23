import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        String str = x.nextLine(), rvrs = "";
        int len = str.length();
        char ch;
        for(int i=0; i < len ;i++){
            ch = str.charAt(i);
            rvrs= ch + rvrs;
        }
        if (str.equals(rvrs)){
            System.out.println("Yes, this string is Palindrome!");
        }
        else{
            System.out.println("No, this string is not palindrome!");
        }
        System.out.println(str);
        System.out.println(rvrs);
        x.close();
    }
}