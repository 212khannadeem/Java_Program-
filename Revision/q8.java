import java.util.Scanner;

public class q8 {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        String str =sc.next();
        int count=0;
        str+='\0';
        int len=0;
        while(str.charAt(len)!='\0')
        {
         len++;
        }
        System.out.println(len);
    }
}
