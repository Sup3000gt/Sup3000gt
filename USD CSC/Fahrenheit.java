import java.util.Scanner; // Import the Scanner class
public class Fahrenheit {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);                 //take user input
        System.out.println("Please enter Temperature in Fahrenheit");
        float Tmp = sc.nextInt();                           //set a variable to hold input value
                                                            // Celsius = ((Fahrenheit-32)*5)/9 ---this is the formula for F to C conversion
        float celsius = ((Tmp-32)*5)/9;                     // name a virable celsius to hold final value 
        System.out.println("Temperature after convertion is "+celsius+" celsius degree"); // return the final statement with celsius
        sc.close();                                         //this line is to prevent source leak, is not needed in the code and will not affect result
    }

}