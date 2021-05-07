class pattern10
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
			for(k=1,l=69;k<=i;k++,l--)
			{
				//System.out.print(l+" ");
				//for a[0] =5 for next iteration a[1]=4
				ar[i-1]=l;	
				
			}
			//0=5 1=4 2=3 3=2 4=1
			for(m=i-1;m>=0;m--)
			{
				System.out.print((char)ar[m]+" ");
			}
		
			System.out.println();
		
	
		}

	}

}

/*


    E
   D E
  C D E
 B C D E
A B C D E

*/