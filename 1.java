import java.util.Scanner;
 class prog_1 
{
	public static void main (String[] args)
	{
		int size;
		Scanner reader = new Scanner (System.in);
		size = reader.nextInt();
		int i;
		for(i=0;i<size;i++)
		{
			if ((i % 3 == 0) && (i%5 == 0))
			   System.out.println(i);
		}
	}
}
