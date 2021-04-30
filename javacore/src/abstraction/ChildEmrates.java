package abstraction;

public class ChildEmrates  extends ParentAirCraft{

	
public static void main(String[] args) {
	
	ChildEmrates c =new ChildEmrates();
	
	c.engine();
	c.safetyGuideLines();
	c.bodycolor();
	
	// in abstraction you can`t initiated parent class object  
}	

	@Override
	public void bodycolor() {
		// TODO Auto-generated method stub
	
		System.out.println("Body Color is red");
	}
	

}
