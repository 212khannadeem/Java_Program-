import java.util.Scanner;
class seriesSum
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		int n,f;
		double sum=0.0;
		System.out.println("Enter a Number of term");
		n=s.nextInt();
		for(int i=1;i<=n;i++)
		{
			f=1;
			for(int j=1;j<=i;j++)
			{
				f*=j;
			}
			sum+=1.0/f;
		}
		System.out.println("sum="+sum);	
	}
}