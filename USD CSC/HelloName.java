import java.util.Scanner;

public class HelloName {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);        // set a scanner to scan user input
        System.out.println("Please Enter your name:");
        String name = sc.nextLine();                //use a variable to hold the value
        System.out.println("Hello "+name+"!");      //return final statement
        sc.close();                                 //this statement is not need, but will not affect result
    }
}
