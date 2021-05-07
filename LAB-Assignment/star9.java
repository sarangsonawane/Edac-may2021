class star9
{

	public static void main(String args[])
	{
		int i,j;
		
		for(i=1;i<=5;i++)//rows
		{
			for(j=(5-i);j>=1;j--)//columns
			{
				System.out.print(" ");
			}
			
			for(j=1;j<=i;j++)//columns
			{
				System.out.print("*");
			}
			
			System.out.println();
		}
		
		 
		for(i=1;i<=4;i++)//rows
		{
			for(j=1;j<(i+1);j++)
			{
				System.out.print(" ");
			}
			
			for(j=1;j<=(5-i);j++)//columns
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
 ****
  ***
   **
    *
	
	
*/