
 class prog_1 
{
	public static void main (String[] args)
	{
		int size=1000,sum=0;
		int i;
		for(i=0;i<size;i++)
		{
			if ((i % 3 == 0) || (i%5 == 0))
			  sum=sum+i;
		}
		 System.out.println(sum);
	}
}
