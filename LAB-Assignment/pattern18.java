class pattern18
{
public static void main(String args[])
{

	int i,j;
	for(i=0;i<5;i++)//rows
	{
		int a= 65;
		for(j=5;j>i;j--)//columns no of column per row
		{
			System.out.print((char)(a++)+" ");
		}
		System.out.println();
	}

}

}

/*

A B C D E
A B C D
A B C
A B
A

*/