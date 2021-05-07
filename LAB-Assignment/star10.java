class star10
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
			
			for(j=1;j<=5;j++)//columns
			{
				System.out.print("*");
			}
			
			System.out.println();
	}
	
}
}

/*

    *****
   *****
  *****
 *****
*****

*/