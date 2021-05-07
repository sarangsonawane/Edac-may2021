class pyramid4
{

	public static void main(String args[])
	{
		int i,j;
		int f=0;
		for(i=1;i<=9;i++)//rows
		{
			for(j=(9-i);j>=1;j--)//columns
			{
				System.out.print("  ");
			}
			int count =0;
			for(j=1;j<=i;j++)//columns
			{	
				System.out.print(j+" ");
			}
			
			for(j=(i-1);j>=1;j--)
			{
				System.out.print(j+" ");
			}
			f++;
			System.out.println();
		}
	}

}

/*

                1
              1 2 1
            1 2 3 2 1
          1 2 3 4 3 2 1
        1 2 3 4 5 4 3 2 1
      1 2 3 4 5 6 5 4 3 2 1
    1 2 3 4 5 6 7 6 5 4 3 2 1
  1 2 3 4 5 6 7 8 7 6 5 4 3 2 1
1 2 3 4 5 6 7 8 9 8 7 6 5 4 3 2 1

*/