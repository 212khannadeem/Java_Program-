public class q26 {
    public static void main(String args[]){
        int a[]={1,2,3,4,5};
        int n=7;
        int x=0;
        int y=0;
        LEVEL :for (int i = 0; i < a.length; i++) {
            int sum=0;
            for (int j = i; j <a.length; j++) {
                if(sum==n){
                    x=i;
                    y=j;
                    break;
                }
                sum+=a[j];
            }
            
        }
        for (int i = x; i < y; i++) {
            System.out.println(a[i]+" ");
        }
    }
}
