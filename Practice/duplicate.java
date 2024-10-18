public class duplicate {
    public static boolean[] map=new boolean[26];
    public static void delete(String s,int i,String newS){

        if (i==s.length()) {
            System.out.println(newS);
            return;
        }

        char curr=s.charAt(i);
        if (map[curr-'a']){
            delete(s, i+1, newS);
        }
        else{
            newS+=curr;
            map[curr-'a']=true;
            delete(s, i+1, newS);
        }
    }

    public static void main(String[] args) {
        String s="aabbaayaav";
        
        delete(s, 0, "");
    }
}
