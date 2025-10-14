public class merge {
    public static void main(String[] args) {
        int a[]={1,2,3};
        int b[]={4,5,6};
        int c[] = new int[a.length + b.length];
        int i=0;
        for(int num : a){
            c[i++] = num;
        }
         for(int num : b){
            c[i++] = num;
        }
         for(int num : c){
           System.out.print(num + " ");
        }
    }
}

    

