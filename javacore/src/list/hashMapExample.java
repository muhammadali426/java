package list;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class hashMapExample {
	
	public static void main(String[] args) {
		
		HashMap<Integer, String> hm = new HashMap<Integer,String>();
		
		//HashTable<Integer, String> hm = new HashTable<Integer,String>();
		
		// hashtable is thread save it complete only one thread at a time 
		// but hashmap run multiple threads at a time
		//hashtable not allow null key or null value as compare with hashmap vice versa
		// hashmap value are iterate by iterator.
		hm.put(0, "Hi");
		hm.put(1, "Good Bye");
		hm.put(2, "Good Morning");
		hm.put(3, "Good Evening");
		
		System.out.println(hm.get(2));
		//hm.remove(2);
		//System.out.println(hm.get(2));
		Set sn  = hm.entrySet();
		   Iterator it =sn.iterator();
		
		while(it.hasNext())
		{
			Map.Entry mp=(Map.Entry)it.next();
			System.out.print(mp.getKey());
			System.out.print(" ");
			System.out.print(mp.getValue());
			System.out.println();
		}
		
		
	}

}
