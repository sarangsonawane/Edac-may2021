class pyramid2
{

	public static void main(String args[])
	{
		int i,j,k;
		System.out.println();
		for(i=1;i<=9;i++)//rows
		{
			for(j=9;j>i;j--)//columns
			{
				System.out.print(" ");
			}
			for(k=1;k<=i;k++)	
			{
				System.out.print(k+" ");
			}
			
			
			System.out.println();
		
			
		}
		
		
	}

}
/*


        1
       1 2
      1 2 3
     1 2 3 4
    1 2 3 4 5
   1 2 3 4 5 6
  1 2 3 4 5 6 7
 1 2 3 4 5 6 7 8
1 2 3 4 5 6 7 8 9


*/