import java.util.Scanner;
 class prog_3 
{
	public static void main (String[] args)
	{
		int num;
		Scanner reader = new Scanner (System.in);
		num = reader.nextInt();
		int i,j,max=0,c=0;
		for(i=2;i<(num/2)+1;i++)
		{
			 if(num%i==0)
			{
				for(j=2;j<i;j++)
				{
					if ( i%j == 0)
					{
					   c++;	
					}
				}
			if (c==0)
			{
				max=i;
			}
			 }
		}
		System.out.println("Largest Prime Factor = "+max);
	}
}
