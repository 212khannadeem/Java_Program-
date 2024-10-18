public class q79 {
    public static void main(String args[]){
        int a[]={2,1,5,4,3,6};
        for (int i = 0; i < a.length; i++) {
            int curr=i;
            for (int j = i+1; j < a.length; j++){
                if(a[j]<a[curr]){
                    curr=j;
                }
            }
            int temp=a[curr];
            a[curr]=a[i];
            a[i]=temp;
        }
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+" ");
        }
    }
}
