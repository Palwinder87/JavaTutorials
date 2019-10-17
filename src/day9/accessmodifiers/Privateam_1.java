package day9.accessmodifiers;

class A
{
	
	//to get the output remove private keyword
	private int data=10;
	private void m1() {
		
		System.out.println("Hello!!");
		
	}
}

public class Privateam_1 {

	public static void main(String[] args) {

		A aobj=new A();
		aobj.data=10;
		aobj.m1();
		System.out.println(aobj.data);
		
	}

}
