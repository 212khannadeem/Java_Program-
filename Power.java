class Power 
{
	public static void main(String[] args) 
	{
		long p=1;
		double q;
		int n;
		System.out.println("2 to the 1/n      n         2 to the n");
		for (n=0;n<=10;n++)
		{
			if (n==0)
			{
				p=1;
				q=1;
			}
			else 
			{
				p=p*2;
				q=1.0/(double)p;
			}
			System.out.println("       "+q+"       "+n+"       "+p);
		}
	}
}
