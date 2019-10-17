package day7_Oops2;

class Bank // Parent Class
{
	double rateofInterest() //Definition
	{
		return 0; //body/logic
	}
}


class SBI extends Bank //Child class
{
	double rateofInterest() //definition should be same
	{
		return 10.5; //body/logic should be different
	}
}

class ICICI extends Bank //Child class
{
	double rateofInterest()//definition should be same
	{
		return 9.7;//body/logic should be different
	}
}


class AXIS extends Bank//Child class
{
	double rateofInterest()//definition should be same
	{
		return 8.5;//body/logic should be different
	}
}




public class MethodOverridingDemo {

	public static void main(String[] args) {
		
		SBI sbi=new SBI(); // creating object for SBI class
		System.out.println(sbi.rateofInterest());
		// sbi.rateofInterest() is object.func above
		//as the func. returns value we directly print  
		// it instead of putting it in a variable
		
		//Similarly we define objects for other banks
		ICICI icici=new ICICI(); // creating object for SBI class
		System.out.println(icici.rateofInterest());
		
		AXIS axis=new AXIS(); // creating object for SBI class
		System.out.println(axis.rateofInterest());

		
		
		
		
	}

}
