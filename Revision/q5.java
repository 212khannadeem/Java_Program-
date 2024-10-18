//Question 5 : How to find duplicate characters in String in java?
import java.util.Scanner;

public class q5 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        boolean flag=true;
        String str =sc.next();
        System.out.println("Duplicate Character");
        for (int i = 0; i < str.length(); i++){
            for (int j = i+1; j < str.length(); j++) {
                if(str.charAt(i)==str.charAt(j)){
                    System.out.println(str.charAt(i));
                    flag=false;
                }
            }
        }
        if(flag){
            System.out.println("There is NO DUPLICATE");
        }
    }
}
