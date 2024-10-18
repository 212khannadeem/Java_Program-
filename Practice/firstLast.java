public class firstLast {
    public static int first=-1;
    public static int last=-1;
    public static void occ(String s,char c, int i){
        if (i==s.length()) {
            return;
        }
        if(s.charAt(i)==c){
            if(first==-1){
                first=i;
                last=i;
            }
            else{
                last =i;
            }
        }
        occ(s, c, i+1);
    }     
    
    public static void main(String args[]) {
        occ("nadeemkhan", 'a', 0);
        System.out.println(first);
        System.out.println(last);
    }
}
