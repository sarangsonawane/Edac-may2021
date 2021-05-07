class star13
{

	public static void main(String args[])
	{
		int i,j,k;
		System.out.println();
		for(i=1;i<=5;i++)//rows
		{
			for(j=(i-1);j>=0;j--)//columns
			{
				System.out.print(" ");
			}
			for(k=5;k>=i;k--)
			{
				System.out.print("*");
			}
			
			System.out.println();
		
			
		}
		
		for(i=1;i<=4;i++)//rows
		{
			for(j=4;j>=i;j--)//columns
			{
				System.out.print(" ");
			}
			for(k=1;k<=(i+1);k++)
			{
				System.out.print("*");
			}
			
			
			System.out.println();
		
			
		}
		
		
	}

}


/*

 *****
  ****
   ***
    **
     *
    **
   ***
  ****
 *****
 
*/

