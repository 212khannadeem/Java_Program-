import java.util.*;

public class Demo1 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n=scn.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print("\t");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*\t");
            }
            System.out.println();
        }

    }
}