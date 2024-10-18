class Primenum1
{
	public static void main(String[] args) 
	{
		int f,m,count=0;
		System.out.println("Prime Num b/w 1 to 100");
		for(int num=1;num<100;num++)
		{
			f=0;
			m=num/2;
			for(int i=2;i<m;i++)
			{
				if(num%i==0)
					{
						f=1;
						break;
					}
			}
			if(f==0)
			{
				System.out.print(num+" ");
				count++;
			}
		}
		System.out.println("total num"+count);
	}
}
