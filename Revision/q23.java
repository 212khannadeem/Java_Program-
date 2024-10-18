public class q23 {
    public static void main(String args[]){
        int arr[]={4,2,13,4,2,1};
        int prev=0;
        int curr=1;
        int next=2;

        for (int i = 0; i < arr.length; i++) {
            if(next==arr.length){
                break;
            }
            if(arr[curr]<arr[prev]&&arr[curr]<arr[next]){

                System.out.println(arr[curr]);
                System.out.println(arr[curr]);
            }
            prev++;
            curr++;
            next++;
        }
    }
}
