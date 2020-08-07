package basic_Java;

public class MultiDemontionArrayMaxNum {

	public static void main(String[] args) {
		int a [][]= {{1,2,3},{4,5,6,}};
		int min = a[0][0];
		int mincoloumn=0;
		
		
		for(int x=0;x<2;x++)
		{
			for(int y=0;y<2;y++)
			{
				if(a[x][y]<min)
				{
					min=a[x][y];
					mincoloumn=y;
				}
			
			}
		}
		 System.out.println(min);
		
		int k=0;
		int max=a[0][mincoloumn];
		while( k<2)
		{
			if(a[k][mincoloumn]>max)
			{
				max=a[k][mincoloumn];
				
			}
			k++;
		}
			
			
			
			
       System.out.println(max);
	}

}
