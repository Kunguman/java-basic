import java.util.Scanner;
public class automorphic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the input : ");
        int n = sc.nextInt();
        int  a =(int)Math.pow(n, 2);
        System.out.println(a);
        int i=a%100;
        System.out.println(i);
        if(i ==n){
        
            System.out.println(" out");
        }
        
        


    }
}
