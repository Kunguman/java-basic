import java.util.Scanner;
public class frequenceofeachcharacter {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int allpha = 256;
        int count[] = new int[allpha];
        System.out.println("enter a string : ");
        String str = sc.nextLine();
        for(int i=0; i< str.length();i++){
            count[(int) str.charAt(i)]++;
        }
        for(int i = 0; i< 256;i++){
            if(count[i] != 0)
            System.out.println((char) i + " occured for:"+count[i]);
        }
    }
    
}
