import java.io.*;
class  io
{
	public static void main(String[] args) 
	{
		Reader br = new Reader(new InputStream(System.in));
		System.out.println("Enter two number");
		int a=br.readInt();
		int b=br.readInt();
		if (a<b)
		{
			System.out.println(a+"is small");
		}
		else 
		{
			System.out.println(b+"is small");
		}
	}
}
