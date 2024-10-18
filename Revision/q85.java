public class q85 {
    public static void binarySearch(int a[],int f,int l,int m){
        if (l>=f) {
            
        
            int mid=f + (l - f) / 2;
            if (m==a[mid]) {
                System.out.println(mid);
            }
            if(m<a[mid]) {
                binarySearch(a, f, mid-1, m);
            }
            if(m>a[mid]){
                binarySearch(a, mid+1, l, m);
            }
        }
    }
    public static void main(String args[]){
        int a[]={1,2,3,4,5,6};
        int x=4;
        int f=0;
        int l=a.length-1;
        binarySearch(a, f, l, x);
    }
}
