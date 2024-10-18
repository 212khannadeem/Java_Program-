import java.util.*;
class _91decodeway {

    public static void main(String[] args) {
        System.out.println("Demo");
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        System.out.println(numDecodings(s));
    }
    public static int numDecodings(String s) {
        // int n=Integer.parseInt(s);
        int result=s.length();
        for(int i=0;i<s.length();i++){
            if(Character.getNumericValue(s.charAt(i))==0){
                result--;
            }
        }
        return result;
    }
}