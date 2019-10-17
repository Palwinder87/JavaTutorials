package day6_Oops1;

public class StaticExample {
	
	static int a=10; // static variable
	int b=20; //non static variable
	
	
	static void m1() // static method
	{
		System.out.println("this is m1 - static method"); 
		
		//if a static method want to access a non static integer
		StaticExample se=new StaticExample();
		System.out.println(se.b);
		System.out.println("access. int b thru method m1");
	}
	
	void m2() //non static method
	{
		System.out.println("this is m2 - Non static method");
	}
	
	
	void m3() 
	// non static method access both static and non static method and variables
	{
		System.out.println("this is m3 - Non static method");
		System.out.println(a);
		System.out.println(b);
		m1();
		m2();
		
	//we have to create object to access them
	}

	//static methods can access only static stuff (directly ie without creating any object).
	public static void main(String[] args) {
		System.out.println(a);
		
		// Note: we did not create any object to access this variable
		
		m1();
		// Similarly here we access the method w/o creating any object
		
		 /*
		 * In case of static variable and methods, if we have the main method in the same class,
		 *  we can directly access them. But, if the main methods is in other class, we have to specify
		 *   the class name in which they are defined. You do not have to create an object then also.
		 *   So our statements will become like this: 
		 *   
		 *   System.out.println(StaticExample.a);
		 *   StaticExample.m1();
		 */
		
		/* we cannot access non static variable and method as below.
		 * An error will be shown if we try to do so. */
		//System.out.println(b);
		//m2()
		
		
		/* static methods can also access non static stuff but through objects.
		 * This is same like what we have been doing earlier
		 */
		StaticExample se=new StaticExample();
		System.out.println(se.b); 
		se.m2();
		
		se.m3();
		
		
		
		
		
	}

}
