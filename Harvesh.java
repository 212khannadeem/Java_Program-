import java.util.Scanner;
class Harvesh 
{
	public static void printp(int r,int c,int n){
		if (n>0)
		{
			System.out.print(n++);
			printp(r,c,n-1);
		}
		else if (n==1)
		{
			System.out.print(n);
			System.out.println("");
			if (c<r)
			{
				printp(r,c+1,+1);
			}
		}
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the num of lines");
		Harvesh h = new Harvesh();
		h.printp(3,1,1);
	}
}
