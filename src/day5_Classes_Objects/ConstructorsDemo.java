package day5_Classes_Objects;

public class ConstructorsDemo {
	
	int x;
	int y;
	
	ConstructorsDemo()  //Default constructor - does not take any parameters
	{
		x=10;
		y=29;
	}
	
	
	ConstructorsDemo(int a, int b)  //Parameterized constructor - take parameters
	{
		x=a;
		y=b;
	}
	
	void display() // created this for the output display
	{
		System.out.println(x+y);
	}
	
	

	public static void main(String[] args) {
		
		//creating object for the class
		ConstructorsDemo cm1= new ConstructorsDemo(); //also, Invokes default constructor
		
		
		//We can have as many constructors but can invoke only one at a time if we have same object
		//otherwise, we have to create different object name
		ConstructorsDemo cm2= new ConstructorsDemo(400,500); //Invokes parameterized constructor
		
		//Display
		cm1.display(); //calling method explicitly
		cm2.display();
		
	
	}

}
