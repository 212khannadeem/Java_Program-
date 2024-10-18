public class q20 {
    public static void main(String args[]){
        int a[]={1,0,1,0,1,1,0,0};
        for (int i = 0; i < a.length; i++) {
            if (a[i]==0) {
                System.out.print(a[i]);
            }
        }
        for (int i = 0; i < a.length; i++) {
            if (a[i]==1) {
                System.out.print(a[i]);
            }
        }
    }
}
