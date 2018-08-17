import java.util.Scanner;
 class prog_2 
{
	public static void main (String[] args)
	{
		int size;
		int f0=0,f1=1;
		Scanner reader = new Scanner (System.in);
		size = reader.nextInt();
		int i;
		for(i=0;i<size;i++)
		{
		if(f0%2==0)
		 {
			System.out.println(f0);
		 }
			f0=f1;
			f1=f0+f1;	
		}
	}
}
