public class q80 {
    public static void divide(int a[],int si,int ei){
        if (si>=ei) {
            return;
        }
        int mid =si + (ei-si)/2;
        divide(a, si, mid);
        divide(a, mid+1, ei);
        conquer(a, si, mid, ei);
    }
    public static void conquer(int a[],int si,int mid,int ei){
        int merged[]=new int[ei-si+1];
        int i1=si;
        int i2=mid+1;
        int x=0;
        while (i1<=mid && i2<=ei) {// 1,3,5   2,4,5    
            if (a[i1]<=a[i2]) {
                merged[x++]=a[i1++];
            } else {
                merged[x++]=a[i2++];
            }                       // 1,2,3,4,5
        }
        while (i1<=mid) {
            merged[x++]=a[i1++];
        }
        while (i2<=ei) {
            merged[x++]=a[i2++];
        }
        for (int i = 0,j=si; i < merged.length; i++,j++) {
            a[j]=merged[i];
        }
    }
    public static void main(String args[]){
        int a[]={2,1,5,4,3,6};
        int si=0;
        int ei=a.length-1;
        divide(a, si, ei);
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+" ");
        }
    }
}
