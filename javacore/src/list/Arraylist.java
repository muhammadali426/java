package list;

import java.util.ArrayList;

public class Arraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer>  a = new ArrayList<Integer>();
		
		//arraylist is dynamic size you can increase or decrease arraylist
		//where as array has fixed size where arraylist grow dynamically
		// can accept duplicate values
		// you can access or insert value any where
		a.add(1);
		a.add(1);
		a.add(2);
		a.add(3);
		a.add(4);
		
		
		a.add(0, 0);
		System.out.println(a);
		
		a.remove(1);
		System.out.println(a);
		
		System.out.println(a.get(2));
		
		System.out.println(a.contains(2));
		
		System.out.println(a.indexOf(2));
		
		System.out.println(a.isEmpty());
		
		System.out.println(a.size());
		
		
		
		
		

	}

}
