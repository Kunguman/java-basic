import java.util.Scanner;

public class Main {
    public static void main (String args[])
    {
     Scanner sc = new Scanner(System.in);

     System.out.print("Enter the input: ");
     int n = sc.nextInt();
        System.out.println("Number is "+ ((n & 1 ) == 0 ? "even": "odd"));
    
    
    } 
}