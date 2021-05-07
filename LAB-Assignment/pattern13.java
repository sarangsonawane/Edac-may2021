class pattern13
{

	public static void main(String args[])
	{
		int i,j,k, a=65;
		System.out.println();
		for(i=1;i<=5;i++)//rows
		{
			for(j=5;j>i;j--)//columns
			{
				System.out.print(" ");
			}
			
			for(k=1;k<=i;k++)
			{
				System.out.print((char)(a)+" ");
			}
			a++;
			
			System.out.println();
		
			
		}
		
		
	}

}