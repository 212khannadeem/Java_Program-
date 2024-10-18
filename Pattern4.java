class Pattern4
{
	public static void main(String[] args) 
	{
	int k=1;
	int l=0;
		for (int i=1;i<5;i++)
		{
			for (int j=1;j<=i;j++)
			{
				System.out.print(l);
				l=k%2;
				k++;
			}
			System.out.println(" ");
		}
	}
}
