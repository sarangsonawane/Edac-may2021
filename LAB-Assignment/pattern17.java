class pattern17
{
public static void main(String args[])
{

	int i,j,count=1;
	for(i=1;i<=5;i++)//rows
	{
		for(j=1;j<=i;j++)//columns no of column per row
		{
			System.out.print((count++)+" ");
		}

		System.out.println();
	}

}

}

/*


1
2 3
4 5 6
7 8 9 10
11 12 13 14 15

*/