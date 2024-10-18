import java.util.Scanner;
class Pattern11 
{
	public static void main(String[] args) 
	{
		Scanner sc =new Scanner(System.in);
		int n=sc.nextInt();
		String s ="";
		for (int i=1;i<=n;i++)
		{
			n+=(int)s+"";
			System.out.println(n+" ");
		}
	}
}
