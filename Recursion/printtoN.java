public class printtoN {
    public static void recursion(int n,int i) {
        if(i==n+1)
            return;
        System.out.print(i+" ");
        recursion(n,i+1);
    }

    public static void main(String args[]){
        int n=5;
        recursion(n,1);
    }
    
}