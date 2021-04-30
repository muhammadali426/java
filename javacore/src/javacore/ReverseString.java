package javacore;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	String a = "Rahul";
	String t ="";
	for(int i=a.length()-1;i>=0;i-- )
	{
		
		t=t+a.charAt(i);
	}
	
	System.out.println(t);
	

	
	if(a!=t)
	{
System.out.println("both are not match");		
	}
}
}