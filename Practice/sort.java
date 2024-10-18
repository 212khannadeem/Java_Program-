import java.util.*;
public class sort {
	public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of the array");
        int n=sc.nextInt();
        int array[]= new int[n];
        for(int i=0;i<n;i++) {
            System.out.println("enter the element in the given array");
            array[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++) {
            for(int j=i+1;j<n;j++){
                if(array[i]>array[j]) {
                    int temp=array[i];
                    array[i]=array[j];
                    array[j]=temp;
                }
            }    

        }
        int k=sc.nextInt();   // kth largrest  
        System.out.println(array[n-k]);  
        int k2=sc.nextInt();  // kth smallest
        System.out.println(array[k2-1]);
        for(int i=0;i<n;i++) {
            System.out.print(array[i]+" ");
        }
	}
}