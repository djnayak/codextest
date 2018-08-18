/* 

Each new term in the Fibonacci sequence is generated by adding the previous two terms. By starting with 1 and 2, the first 10 terms will be:

1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ...

By considering the terms in the Fibonacci sequence whose values do not exceed four million, find the sum of the even-valued terms.
*/
 class prog_2 
{
	public static void main (String[] args)
	{
		int size=4000000;
		int f0=0,f1=1,temp=0;
		int i,sum=0;
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
