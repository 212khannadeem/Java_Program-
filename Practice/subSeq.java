import java.util.HashSet;

public class subSeq {
    public static void printSubSeq(String s,int i,String res , HashSet<String> set){
        if (i==s.length()) {
            if (set.contains(res)) {
                return;
            }else{
            System.out.println(res);
            set.add(res);
            return;
            }
        }
        //choose 
        printSubSeq(s, i+1, res+s.charAt(i),set);
        //not chose
        printSubSeq(s, i+1, res,set);
    }

    public static void main(String[] args) {
        HashSet<String> set =new HashSet<>();
        printSubSeq("aaa", 0, "" , set);
    }
}
