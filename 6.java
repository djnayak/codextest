import java.util.Scanner;
 class prog_6 
{
	public static void main (String[] args)
	{
		int n,sum_of_square=0,sum=0;
		Scanner reader = new Scanner (System.in);
		n = reader.nextInt();
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
