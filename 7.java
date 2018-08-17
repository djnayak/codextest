
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
