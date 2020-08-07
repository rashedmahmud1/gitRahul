package collectionFramework_java;

import java.util.ArrayList;

public class AmazoneArray {

	public static void main(String[] args) {
		int a []= {4,4,5,5,6,6,7};
		//print the unique value
		
		ArrayList<Integer>ab =new ArrayList<Integer>();
		int k=0;
		for(int i=0;i<a.length;i++) {
			if(!ab.contains(i))
			{
				ab.add(a[i]);
				k++;
				for(int j=i+1;j<a.length;j++) {
					k++;
				}
				//System.out.println(a[i]);
				System.out.println(k);
			}
			
		}
		
		
		
		
		
		
		
		
		

	}

}
