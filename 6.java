/* 

The sum of the squares of the first ten natural numbers is,
12 + 22 + ... + 102 = 385

The square of the sum of the first ten natural numbers is,
(1 + 2 + ... + 10)2 = 552 = 3025

Hence the difference between the sum of the squares of the first ten natural numbers and the square of the sum is 3025 − 385 = 2640.

Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum.
*/
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
