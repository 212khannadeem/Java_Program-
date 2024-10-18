import java.util.Scanner;
class Palindrome
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Number");
		int n = sc.nextInt();
		int temp=n;
		int rem,rev=0;
		while (temp>0)
		{
			rem=temp%10;
			rev = rev*10 +rem;
			temp/=10;
		}
		if (rev==n)
		{
			System.out.println(n+"number is palindrome");
		}
		else 
		{
			System.out.println(n+"number is not a palindrome");
		}
	}
}
