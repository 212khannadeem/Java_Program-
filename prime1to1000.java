class prime1to1000
{
	public static void main(String agrs[])
	{
		int f,count=0;
		for(int n=1;n<=1000;n++)
		{
			f=0;
			for(int i=2;i<=n/2;i++)
			{
				if(n%i==0)
				{
				f=1;
				break;
				}
			}
			if(f==0)
			{
				System.out.print(n+" ");
				count++;
			}
		}
		System.out.println(count);
	}
}