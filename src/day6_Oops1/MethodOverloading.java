package day6_Oops1;

public class MethodOverloading {
	
	void add(int a, int b) //1 method
	{
		System.out.println(a+b);
	}
	
	
	void add(int a, double b) //2 method
	{
		System.out.println(a+b);
	}
	
	void add(double a, double b) //3 method
	{
		System.out.println(a+b);
	}
	
	void add(int a, int b, int c) //4 method
	{
		System.out.println(a+b+c);
	}
	

	public static void main(String[] args) {
		
		MethodOverloading mo=new MethodOverloading();
		mo.add(10,20); //1 method
		mo.add(10,20,30); //4 method
		mo.add(10,70.30); //2 method
		mo.add(72.5,25.35); //3 method

	}

}
