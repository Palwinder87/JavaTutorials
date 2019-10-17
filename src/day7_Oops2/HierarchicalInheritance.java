package day7_Oops2;

class Parent
{
	int a;
	void display()
	{
		System.out.println(a);
	}
}


class Child1 extends Parent
{
	int x;
	void show()
	{
		System.out.println(x);
	}
}

class Child2 extends Parent
{
	int y;
	void show()
	{
		System.out.println(y);
	}
}

public class HierarchicalInheritance {

	public static void main(String[] args) {
		
		Child1 c1=new Child1();
		c1.a=1000;
		c1.x=2000;
		c1.display();
		c1.show();
		
		Child2 c2=new Child2();
		c2.a=3000;
		c2.y=4000;
		c2.display();
		c2.show();
		

	}

}
