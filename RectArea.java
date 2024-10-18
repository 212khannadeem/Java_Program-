class Rectangle
{
	int l,b;
	void getData(int x,int y)
	{
		l=x;
		b=y;
	}
	int rectArea()
	{
		int area = l*b;
		return(area);
	}
}
class RectArea
{
	public static void main(String args[])
	{
		int area1,area2;
		Rectangle rect1=new Rectangle();
		Rectangle rect2= new Rectangle();
		rect1.l=5;
		rect1.b=10;
		area1=rect1.l*rect1.b;
		System.out.println(area1);
	}
}