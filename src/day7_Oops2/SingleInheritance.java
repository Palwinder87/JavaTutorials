package day7_Oops2;

class A1 //A is a parent child
{
	int a;
	void display()
	{
		System.out.println(a);
	}
}

class B1 extends A1  //B1 is child class of A1
{
	int b;
	void print()
	{
		System.out.println(b);
	}
	
}


public class SingleInheritance {

	public static void main(String[] args) {

		
		/*
		A1 aobj=new A1(); //creating object for class A1
		aobj.a=100;
		aobj.display();
		*/
		
		
		B1 bobj=new B1();
		bobj.a=10; //belong to class A
		bobj.b=20; //belong to class B
		
		bobj.display(); //belong to class A
		bobj.print(); //belong to class B
		
		
		
	}

}
