class pattern14
{
public static void main(String args[])
{

	int i,j;
	for(i=0;i<5;i++)//rows
	{
		for(j=1;j<=5-i;j++)//columns no of column per row
		{
			System.out.print(j+" ");
		}
		System.out.println();
	}

}

}

/*

1 2 3 4 5
1 2 3 4
1 2 3
1 2
1


*/