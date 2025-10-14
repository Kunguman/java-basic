public class insertion {
    public static void main(String[] args) {
        int arr[] =new int[10];
        arr[0] =10;arr[1]=20;arr[2] =30; arr[3]=40; arr[4]=50;
        int n = 4;
        int pos = 2;
        int  value =18;
        System.out.print("before insertion : ");
        for(int i=0;i<n;i++){
            System.out.println(arr[i] + " ");
        }
        System.out.print("after insertion : ");
        for(int i=n; i >pos; i--){
            arr[i] = arr[i-1];
        }
        arr[pos]=value;
        n++;
        for(int i =0;i<n;i++){
        System.out.print(arr[i] + " ");
        }
        
    }
    
}
