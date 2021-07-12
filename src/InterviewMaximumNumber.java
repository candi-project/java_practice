
public class InterviewMaximumNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
     /* 
      1   2   3
	  2   4   5
	  0 1000 900 
	  */
	/* 
	 1. Find the maximum number.	
	 2. Identify the column of maximum number.
	 3. Find the minimum number in identified column.
	 */
	
				
		int b[][]= {{1,2,3},{2,4,5},{0,1000,9000}};
		//System.out.print(b[2][1]);
		
		int max=b[0][0];
		int column=0;
		
		for(int i=0;i<3;i++) 
		{  
			for (int j=0;j<3;j++)
			{
				
				if(b[i][j]>max)
				{
				
				max=b[i][j];
			    column = j;
				
				}
			
		    }
         
	    }
		
		//System.out.print(max);
		
		int k=0;
		int min=b[k][column];
		
		while(k<3)
		{
         
		 if(b[k][column]<min)
		 {
			min=b[k][column];
		 }
		k++;
		
		}
		System.out.print(min);
	
	
	}

}
