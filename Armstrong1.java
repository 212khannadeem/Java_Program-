class Armstrong1 
{
	public static void main(String[] args) 
	{
		int num,temp,rem,sum,count=0;
		System.out.println("Armstrong num b/w 1 to 1000");
		for(num =1;num<=1000;num++)
		{
			temp=num;
			sum=0;
			while(temp>0)
			{
				rem = temp%10;
				sum = sum+ (rem*rem*rem);
				temp=temp/10;
			}
			if(sum==num)
			{
				System.out.println(num+" ");
				count++;
			}
		}	
		System.out.println("total armstrong num "+count);
	}
}
