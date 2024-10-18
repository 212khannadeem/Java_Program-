import java.util.Scanner;
class UnitMatrix
{
	public static void main(String args[])
	{	
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int a[][]= new int[n][n];
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(i==j)
				a[i][j]=1;
				else
				a[i][j]=0;
			}
		}
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				System.out.print(" "+a[i][j]);
			}
			System.out.println(" ");
		}	
	}
}