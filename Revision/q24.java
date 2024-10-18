public class q24{
    public static void main(String args[]){
        int a[]={1,2,3,4,5};
        int n=3;
        for (int i = 0; i < a.length; i++) {
            if(i==a.length-2){
                break;
            }
            int max=a[i];
            for (int j = i; j < n; j++) {
                if(a[j]>max){
                    max=a[j];
                }
            }
            System.out.print(max+" ");
        }
    }
}