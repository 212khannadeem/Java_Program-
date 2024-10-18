import java.util.Scanner;
class Rectangle
{
		int length;
		int width;
		void getdata(int l,int b)
		{
			length=l;
			width=b;
		}
		int area()
		{
			return(length*width);
		}
}
class RectangleArea
{
	public static void main(String[] args) 
	{
		int a1,a2;
		Scanner sc=new Scanner(System.in);
		Rectangle r1=new Rectangle();
		Rectangle r2=new Rectangle();
		System.out.println("Enter Second Rectangle Parameters");
		r2.length=sc.nextInt();
		r2.width=sc.nextInt();
		a2=(r2.length)*(r2.width);
		int x=sc.nextInt();
		int y=sc.nextInt();
		r1.getdata(x,y);
		a1=r1.area();
		System.out.println(a1);
		System.out.println(a2);
	}
}
