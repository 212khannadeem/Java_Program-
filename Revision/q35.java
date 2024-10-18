public class q35 {
    public static void main(String args[]){
        int a[]={9, 5, 6, 3, 2};
        int x=0;
        int max=a[0];
        int min=a[0];
        for(int i=0;i<a.length;i++){
            if (a[i]>max) {
                max=a[i];
                x=i;
            }
        }
        for (int i = 0; i < x; i++) {
            if (a[i]<min) {
                min =a[i];
            }
        }
        System.out.println(max-min);
    }
}
