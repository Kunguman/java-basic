import java.util.*;
public class Alaphabeticalorder {
       public static void main(String[] args){
        private int x ;
    String str;
    public Alaphabeticalorder() {
        x = 0;
    }
    public void readInput()
    {
        Scanner in = new Scanner(System.in);
        System.out.println("enter string");
        str = in.nextLine();
    }
    public void arrangeString()
    {
        Scanner in =new Scanner (System.in);
        System.out.println("enter string ");
        str = in.nextLine();
        char ch;
        for(int i = 65;i<=90;i++){
            for(int j =0;j<str.length();j++){
                ch = str.charAt(j);
                if(ch == (char)i || ch == (char)(i+32)){
                    System.out.println(ch);
                }
            }
        }
    
    }   
    
}
