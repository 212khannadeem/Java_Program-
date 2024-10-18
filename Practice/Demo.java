import java.util.*;

public class Demo{
    public static void main(String argn[]) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        String str=Integer.toString(n);
        char[] a=str.toCharArray();
        for (int i = 0; i < a.length; i++) {
            if (a[i]==0) {
                a[i]=5;
            }
        }
        String str2=a.toString();
        System.out.println(str2);
    }

}