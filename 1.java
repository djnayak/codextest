
 class prog_1 
{
	public static void main (String[] args)
	{
		int size=1000;
		int i;
		for(i=0;i<size;i++)
		{
			if ((i % 3 == 0) || (i%5 == 0))
			   System.out.println(i);
		}
	}
}
