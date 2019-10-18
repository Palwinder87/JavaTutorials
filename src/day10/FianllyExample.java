package day10;

public class FianllyExample {

	public static void main(String[] args) {
	
		System.out.println("Program started");
		
		int a=100;
		int b=200;
		
		try
		{
			System.out.println(a/2); 
			System.out.println(200/0);
			
		}
		catch(Exception e)
		{
			System.out.println("Entered into catch block");
		}
		finally
		{
			System.out.println("Entered into finally block");
		}
		
		System.out.println("Program exited");
		
	}

}
