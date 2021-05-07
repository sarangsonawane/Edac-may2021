class pattern7
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

*/