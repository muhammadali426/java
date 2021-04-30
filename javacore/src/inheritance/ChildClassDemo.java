package inheritance;

public class ChildClassDemo extends ParentClassDemo {
	
	
	public void getData(int a)
	{
		System.out.println(a);
	}
	
	public void getData(int a, int b)
	{
		System.out.println(a);
		System.out.println(b);
	}
	
	public void getData(String a)
	{
		System.out.println(a);
	}
	
	public void engine()
	{
	  System.out.println("New Engine");	
	}

	public void colour()
	{
		System.out.println(color);
	}
	public void audioSystem()
	{
		System.out.println("Audio System child code is implemented");
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		ChildClassDemo c =new ChildClassDemo();
		c.engine();
		c.colour();
		c.gear();
		c.brakes();
		c.engine();
		
		
		c.getData(1);
		c.getData(2, 3);
		c.getData("ali");
        
		c.audioSystem(); // function override both have same name same method
 		
	}

}
