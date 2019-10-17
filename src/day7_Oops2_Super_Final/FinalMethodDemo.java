package day7_Oops2_Super_Final;

class Bike
{
	void run()
	{
		System.out.println("Running");
	}
	
	final void run2()
	{
		System.out.println("Running2");
	}
	

}

/*class Bike2
{
	void run()
	{
		System.out.println("Running2..");
	}
}*/

class Honda extends Bike
{
	void run()
	{
		System.out.println("Started..");
	}
}



public class FinalMethodDemo {

}

