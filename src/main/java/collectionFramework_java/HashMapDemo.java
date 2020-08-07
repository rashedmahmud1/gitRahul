package collectionFramework_java;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
//1)HashMap is not syncronizwd and thread safe and HashTable is syncronizwd and thread safe
//2)HashMap allow one NULL key and any number of null value but HashTable do not allow any number of NULL value
//3)HashMap to iterate the value use iterator and HashTable use Enumerator







public class HashMapDemo {

	public static void main(String[] args) {
		HashMap<Integer,String> hm=new HashMap<Integer,String>();
		hm.put(1,"Rashed");
		hm.put(2, "Sehrish");
		hm.put(3,"suheera");
		hm.put(4,"Mahmud");
		hm.put(5,"Ifrat");
		System.out.println(hm);
		hm.remove(5);
		System.out.println(hm);
		System.out.println(hm.get(5));
		
		Set se=hm.keySet();
		Iterator it =se.iterator();
		while(it.hasNext()) {
			Map.Entry me=(Map.Entry)it.next();
			System.out.println(me.getKey());
			System.out.println(me.getValue());
			
		}

	}

}
