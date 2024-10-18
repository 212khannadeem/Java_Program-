class NestedLoop
{
	public static void main(String[] args) 
	{
		double fact=1.0, i, result=0.0;
		for(i=1;i<=3;i++) 
		{
			fact= fact *i;
		}
		for(fact = 1;fact<=3;fact++)
		{
			result+=1/fact;
		}
		System.out.println(result);
	}
}