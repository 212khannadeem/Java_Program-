public class q22 {
    public static void sortArray(int arr[],int n){
        int j=0;
        int arr1[]=new int[n];
        for (int i = 0; i < n; i++) {
            if (arr[i]==0) {
                arr1[j]=arr[i];
                j++;
            }
        }
        for (int i = 0; i < n; i++) {
            if (arr[i]==1) {
                arr1[j]=arr[i];
                j++;
            }
        }
        for (int i = 0; i < n; i++) {
            if (arr[i]==2) {
                arr1[j]=arr[i];
                j++;
            }
        }
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i]+" ");
        }
    }
    public static void main(String args[]){
        int a[]={2,1,0,1,0,1,2,1,2};
        int n=a.length;
        sortArray(a, n);
    }    
}
