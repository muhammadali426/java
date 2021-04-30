package array;

public class interviewMin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int abc[][]= {{1,2,3},{4,5,6},{7,8,0}};
		
		int min=abc[0][0];
		
		int mincolumn = 0;
		for(int i=0;i<3;i++) // row
		{
			for(int j=0;j<3;j++) // coloums
			{
				
				if(abc[i][j]<min)
				{
					min=abc[i][j];
					mincolumn=j;
					
				}
			}
		}
		int max=abc[0][mincolumn];
		int k = 0;
		while(k<3)
		{
			
			if(abc[k][mincolumn]>max)
			{
				max=abc[k][mincolumn];
			}
			
			k++;
		}

		System.out.println(min);
		System.out.println(max);
	}

}
