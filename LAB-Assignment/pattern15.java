class pattern15
{
public static void main(String args[])
{

	int i,j;
	for(i=0;i<5;i++)//rows
	{
		for(j=5;j>i;j--)//columns no of column per row
		{
			System.out.print(j+" ");
		}
		System.out.println();
	}

}

}

/*

5 4 3 2 1
5 4 3 2
5 4 3
5 4
5
*/