import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the celsius : ");
        double celsius = sc.nextDouble();

        double fahrenheit = (celsius  * 9/5 )+32;
        System.out.println("celsius to fahrenheit: "+ fahrenheit + " F ");

        System.out.print("Enter the fahrenheit : ");
         fahrenheit  = sc.nextDouble();

        celsius = (fahrenheit -32) * 5/9;
        System.out.print("fahrenheit to celsius : " + celsius +" C ");
        

    }
}
