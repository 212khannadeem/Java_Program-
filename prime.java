import java.util.Scanner;
class prime
{
	public static void main(String args[])
	{
		int n,f=0;//f=check variable
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a num");
		n=s.nextInt();
		for(int i=1;i<=n/2;i++)
		{
			if(n%i==0)
			{
				f=1;
				break;
			}
		}
		if(f==0)
		{
		System.out.println("num is not prime");
		}
		else
		{
		System.out.println("num is prime");
		}
	}
}