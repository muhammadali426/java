package list;

import java.util.HashSet;
import java.util.Iterator;

public class hashSetExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// hashset, treeset, LinkedHashset implements set interface
		// set interface can,t accept duplicate values;
		// there is no guarantee elements stored in sequential order

		HashSet<String> hs = new HashSet<>();
		hs.add("pakistan");
		hs.add("pakistan");// set interface can,t accept duplicate values;
		hs.add("turkey");
		hs.add("Malasyia");
		hs.add("iran");
		hs.add("Qatar");
		System.out.println(hs);

		System.out.println(hs.isEmpty());

		System.out.println(hs.size());
		
		
		Iterator<String> it =hs.iterator();
		while(it.hasNext())
		{
		System.out.println(it.next());
		}

	}

}
