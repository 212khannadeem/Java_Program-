public class q19 {
    public static void main(String args[]) {
        int a[]={2,3,4,5,6};
        int n=5;
        int sum=0;
        for (int i = 0; i < a.length; i++) {
            for (int j = i+1; j < a.length; j++) {
                sum=a[i]+a[j];
                if (sum==n) {
                    System.out.println(i+" , "+j);
                }
            }
        }
    }
}
