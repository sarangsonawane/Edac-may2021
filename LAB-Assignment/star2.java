class star2
{

	public static void main(String args[])
	{
		int i,j,k;
		System.out.println();
		for(i=1;i<=5;i++)//rows
		{
			for(j=5;j>i;j--)//columns
			{
				System.out.print(" ");
			}
			for(k=1;k<=i;k++)
			{
				System.out.print("*");
			}
			
			
			System.out.println();
		
			
		}
	
	}

}
/*

    *
   **
  ***
 ****
*****

*/