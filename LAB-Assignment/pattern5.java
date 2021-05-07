class pattern5
{

	public static void main(String args[])
	{
		int i,j;
		System.out.println();
		for(i=0;i<=4;i++)//rows
		{
			int alpha =65;
			for(j=0;j<=i;j++)//columns
			{
				System.out.print((char)(alpha+i)+" ");
			}
			System.out.println();
			
		}
		
	}

}
/*
A
B B
C C C
D D D D
E E E E E

*/