class pattern12
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
				System.out.print(i+" ");
			}
			
			
			System.out.println();
		
			
		}
		
		
	}

}

/*



    1
   2 2
  3 3 3
 4 4 4 4
5 5 5 5 5



*/