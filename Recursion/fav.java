public class fav {
    public static void fabo(int a,int b,int n) {
        if(n==0){
            return;
        }
        System.out.print(a+" ");
        fabo(b, a+b, n-1);
    }

    public static void main(String args[]){
        fabo(0, 1, 5);
    }
}


/*  
f(1)=1 ,f(0)=0
f(2)=f(1)+f(0)   f(2)=1
f(3)=f(2)+f(1)   f(3)=
f(4)=f(3)+f(2);
f(5)=f(4)+f(3);
*/
