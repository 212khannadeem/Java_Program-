import java.util.Scanner;
class AveMarks
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of student");
		int n= sc.nextInt();
		int marks[] = new int[n];
		System.out.println("Enter Marks");
		for (int i=0;i<n;i++)
		{
			marks[i]=sc.nextInt();
		}
		int ave=0;
		int sum=0;
		for (int i=0;i<n;i++)
		{
			sum+=marks[i];
		}
		ave=sum/n;
		System.out.println("Average Marks ="+ave);
	}
}
