
public class MultiDimentionalArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		//array[row][column]
		
		int a[][]=new int[2][3];
		a[0][0]=1;
		a[0][1]=2;
		a[0][2]=3;
		a[1][0]=2;
		a[1][1]=4;
		a[1][2]=5;
		
		//System.out.print(a[1][1]);
		
		int b[][]= {{1,2,3},{2,4,5},{7,8,9}};
		//System.out.print(b[2][1]);
		
		for(int i=0;i<3;i++) 
		{  //row
			
			for (int j=0;j<3;j++) 
			{
				
				System.out.print(b[i][j]);
				System.out.print(",");
			}
			System.out.println();
		}
		
	}

}
