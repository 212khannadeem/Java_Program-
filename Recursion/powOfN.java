public class powOfN {
    public static int pow(int x,int n){
        if (n==0) {
            return 1;
        }
        if (x==0) {
            return 1;
        }
        int xn=x*pow(x, n-1);;
        return xn;
    }

    public static int pow1(int x,int n){
        if (n==0) {
            return 1;
        }
        if (n%2==0) {
            return pow1(x,n/2)*pow(x, n/2);
        } else {
            return pow1(x,n/2)*pow(x, n/2)*x;
        }
    }

    public static void main(String args[]) {
        System.out.println(pow(2, 5));
        System.out.println(pow1(2, 5));
    }
}
