class pyramid5
{

	public static void main(String args[])
	{
		int i,j;
		int count=9;
		int f=0;
		for(i=1;i<=9;i++)//rows
		{
			for(j=(9-i);j>=1;j--)//columns
			{
				System.out.print("  ");
			}
			
			for(j=count;j<=9;j++)//columns
			{	
				System.out.print(j+" ");
				
			}
			count--;
			
			
			for(int k=8;k>(8-f);k--)
			{
				System.out.print(k+" ");
			}
			f++;
			
			
			System.out.println();
		}
	}

}

/*

                9
              8 9 8
            7 8 9 8 7
          6 7 8 9 8 7 6
        5 6 7 8 9 8 7 6 5
      4 5 6 7 8 9 8 7 6 5 4
    3 4 5 6 7 8 9 8 7 6 5 4 3
  2 3 4 5 6 7 8 9 8 7 6 5 4 3 2
1 2 3 4 5 6 7 8 9 8 7 6 5 4 3 2 1


*/