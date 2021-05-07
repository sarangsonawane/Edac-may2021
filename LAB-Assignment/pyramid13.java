class pyramid13
{

	public static void main(String args[])
	{
		int i,j;
		int f=0;
		for(i=1;i<=6;i++)//rows
		{
			for(j=1;j<=(6-i);j++)//columns
			{
				System.out.print(" ");
			}
			
			for(j=1;j<=i;j++)//columns
			{
				if(i==3 && j==2)
				{
					System.out.print("  ");
				}
				else if(i==4 && (j==2 || j==3))
				{
					System.out.print("  ");
				}
				else if(i==5 && (j==2 || j==3 || j==4))
				{
					System.out.print("  ");
				}
				else
				 System.out.print("* ");
			}
			f++;
			System.out.println();
		}
	}

}
/*

     *
    * *
   *   *
  *     *
 *       *
* * * * * *

*/