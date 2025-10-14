import java.util.Scanner;
public class array {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the input : ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0; i<n;i++){
            arr[i] = sc.nextInt();
        }
        for(int i=0;i<n;i++){
            if(arr[i] %2==0){
                System.out.println(arr[i] + "The given num is even ");
            }
            else{
                System.out.println(arr[i] + "The given num is odd");
            }
        }
    }
    
}
