public class copyArray {
    public static void main(String[] args) {
        int[] a = {10,20,50};
        int[] b = new int[a.length];
        for(int i =0;i<a.length; i++){
            b[i] =a[i];
        }
        for(int num : b){
            System.out.println( "B:"+num );
        }
       
    }
    
}
