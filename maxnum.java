import java.util.Scanner;
class  maxnum
{
	public static void main(String[] args) 
	{
		int a[] =new int[10];
		int max;
		Scanner sc = new Scanner(System.in);
		for(int i=1; i<10;i++)
		{
			System.out.println("Enter the num");
			a[i]=sc.nextInt();
		}
		max=a[0];
		for(int j=1;j<10;j++)
		{
			if(max<a[j])
				max = a[j];
		}
		System.out.println(max);
	}
}