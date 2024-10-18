public class strictlyIncresing {
    public static boolean increse(int a[], int i){
        if (i==a.length-1) {
            return true;
        }
        if (!increse(a, i+1)) {
            return false;
        }
        return a[i]<a[i+1];

    }

    public static void main(String[] args) {
        int a[]={1,8,3,4,5,6};
        System.out.println(increse(a, 0));    
    }
}
