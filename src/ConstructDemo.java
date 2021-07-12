
public class ConstructDemo {
	
	
	public ConstructDemo()
	{
		System.out.println("This is a constuctor.");
	}
    
	//Parametrised constructor 
	
    public ConstructDemo(int a, int b)
    {
    	int c=a+b;
    	System.out.println("This is a constuctor-integer-"+c);
    }
	
    public ConstructDemo(String str)
    {
    	System.out.println("This is a constuctor-"+str);
    }
    
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//ConstructDemo cd = new ConstructDemo();
		ConstructDemo i = new ConstructDemo(3,2);
		ConstructDemo s = new ConstructDemo("Hello World!");
		
		
		

	}

}
