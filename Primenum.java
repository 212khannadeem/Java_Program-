import java.util.Scanner;
class Primenum
{
	public static void main(String[] args) 
	{
		int f=0,m;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Num");
		int num=sc.nextInt();
		m=num/2;
		for(int i=2;i<m;i++)
		{
			if(num%i==0)
				{
					f=1;
					break;
				}
		}
		if(f==0)
			System.out.println("num is prime");
		else
			System.out.println("num is not prime");
	}
}
