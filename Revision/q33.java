public class q33 {
    public static void main(String args[]){
        int a[]={1,2,3,4,5};
        int k=2;
        int n=a.length;
        for (int i = 0; i < n; i++) {
            if(i<k){
                System.out.print(a[n+i-k]+" ");
            }
            else{
                System.out.print(a[i-k]+" ");
            }
        }
    }
}
