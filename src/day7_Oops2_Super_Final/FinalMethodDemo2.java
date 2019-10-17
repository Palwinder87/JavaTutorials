package day7_Oops2_Super_Final;


class Bike3
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
}

class Honda3 extends Bike3
{
	void run()
	{
		System.out.println("Started..");
	}
}*/


public class FinalMethodDemo2 {
		public static void main(String[] args) {
			
			Bike3 bk=new Bike3(); 
			System.out.println(bk.run());
		
				

	}

}
