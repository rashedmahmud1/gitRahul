package collectionFramework_java;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {

	public static void main(String[] args) {
		//HashSet,TreeSet,LinkedHashSet-implements the set interface
		// Set interface does not accept duplicate value
		//There is no guarantee elements store in sequence order... its store in random order
		
		HashSet<String>hs = new HashSet<String>();
		hs.add("USA");
		hs.add("UK");
		hs.add("BD");
		hs.add("BD");
		hs.add("she");
		hs.add("he");
		
		Iterator<String> it =hs.iterator();
		while(it.hasNext()) {
		System.out.println(it.next());
		}
		/*
		 * System.out.println(hs); System.out.println(hs.isEmpty());
		 * System.out.println(hs.size());
		 */

	}

}
