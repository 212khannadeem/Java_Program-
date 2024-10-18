public class GCD {
    public static int gcd(int a, int b){
        if(b==0) return a;
        return gcd(b, a%b);
    }
    public static int gcd1(int a,int b){
        int gcd=1;
        for (int i = 1; i <a&&i<b; i++) {
            if (a%i==0&&b%i==0) {
                gcd=i;
            }
        }
        return gcd;

    }
    public static int gcd3(int a,int b){   //Ecludian 
        while(a!=b){ 
            if(a>b) a=a-b;
            else b=b-a;
        }
        return b;
    }
    public static void main(String args[]) {
        System.out.println(gcd(24, 60));
        System.out.println(gcd1(24, 60));
        System.out.println(gcd3(24, 60));
    }
}
