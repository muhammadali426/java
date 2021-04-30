package javacore;

public class StaticVar {

	String name;
	String address;
	static String city="Pind Dadan Khan"; // class variable

	 
	
 static int a=10;
 
 
	StaticVar(String name , String address) {
		
		this.name =name; // local variable
		this.address=address;
		a++;
		System.out.println(a);	
		
	}
	
	public void getAddress()
	{
		System.out.println(address+" "+city);
		
	}

	public  static void getcity()
	{
		System.out.println(city);
		
	}

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		StaticVar s = new StaticVar("ali","pdk");
		StaticVar s1 = new StaticVar("aresha","sgd");
		
		s.getAddress();
		s1.getAddress();
		getcity();
	}

}
