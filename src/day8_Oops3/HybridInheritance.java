package day8_Oops3;

/*
 * One class to two interfaces is not possible 
 * BUT from two interface to one class is possible
 *  via implements keyword
 */
class A1
{
	void m1()
	{
		System.out.println("This is m1 method from A1 Class");
	}
}

interface B1
{
	void m2();
}

interface B2
{
	void m3();
}

/*
 * In this class you will get m1() by default but we have to 
 * implement m2() and m3() as they come from interfaces
 */
public class HybridInheritance extends A1 implements B1,B2 
{
	public void m2()
	{
		System.out.println("this is m2 method from B1 interface");
	}
	
	public void m3()
	{
		System.out.println("this is m3 method from B2 interface");
	}

	/*
	If you want to call anything from m1(),m2(),m3()
	we need to create objects in the main method.
	*/
	public static void main(String[] args) {
		
		HybridInheritance hi=new HybridInheritance();
		hi.m1();
		hi.m2();
		hi.m3();

	}

}
