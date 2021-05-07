class pyramid10
{
public static void main(String args[])
{

	int i,j;
	for(i=1;i<=6;i++)//rows
	{
		for(j=1;j<=7-i;j++)//columns no of column per row
		{
			if(i==2 && (j==2 || j==3 || j==4))
			{
				System.out.print("  ");
			}
			else if(i==3 && (j==2 || j==3))
			{
				System.out.print("  ");
			}
			else if(i==4 && j==2)
			{
				System.out.print("  ");
			}
			else
				System.out.print("* ");
		}
		System.out.println();
	}

}

}
/*
* * * * * *
*       *
*     *
*   *
* *
*

*/