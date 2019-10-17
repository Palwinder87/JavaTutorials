package day6_Oops1;

public class ThisKeyword {
	
	int a,b;
	
	//a,b are instance or class variables
	//void getValues(int x, int y)
	//these x and y are called method or external variables
	//we will replace x,y with a,b
	//these x,y are different from above x,y
	
	void getValues(int a, int b)
	{
		//a=x;
		//a=a;
		this.a=a;
		//b=y;
		b=b;
		this.b=b;
	}
	
	 /*if we use a=x and b=y we will get 10,20 result
	 * But if we say a=a, b=b we will get 0,0 result
	 * because, getValues() method does not know 
	 * which a is refereeing to what.
	 * for that we use this.a
	 * this keyword will that which variable belong to class
	 * so, this keyword alsways points to class
	 *  
	 * we use this keyword to reduce keyword thus reduce memory
	 */
	
	void printValues()
	{
		System.out.println(a);
		System.out.println(b);
	}

	public static void main(String[] args) {
		
		ThisKeyword th=new ThisKeyword();
		th.getValues(10,20);
		th.printValues();
		
	}

}
