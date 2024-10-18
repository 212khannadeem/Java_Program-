import java.util.Arrays;

public class q2 {
    public static void main(String args[]){
        String str1="abcd";
        String str2="bacd";
        int n1=str1.length();
        int n2=str2.length();
        if(n1!=n2){
            System.out.println("Not Anagram");
        }
        else{
            char[] s1=str1.toCharArray();
            char[] s2=str2.toCharArray();
            Arrays.sort(s1);
            Arrays.sort(s2);
            if(Arrays.equals(s1, s2)==true){
                System.out.println("Anagram");
            }
            else{
                System.out.println("Not Anagram");
            }
        }
    }
}
