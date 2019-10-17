package day2;

public class L3_Operators {

	public static void main(String[] args) {
		
		int a=10;
		int b=20;
		
		//Arithmetic operators
		
		//note the difference in these outputs carefully;
		
		System.out.println("--------Arithmetic Operators--------");
		System.out.println("Sum of a and b is" +a+b);
		System.out.println("Sum of a and b is" +(a+b));
		
		
		System.out.println("Sum of a and b is" +(a+b));
		System.out.println("Diff of a and b is" +(b-a));
		System.out.println("Mul of a and b is" +(a*b));
		System.out.println("Div of a and b is" +(a/b));
		System.out.println("Mod Div of a and b is" +(a%b));
		
		
		//Relational operators - they always return a boolean value 
		
		System.out.println("--------Relational Operators--------");
		System.out.println(a==b);
		System.out.println(a>b);
		System.out.println(a<b);
		System.out.println(a>=b);
		System.out.println(a<=b);
		System.out.println(a!=b);
		
		
		//Logical operators - they work on AND/OR cond. and returns boolean value.
		
		boolean x=true;
		boolean y=false;
		
		System.out.println("--------Logical Operators--------");
		System.out.println(x && y);
		System.out.println(x || y);
		System.out.println(!x);
		System.out.println(!y);
		
		
		//Increment Operators
				
		a++;
		b--;
		//a++ is same as a = a+1;
		System.out.println("--------Increment Operators--------");
		System.out.println(a);
		System.out.println(b);


	}

}
