import java.util.Scanner;
class TableMulti 
{
	public static void main(String[] args) 
	{
		System.out.println("Enter the number");
		Scanner sc = new Scanner(System.in);
		int n =sc.nextInt();
		System.out.println("Multiplication Table of "+n);
		for (int i=1;i<=n;i++)
		{
			for (int j=1;j<=10;j++)
			{
				System.out.println(i*j);
				System.out.print();
			}
			System.out.println();
		}	
	}
}
