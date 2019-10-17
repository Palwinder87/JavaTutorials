package day6_Oops1;

public class ConstructorOverloading {
	
	ConstructorOverloading(int a, int b) //1 constructor
	{
		System.out.println(a+b);
	}
	
	ConstructorOverloading(int a, double b) //2 constructor
	{
		System.out.println(a+b);
	}
	
	ConstructorOverloading(double a, double b) //3 constructor
	{
		System.out.println(a+b);
	}
	
	ConstructorOverloading(int a, int b, int c) //4 constructor
	{
		System.out.println(a+b+c);
	}
	
	
	/* 
	 * note that in the ConstructorDemo.java file we did not have any print statement in the constructor definition above 
	 * and had to separately call display() method for that. 
	 * We did not did anything like that here.
	 */
	
	public static void main(String[] args) {
		
		ConstructorOverloading co=new ConstructorOverloading(10,34.70);
		// we can create different constructors by creating different object name here.		
				
	}

}
