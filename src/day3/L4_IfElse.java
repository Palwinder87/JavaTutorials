package day3;

public class L4_IfElse {

	public static void main(String[] args) {
		
		int age=15;
		
		if(age>=18)
		{
			System.out.println("~~~~~~~~~~~");
			System.out.println("VOTE ???");
			System.out.println("Eligible for vote");
		}
		
		else
		{
			System.out.println("~~~~~~~~~~~");
			System.out.println("VOTE ???");
			System.out.println("NOT Eligible for vote");
		}
		
		
		int number=10;
		
		if(number%2 == 0)
		{
			System.out.println("~~~~~~~~~~~");
			System.out.println("ODD-EVEN ???");
			System.out.println("Number is even");
		}
		
		else
		{
			System.out.println("~~~~~~~~~~~");
			System.out.println("ODD-EVEN ???");
			System.out.println("Number is odd");
		}
		
		
		int x=2;
		int y=3;
		
		if(x>y)
		{
			System.out.println("~~~~~~~~~~~");
			System.out.println("GREATER ???");
			System.out.println("x is greater");
			
		}
		
		else
		{
			System.out.println("~~~~~~~~~~~");
			System.out.println("GREATER ???");
			System.out.println("y is greater");
		}
	

		// Nested IF - ELSE (more than one if else statement)
		
		int day=6;
		
		if(day==1)
		{
			System.out.println("~~~~~~~~~~~");
			System.out.println("DAY ???");
			System.out.println("Day is Monday");	
		}
		
		else if(day==2)
		{
			System.out.println("~~~~~~~~~~~");
			System.out.println("DAY ???");
			System.out.println("Day is Tuesday");
			
		}
		
		else
		{
			System.out.println("~~~~~~~~~~~");
			System.out.println("DAY ???");
			System.out.println("Any other day");
		}
		
	}

}
