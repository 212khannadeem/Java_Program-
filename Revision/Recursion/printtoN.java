package Recursion;

public class printtoN {
    public static void recursion(int n) {
        if(n==0)
            return;
        System.out.print(n+" ");
        recursion(n-1);
    }

    public static void main(String args[]){
        int n=5;
        recursion(n);
    }
    
}
