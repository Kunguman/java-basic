import java.util.Scanner;
public class pgm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the input: ");
        int n1 = sc.nextInt();
        System.out.println("enter the  1st num: ");
        int n2 =sc.nextInt();
        if(n1>n2)
        {
            System.out.println("larger number " +n1);
        }
             else if (n2<n1){
                System.out.println("small number" + n2);
            }
            else{
                System.out.println("both are equal");

            }
    }

}   

