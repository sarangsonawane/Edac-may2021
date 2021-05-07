class pyramid12
{

	public static void main(String args[])
	{
		int i,j;
		
		for(i=1;i<=6;i++)//rows
		{
			for(j=1;j<=i;j++)//columns
			{
				System.out.print(" ");
			}
			
			for(j=1;j<=(7-i);j++)//columns
			{
				System.out.print("* ");
			}
			
			System.out.println();
		}
	}

}

/*

 * * * * * *
  * * * * *
   * * * *
    * * *
     * *
      *
	  
*/