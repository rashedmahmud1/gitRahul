package basic_Java;

public class MultiDemontionArrayMaxNum1 {

	public static void main(String[] args) {
		int a [][]= {{2,3,4},{5,6,7},{1,8,9}};
		int min=a[0][0];
		int mincolumn=0;
		
		
		
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				if(a[i][j]>min)
				{
					min=a[i][j];
					 mincolumn = j;
				}
           }
		}
		//System.out.println(min);
		int max=a[0][mincolumn];
		int k=0;
		while( k<3)
		{
		if	(a[k][mincolumn]>max);
		{
			max=a[k][mincolumn];
			k++;
		}

		}
		System.out.println(max);
	}

}
