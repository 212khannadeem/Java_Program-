import java.util.Scanner;

public class largestSubArray {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        int n[]=new int[a];
        for(int i=0;i < n.length ;i++){
            n[i]=sc.nextInt();
        }
        int sum1=0,sum2=0;
        for(int i=1;i < n.length ;i++){
            sum1+=n[i];
        }
        for(int i=0;i < n.length-1 ;i++){
            sum1+=n[i];
        }
        if (sum1>sum2) {
            for(int i=1;i < n.length ;i++){
                System.out.println(n[i]);
            }
        }
        else{
            for(int i=0;i < n.length-1 ;i++){
                System.out.println(n[i]);
            }
        }
    }
}
