package inheritance;

public class childDemo extends parentDemo {

	String name ="Muhammad Ali";
	
	public childDemo() {
		super();
		System.out.println("I am child constructor");
	}
	public void getData()
	{
		System.out.println(name);
		System.out.println(super.name);
		super.getData();
	}
	
	public static void main(String[] args) {
		
		
		childDemo cd =new childDemo();
		cd.getData();
		
		
	}
}
