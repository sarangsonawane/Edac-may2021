class pyramid6
{

	public static void main(String args[])
	{
		int i,j;
		int f=10;
		for(i=1;i<=9;i++)//rows
		{
			for(j=0;j<(i-1);j++)//columns for(j=1;j<=(i+1);j++)
			{
				System.out.print(" ");
			}
			
			for(j=1;j<=(10-i);j++)//columns
			{
				System.out.print("* ");
			}
			f--;
			System.out.println();
		}
	}

}
/*

* * * * * * * * *
 * * * * * * * *
  * * * * * * *
   * * * * * *
    * * * * *
     * * * *
      * * *
       * *
        *




*/