package javacore;

public class ExceptionDemo {

	int a = 4;
	int b = 7;
	int c = 0;

	
	
	
	
	
	//one try can be follow by multiple catch block;
	//catch can by fellow by one try
	

	public static void main(String[] args) {
	
		int k;
		int a = 4;
		int b = 7;
		int c = 0;
		try {
			
			//k=b/c;
			
			
			int arr[] =new int[5];
			System.out.println(arr[7]);
			
			
			
		}
		
		 catch (IndexOutOfBoundsException ioe) {
				
				System.out.println(ioe);
			}
		
		 catch (ArithmeticException et) {
				
				System.out.println(et);
			}
			
		catch (Exception e) {
			
			System.out.println(e);
		}
		
		finally {
			System.out.println("delete cookies");
		//	this block is executed if catch block thrown exception or not 
		}
		
	}

}
