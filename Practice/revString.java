public class revString {
    public String rev(String s){
        if (s.length()==0) {
            return s;
        }
        char curr=s.charAt(0);
        String next=rev(s.substring(1));
        return next+curr;
    }

    public static void main(String args[]) {
        revString s=new revString();
        System.out.println(s.rev("Nadeem"));
    }
}
