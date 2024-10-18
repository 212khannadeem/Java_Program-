import java.util.Scanner;
class smallest
{
	public static void main(String args[])
	{
		Scanner s= new Scanner(System.in);
		System.out.println("Enter Frist Number");
		int a=s.nextInt();
		System.out.println("Enter Second Number");
		int b=s.nextInt();
		System.out.println("Enter Third Number");
		int c=s.nextInt();
		System.out.println("Smallest Number =");
		if(a<b)
		{
			if(a<c)
			System.out.println(a);
			else
			System.out.println(c);
		}
		else
		{
			if(b<c)
			System.out.println(b);
			else
			System.out.println(c);
		}
	}
}