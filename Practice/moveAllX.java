public class moveAllX {

    public static void moveX(String s, int i,int count, String newS){
        
        if (i==s.length()) {
            for (int j=0; j <count; j++) {
                newS+='x';
            }
            System.out.println(newS);
            return;
        }

        char curr=s.charAt(i);
        if (curr=='x') {
            count++;
            moveX(s, i+1,count, newS);
        }
        else{
            newS+=curr;
            moveX(s, i+1,count, newS);
        }
    }
    public static void main(String[] args) {
        moveX("axbxxedcx", 0,0, "");
    }
}
