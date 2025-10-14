import java.util.Scanner;
 public class Student {
    String Name1;
    int Age1;
    Student(String name, int age){
        Name1 =name;
        Age1 =age;
    }
    void display(){
        System.out.println(Name1 + "is" + Age1 + " years old");
    }
}
public class Student {
    public static void main(String[] args) {
        String name ;
        int age;
        Scanner sc= new Scanner(System.in);
        for(int i = 0; i<60; i++){
            name =sc.next();
            age = sc.nextInt();
            Student sc1 [] =new Student (name,age);
        }
        sc1.display();
        
    }

}
