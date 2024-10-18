package New;
import java.util.*;
public class Palindrome{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str=sc.nextLine();
        String str2="";
        for(int i=0;i<str.length();i++){
            str2+=str.charAt(str.length()-1-i);
        }
        System.out.println(str.equals(str2));
    }
}
