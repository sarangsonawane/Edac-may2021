class star15
{

	public static void main(String args[])
	{
		int i,j;
		System.out.println();
		for(i=1;i<=5;i++)//rows
		{
			for(j=1;j<=i;j++)//columns
			{
				if(i==3 && j==2 || (i==4 &&(j == 2 || j==3)))
				{
					System.out.print(" ");
				}
				else
				System.out.print("*");
			}
			System.out.println();
		 
			
		}
		
	
		
		
	}

}
/*

*
**
* *
*  *
*****


*/