public class stringPermu {
    public static void permutation(String s, int idx ,String result){
        if (s.length()==0) {
            System.out.println(result);
            return;
        }

        for (int i = 0; i < s.length(); i++) {
            char curr=s.charAt(i);
            String newStr=s.substring(0, i)+s.substring(i+1);
            permutation(newStr, idx+1, result+curr);
        }
    }


   public static void main(String[] args) {
       String s="ABC";
       permutation(s, 0, "");
   } 
}
