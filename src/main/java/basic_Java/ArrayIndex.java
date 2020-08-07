package basic_Java;

public class ArrayIndex {

	public static void main(String[] args) {
		int a[] = {2,3,4,5,6};
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
			if(a[i]==4)
			{
				//System.out.println(i);
				break;
			}
		}
	}
}