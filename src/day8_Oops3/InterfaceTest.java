package day8_Oops3;

interface A //defining Interface
{
	int a=10;
	//we must define the value of interface.
	//By default, interface variables 
	//are static and final
	
	void m1(); //abstract method, by def. public
}

public class InterfaceTest implements A
{
	/* We must implement the method void m1() defined above
	 * To implement dont change the defination
	 */
	public void m1()
	/*
	 * note the use of public in front of void m1()
	 * we need to use public keyword to access void m1()
	 * as the interface defined above are public
	 * we cannot define lower level for class.
	 * Remeber this always
	 * 
	 * To access this method we must create  
	 * an object for m1() in the main method
	 */
	{
		System.out.println(a);
	}

	public static void main(String[] args) {
		
		A a=new InterfaceTest();
		a.m1();
		
		
		/*
		 * Using old method of classes and objects to access
		 * InterfaceTest t=new InterfaceTest();
		 * t.m1();
		 */
		
			 
		
	}

}
