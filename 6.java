
 class prog_6 
{
	public static void main (String[] args)
	{
		int n=100,sum_of_square=0,sum=0;
		int i;
		for(i=1;i<=n;i++)
		{
			sum_of_square=sum_of_square+(i*i);
			sum=sum+i;
		}
		int diff;
		diff=(sum*sum)-sum_of_square;
		System.out.println("Sum square difference = "+diff);
	}
}
