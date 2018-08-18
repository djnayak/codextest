/* 

By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.

What is the 10 001st prime number?
*/
 class prog_7
{
	public static void main (String[] args)
	{
		 
		int k= 1 ;
		int i =3;

		 
		   
		   while(k!=10001)
		   {
		   if(PrimeCheck(i))
		    {
		    k++;
		    
		    }
		   i++;
		   }
		   System.out.println(i-1); 
	}
     public static boolean PrimeCheck(int num )
	{
		boolean flag = true;
	  for(int i = 2 ; i < num ; i ++ )
	  {
	  if(num % i == 0 )
	  {
	  flag = false;
	  break;
	  }
	  
	  }
	  return flag;
  
  
	}
}
