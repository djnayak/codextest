/* 

A Pythagorean triplet is a set of three natural numbers, a < b < c, for which,
a2 + b2 = c2

For example, 32 + 42 = 9 + 16 = 25 = 52.

There exists exactly one Pythagorean triplet for which a + b + c = 1000.
Find the product abc.
*/ 
class prog_9 {

    public static void main(String[] args) {

        int m = 1, n = 0, a = 0, b = 0, c = 0, sum = 0;
        int product = 0;

		for (m = 2; m < 100; m++) 
		{
		    for (n = 1; n < 100; n++) 
				{

					while (m > n) 
					{

					    a = (m * m) - (n * n);
					    b = (2 * m) * n;
					    c = (m * m) + (n * n);

					    sum = a + b + c;


					    if (sum == 1000) 
						{
						product = a * b * c;

						System.out.print("a : " + a + " b :" + b + " c : " + c);
						System.out.println("Product is" + product);
						break;
					    	}
					    break;
					}
			   	 }
		}
}
}
 
