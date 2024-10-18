import java.util.Scanner;
class Armstrong 
{
	public static void main(String[] args) 
	{
		int temp,rem,sum=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the num");
		int num=sc.nextInt();
		temp=num;
		while(temp>0)
		{
			rem = temp%10;
			sum = sum+ (rem*rem*rem);
			temp=temp/10;
		}
		if(sum==num)
		{
			System.out.println("num is armstong");
		}	
		else
		{
			System.out.println("num is not armstong");
		}
	}
}
