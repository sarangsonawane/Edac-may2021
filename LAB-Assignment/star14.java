class star14
{

	public static void main(String args[])
	{
		int i,j;
		int f=10;
		for(i=1;i<=5;i++)//rows
		{
			for(j=0;j<(i-1);j++)//columns for(j=1;j<=(i+1);j++)
			{
				System.out.print(" ");
			}
			
			for(j=0;j<(f-i);j++)//columns
			{
				System.out.print("*");
			}
			f--;
			System.out.println();
		}
		
		f=1;
		for(i=1;i<=4;i++)//rows
		{
			for(j=(5-i);j>1;j--)//columns
			{
				System.out.print(" ");
			}
			
			for(j=1;j<=(i+f+1);j++)//columns
			{
				System.out.print("*");
			}
			f++;
			System.out.println();
		}
	}

}

/*


*********
 *******
  *****
   ***
    *
   ***
  *****
 *******
*********


*/