package day9.accessmodifiers;

class B
{
	
	int data=10;
	void m2() {
		
		System.out.println(data);
		
	}
}

public class Defaultam_2 {

	public static void main(String[] args) {
		B bobj=new B();
		bobj.data=20;
		bobj.m2();
		

	}

}
