import java.util.Scanner;
class MiddleNumber  
{
	public static void main(String[] args) 
	{
		int a, b, c, mid;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter three number");
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		if(a>b)
		{
			if (a<c)
			{
				mid=a;
				System.out.println(mid);
			}
			else 
			{
				mid=c;
				System.out.println(mid);
			}
		}
		else
		{
			if (b<c)
			{
				mid=b;
				System.out.println(mid);
			}
			else 
			{
				mid=c;
				System.out.println(mid);
			}
		}
	}
}
