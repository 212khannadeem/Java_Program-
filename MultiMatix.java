import java.util.Scanner;
class MultiMatix
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the num of Rows");
		int rows=sc.nextInt();
		System.out.println("Enter the num of Coloum");
		int cols=sc.nextInt();
		int a[][]=new int[rows][cols];
		int b[][]=new int[rows][cols];
		int c[][]=new int[rows][cols];
		System.out.println("Enter first matrix");
		for (int i=0;i<rows ;i++ )
		{
			for (int j=0;j<cols ;j++ )
			{
				a[i][j]=sc.nextInt();
			}
		}
		System.out.println("Enter Second Matrix");
		for (int i=0;i<rows ;i++ )
		{
			for (int j=0;j<cols ;j++ )
			{
			b[i][j]=sc.nextInt();
			}
		}
		for (int i=0;i<rows ;i++ )
		{
			for (int j=0;j<cols ;j++ )
			{
			c[i][j]+=a[i][i]*b[j][j];
			}
		}
		System.out.println("Result Matrix");
		for (int i=0;i<rows ;i++ )
		{
			for (int j=0;j<cols ;j++ )
			{
				System.out.print(c[i][j]+" ");
			}
		System.out.println();
		}
	}
}