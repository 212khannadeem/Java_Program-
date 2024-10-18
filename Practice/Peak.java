import java.util.*;

public class Peak {
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        System.out.println("Array");
        for(int i=0;i<n;i++){
            System.out.print(a[i]+" ");
        }
        //int p=0;
        
        int max =a[0];
        int min=a[0];
        for(int i=0;i<n;i++){
            if(a[i]>max){
                
                max=a[i];
         //       p=i;
                if(max>a[i+1]){
                    System.out.println(i);
                }
            }
            if(a[i]<min){
                min=a[i];
            }
            
        }
       // System.out.println("Peak Element = "+max +" Index of Peak Element = "+ p);
        System.out.println("Max = "+ max);
        System.out.println("Min = "+ min);

        System.out.println("Reverse Array");
        for(int i=0;i<n;i++){
            System.out.print(a[n-i-1]+" ");
        }

    }    
    
}
