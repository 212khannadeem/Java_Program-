import java.util.Scanner;

public class occurance {
    public static void main(String args[]) {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        // int count=0;
        // int o=sc.nextInt();
        for(int i=0;i<n;i++){
            for(int j=0;j<i;j++){
                if(a[i]==a[j]){
                    continue;
                }
            }
            int count=0;
            for(int j=0;j<n;j++){
                if(a[i]==a[j]){
                    count++;
                }
            }
            System.out.println("Occ of "+a[i]+ " element = "+count);
        }
        //System.out.println(count); 
    }
}
