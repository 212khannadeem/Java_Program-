public class q40 {
    public static void main(String args[]){
        int a[]={1,2,3,4,5,6};
                for(int i=0;i<a.length;i++){
                    for (int j = i; j<a.length; j++) {
                        System.out.print(a[j]+" ");
                    }
                    System.out.println();
                }
                for(int i=0;i<a.length;i++){
                    for (int j = 0; j<i; j++) {
                        System.out.print(a[j]+" ");
                    }
                    System.out.println();
                }
    }
}
