import java.util.Scanner;
class SumOfDigits 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the num");
		int n=sc.nextInt();
		int temp = n;
		int rem,sum=0;
		while (temp>0)
		{
			rem=temp%10;
			sum+=rem;
			temp=temp/10;
		}
		System.out.println("Sum ="+sum);
	}
}
