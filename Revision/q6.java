import java.util.Scanner;

public class q6 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String str =sc.next();
        System.out.println("First Non Repeated Number");
        for (int i = 0; i < str.length(); i++){
            boolean flag=true;
            for (int j = 0; j < str.length(); j++) {
                if(i!=j&&str.charAt(i)==str.charAt(j)){
                    flag=false;
                    break;
                }
            }
            if (flag) {
                System.out.println(str.charAt(i));
            }
        }
    }
}
