class pattern8
{

	public static void main(String args[])
	{
		int i,j,k,l,m;
		int ar[] = new int[5];
		
		System.out.println();
		for(i=1;i<=5;i++)//rows
		{
			for(j=5;j>i;j--)//columns
			{
				System.out.print(" ");
			}
			for(k=1,l=5;k<=i;k++,l--)
			{
				//System.out.print(l+" ");
				//for a[0] =5 for next iteration a[1]=4
				ar[i-1]=l;				
			}
			//0=5 1=4 2=3 3=2 4=1
			//prinitng reverse array
			for(m=i-1;m>=0;m--)
			{
				System.out.print(ar[m]+" ");
			}
		
			System.out.println();
		
	
		}

	}
}
/*
i                      k 
1      5               1
2     4 5             1  2
3    3 4 5          1  2  3 
4   2 3 4 5        1  2  3  4
5  1 2 3 4 5      1  2  3  4  5



	5
   4 5
  3 4 5
 2 3 4 5
1 2 3 4 5



*/