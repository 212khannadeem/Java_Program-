import java.util.Scanner;
class Pattern 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The Number Of Term");
		int n=sc.nextInt();
		for (int i=1;i<=n;i++)
		{
			for (int y=1;y<=i;y++)
			{
				System.out.print("* ");
			}
				System.out.println(" ");
		}
	}
}
