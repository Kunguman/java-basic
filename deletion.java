public class deletion {
    public static void main(String[] args) {
        int[] arr ={10,20,30,40,50};
        int n =arr.length;
        int pos = 3;
        System.out.print("before deletion: ");
        for(int i =0;i<n;i++)
        System.out.print(arr[i] + " ");
        for(int i=pos; i<n-1;){
            arr[i] =arr[i+1];
        }
        n--;
        for(int i =0;i<n;i++){
            System.out.print(arr[i] + " ");
            System.out.println("after deletion: ");
        }


    }
    
}
