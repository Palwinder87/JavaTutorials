package day8_Oops3;

interface ABC //parent interface 1
{
	int x=100;
	void m1();
}


interface XYZ //parent interface 2
{
	int y=200;
	void m2();
}

// to implements m1() and m2() methods we must have a class


public class MultipleInheritanceTest implements ABC,XYZ //child class of parent interfaces
//if we say implements ABC and XYZ, we must implement m1 and m2 within this class
{
	public void m1()
	{
		System.out.println(x);
	}
	
	public void m2()
	{
		System.out.println(y);
	}

	public static void main(String[] args) {
		
		//to call these m1 and m2 we need to create objects for above class
		MultipleInheritanceTest test=new MultipleInheritanceTest() ;
		test.m1();
		test.m2();


	}

}
