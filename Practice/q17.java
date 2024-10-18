public class q17 {
    public static void main(String args[]) {
        int a[]={9,8,7,1,2};
        int minSum=a[0]+a[1];
        int x=0;
        int y=1;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                int temp=a[i]+a[j];
                if (i!=j&&Math.abs(minSum)>Math.abs(temp)) {
                    minSum=temp;
                    x=i;
                    y=j;
                }
            }
        }
        System.out.println(x+" , "+y);        
    }
}
