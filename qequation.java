import java.util.*;
import java.lang.Math;

class qequation {

    public static void main(String[] args) {
   
        Scanner s= new Scanner(System.in);
        int degree;
        double sum=0;
        int cof[]=new int[20];
        System.out.print("Enter the highest degree of your equation : ");
        degree=s.nextInt();
        for(int i=0;i<=degree;i++)
        {
            System.out.print("Enter the coefficient of "+i+" degree of x : ");
            cof[i]=s.nextInt();
        }
        System.out.print("Enter the Value of x : ");
        int x=s.nextInt();
        for(int i=0;i<=degree;i++)
        {
            sum=sum+(double)(cof[i]*Math.pow(x,i));
        }
        System.out.print("The given equation is ");
        for(int i=degree;i>=0;i--)
        {
            if (i==0){
                System.out.print(cof[i]+" = 0");
                continue;
            }
            if(cof[i]==0){
                continue;
            }
            System.out.print(cof[i]+"x^"+i+" + ");
        }
        System.out.println(" and the value of the equation is "+sum);
    }
}
