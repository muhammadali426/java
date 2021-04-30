package inheritance;

public class constructorDemo {

	public constructorDemo(){
		
		System.out.println("I am the constructor");
	}
	
    public constructorDemo(int a , int b){
		
		System.out.println("I am the parameterized constructor");
	}
	
public constructorDemo(String str ){
		
		System.out.println(str);
	}
	public void getData()
	{
		System.out.println("I am the method");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		constructorDemo c=  new constructorDemo();
		constructorDemo cd=  new constructorDemo(4,6);
		constructorDemo c1=  new constructorDemo("hello");
		cd.getData();
		

	}

}
