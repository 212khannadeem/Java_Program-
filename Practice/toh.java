public class toh {
    public static int count =0;

    public static void towerOfHinoe(int n,String s, String h,String d){

        if(n == 1) {
            System.out.println("transfer disk " + n + " from " + s + " to " + d);
            count++;
            return;
        }
        towerOfHinoe(n-1, s, d, h);
        System.out.println("transfer disk " + n + " from " + s + " to " + d);
        count++;
        towerOfHinoe(n-1, h, s, d);
    }

    public static void main(String args[]) {
        towerOfHinoe(4, "A", "B", "D");
        System.out.println(count);
    }
}
