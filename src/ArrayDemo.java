
public class ArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		int a[]=new int[5]; //Declare an array and allocate memory for the values.
        
        a[0]=1;
        a[1]=2;
        a[2]=3;
        a[3]=4;
        a[4]=5; //initialise values into that array.
        
        for(int i=0;i<a.length;i++) {
        	System.out.println(a[i]);
        }
		
	}

}
