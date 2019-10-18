package day10;

public class ExceptionExamples {
	
	public static void main(String[] args)
	{
		System.out.println("Program is started");
		System.out.println("Program is in progress");
		
		int a=100;
		
		//System.out.println(a/0); 
		/*this statement throws an ArithmeticException,
		 * so we put that in a try catch.
		 * if we write println(a/2) then the catch
		 * block will not execute and program runs fine */
		try
		{
			System.out.println(a/0);
		}
		catch(ArithmeticException e) //we specify the exception type here
		//ArithmeticException in itself is a class name in java, 
		//so we need to give some object for it. so we give e here.
		{
			System.out.println("Arith. Exception entered in catch block");
		}
				
		
		String s=null;
		//System.out.println(s.length()); //throws NullPointerException
		try
		{
			System.out.println(s.length());
		}
		catch(Exception f) //we do not specify exception type here
		//Exception is a superclass of all the exceptions
		{
			System.out.println("Exception entered in catch block");
		}
		
		
		String x="abc";
		//int i=Integer.parseInt(x); //throws NumberFormatException
		
		int arr[]=new int[5];
		//arr[10]=100; //throws ArrayIndexOutofBoundsException
		
		System.out.println("Program is completed");
		System.out.println("Program is exited");
	}

}
