public class q14 {
    public static void main(String args[]){
        int a[]={9,7,2,7,4};
        int max=a[0];
        int smax=a[0];
        int tmax=a[0];
        for (int i = 0; i < a.length; i++) {
            if (a[i]>max) {
                tmax=smax;
                smax=max;
                max=a[i];
            }
            else {
                tmax=smax;
                smax=a[i];
            }
        }
        System.out.println(tmax);
        System.out.println(smax);
        System.out.println(max);
    }
}
