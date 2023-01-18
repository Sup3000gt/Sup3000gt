import java.util.Scanner;

public class lab {
    public static void main(String[] args) {
        /*Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your first name");
        //String name = sc.next();
        String firstName = sc.next(); 
        System.out.println("Please enter your last name");
        String lastName = sc.next();
        // String s = sc.next();        // read in next hunk as a String
        // String ln = sc.nextLine();   // read in next line
        // double d = sc.nextDouble();  // read in next Double
        // int number = sc.nextInt(); // read in next integer
        System.out.println("Hello " + lastName +" "+firstName);
        sc.close();*/
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a int for radius");
        int number = sc.nextInt();
        // formula for area is: pi*2r
        double circumference = 3.14*number*2;
        double area = 3.14*(number*number);
        System.out.println("circumference of the circle is "+circumference);
        System.out.println("The area of the circle is " + area);
        sc.close();
    }
    
}
