package day7_Oops2_Super_Final;

public class Animal {

	String color="White";
	
	void eating()
	{
		System.out.println("Eating Meat");
	}
	
	Animal() //creating constructor in parent class
	{
		System.out.println("Const. Animal is created");
	}

	}
	
	
	class Dog extends Animal
	{
		
		String color="Black";
		
		Dog() //creating constructor in child class
		{
			super(); // invokes parent class constructor
			//System.out.println("Const. Dog is created");
			
			/*NOTE:
			super() is used by class constructors to
			 invoke constructors of its parent class
			*/
		}
		
		void displaycolor()
		{
			System.out.println(color);
			//invoking parent class variable 
			System.out.println(super.color);
			// super keyword will go and capture the
			// value of immediate parent class variable
			 
		}
		
		void eating()
		{
			System.out.println("Eating Bone");
			//invoking parent class method 
			super.eating(); 
		}
		
	}

