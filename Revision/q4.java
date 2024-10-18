public class q4 {
    public static void main(String args[]) {
        String str1="abcd";
        String str2="bcda";
        String newstr=str1 + str1;  
        if(newstr.contains(str2)){
            System.out.println("ROTATION");
        }     
        else{
            System.out.println("NOT ROTATION");
        }
    }
}