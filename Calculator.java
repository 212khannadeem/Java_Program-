import java.util.Scanner;
class Calculator
{
	public static void main(String args[])
	{
		float result=0;
		int ch;
		Scanner s=new Scanner(System.in);
		do
		{
			System.out.println("Enter first number");
			float a=s.nextFloat();
			System.out.println("Enter second number");
			float b=s.nextFloat();
			System.out.println("Press 1 for Addition");
			System.out.println("Press 2 for Substraction");
			System.out.println("Press 3 for Multiplication");
			System.out.println("Press 4 for Divide");
			int n=s.nextInt();
			switch(n)
			{
				case 1: 
				result=a+b;
				System.out.println("Final Result "+result);
				break;
				case 2: 
				result=a-b;
				System.out.println("Final Result "+result);
				break;
				case 3: 
				result=a*b;
				System.out.println("Final Result "+result);
				break;
				case 4: 
				result=a/b;
				System.out.println("Final Result "+result);
				break;
			}
			System.out.println("Do you want continue Press 1 otherwise Press 0");
			ch=s.nextInt();
		}while(ch==1);
	}
}