class pyramid7
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
				System.out.print((10-i)+" ");
			}
			f--;
			System.out.println();
		}
	}

}

/*

9 9 9 9 9 9 9 9 9
 8 8 8 8 8 8 8 8
  7 7 7 7 7 7 7
   6 6 6 6 6 6
    5 5 5 5 5
     4 4 4 4
      3 3 3
       2 2
        1
		
		
*/