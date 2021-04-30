package javacore;

public class firstClass {
	
	
	int a =5;
	public  void getData()
	{
		System.out.println("hello");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		firstClass fn = new firstClass(); 
		
		secondclass sn = new secondclass(); 
		sn.getData();
		
		fn.getData();
		
		System.out.println(fn.a);
		
	}

}
