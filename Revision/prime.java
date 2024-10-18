import java.util.Scanner;
public class prime {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        boolean f=true;
        for(int i=2;i<=x/2;i++){
            if(x%i==0){
                f=false;
                break;
            }
        }
        if(f){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
}
