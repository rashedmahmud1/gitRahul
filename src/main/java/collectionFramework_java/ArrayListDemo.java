package collectionFramework_java;

import java.util.ArrayList;

public class ArrayListDemo {
	//ArrayList,LinkedList,Vector- implements List Interface
	//All List classes accept duplicate value as off separate index
	//Array is fixed ands ArrayList is dynamic and can grow as needed.
	//You can access and insert any value any index.
	
	

	public static void main(String[] args) {
		ArrayList<String> a = new ArrayList<String>();
		a.add("Rashed");
		a.add("Mahmud");
		a.add("Java");
		
		a.remove(2);
		System.out.println(a.get(1));
		System.out.println(a);
		System.out.println(a.contains("Student"));
		System.out.println(a.get(0));
		System.out.println(a.size());
		System.out.println(a.isEmpty());
		System.out.println(a.indexOf("Rashed"));

	}

}
