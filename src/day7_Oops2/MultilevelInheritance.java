package day7_Oops2;

class A2 //A2 is a parent child
{
	int a;
	void display()
	{
		System.out.println(a);
	}
}

class B2 extends A1  //B2 is child class of A2
{
	int b;
	void print()
	{
		System.out.println(b);
	}
	
}

class C2 extends B2  //C is child class of B
{
	int c;
	void show()
	{
		System.out.println(c);
	}
	
}


public class MultilevelInheritance {

	public static void main(String[] args) {

		
		/*
		A2 aobj=new A2(); //creating object for class A
		aobj.a=100;
		aobj.display();
				
		B2 bobj=new B2();
		bobj.a=10; //belong to class A2
		bobj.b=20; //belong to class B2
		
		bobj.display(); //belong to class A2
		bobj.print(); //belong to class B2
		*/
		
		C2 cobj=new C2();
		cobj.a=100; //belong to class A2
		cobj.b=200; //belong to class B2
		cobj.c=300; //belong to class C2
		
		cobj.display();
		cobj.print();
		cobj.show();
					
		
	}

}