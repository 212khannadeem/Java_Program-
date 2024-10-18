class FindValue 
{
	public static void main(String[] args) 
	{
		int[] array= {13,3,5,67,83,12,46,89};
		int n=array.length;
		int searchVal= 12;
		int i=0;
		int j=0;
		boolean found = false;
		for(;i<n;i++)
		{
			if (array[i]==searchVal)
			{
				found = true;
				j=i;
			}
		}
		if (found==true)
		{
				System.out.println(" found "+ searchVal +" at index "+j);
		}
		else 
		{
				System.out.println(searchVal+" not found");
		}
	}
}
