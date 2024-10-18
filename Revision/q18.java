public class q18 {
    public static void main(String args[]){
        int a[]={1,2,3,4,5,6};
        int n=5;
        int minSum=a[0]+a[1];
        int x=0;
        int y=1;
        for (int i = 0; i < a.length; i++) {
            for (int j = i+1; j < a.length; j++) {
                int temp=a[i]+a[j];
                if (Math.abs(minSum-n)>Math.abs(temp-n)) {
                    minSum=temp;
                    x=i;
                    y=j;
                }
            }
        }  
        System.out.println(x+" , "+y);       
    }
}
