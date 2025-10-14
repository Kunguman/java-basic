import java.util.Scanner;
public class Seperateline {
    
     public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a string : ");
        String str = sc.nextLine();
        str = str.trim();
        int count = 0;
        if(str.isEmpty()){
            System.out.println("No words entered. ");
        }
        else{
            String[] words = str.split("\\s+");
            count = words.length;
            System.out.println("\n words in the sentence:");
            for(String word : words){
                System.out.println(word);
            }
            System.out.println("\n total number of words:" + count);

        }
        sc.close();
     }
}
