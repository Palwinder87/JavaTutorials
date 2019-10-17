package day5_Classes_Objects;

public class Calculation {
	
	int x=10;
	int y=20;
	
	/*
	void sum() //case 1:not taking parameters and also not returning any value
	{
		//if the method does not return any thing we write print statement here
		System.out.println(x+y);
	}
	*/
	
	/*
	int sum() //case 2:not taking parameters but returning a value
	// as in this case is returning int value void is changed to int
	//but the method does not have any parameters set
	{
		return (x+y);
	}
	*/
	
	
	void sum(int a, int b) //case 3:taking parameter but not returning value
	{
		System.out.println(a+b);
	}
	
	/*
	int sum(int p, int s) //case 4:taking parameter and also returning value
	{
		return(p+s);
	}
	*/

	public static void main(String[] args) {
		
		Calculation cal=new Calculation();
		
		//cal.sum(); //case 1
		//this method is not returning a value and was just displaying
		//an output in definition above
				
				
		//int res=cal.sum(); //case 2
		//as the method is returning a value it has to be hold in a variable
		// so we will define in a variable for that and print that variable
		//System.out.println(res);
		//if we dont want to assign a variable, we can also write
		//System.out.println(cal.sum());
				
				
		cal.sum(15, 17); //case 3
		//as this method is taking parameter, we define the parameters here
				
		
			
		//System.out.println(cal.sum(75,30)); //case 4
		
		
		
		
		
				
	}

}
