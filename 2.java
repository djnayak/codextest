
 class prog_2 
{
	public static void main (String[] args)
	{
		int size=4000000;
		int f0=0,f1=1,temp=0;
		int i;
		for(i=0;i<size;i++)
		{
		if(f0%2==0)
		 {
			sum = sum + 0;
		 }
			temp=f0;
			f0=f1;
			f1=temp+f1;	
		}
		System.out.println(sum);
	}
}
