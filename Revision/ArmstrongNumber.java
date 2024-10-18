import java.util.*;
public class ArmstrongNumber{
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        int x=sc.nextInt();
        int temp=x;
        int rem ,sum=0;
        while(temp>0){
            rem=temp%10;
            sum += rem*rem*rem;
            temp/=10;
        }
        if(sum==x){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
}