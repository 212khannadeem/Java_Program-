import java.util.Arrays;

public class prime {

    public static void main(String args[]){
        boolean isprime[]=sOE(21);
        for (int i = 0; i < isprime.length; i++) {
            if (isprime[i]){
                System.out.print(i+" ");
            }
        }
    }
    
    static boolean[] sOE(int n){
        boolean[] isprime =new boolean[n+1];
        Arrays.fill(isprime, true);
        isprime[0]=false;
        isprime[1]=true;
        for (int i = 2; i*i < n; i++) {
            for (int j = 2*i; j <=n; j+=i) {
                isprime[j]=false;
            }
        }
        return isprime;
    }
}
