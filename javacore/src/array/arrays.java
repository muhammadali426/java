package array;

public class arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int a[] = new int[5]; //declare arrays and allocate memory
		a[0]=1;
		a[1]=2;
		a[2]=3;
		a[3]=4;
		a[4]=5;
		
		int b[] = {1,2,3,4,5};
		
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
		for(int i=0;i<b.length;i++)
		{
			System.out.println(b[i]);
		}
	}

}
