class pattern9
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
			int a=65;
			for(k=1;k<=i;k++)
			{
				System.out.print((char)(a++)+" ");
			}
		
			
			System.out.println();
		
			
		}
		
		
	}

}


/*

    A
   A B
  A B C
 A B C D
A B C D E

*/