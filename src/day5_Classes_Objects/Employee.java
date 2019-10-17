package day5_Classes_Objects;

public class Employee {   	//this is a employee class definition
	
	//below are the variables defined within the class
	int eid;
	String ename;
	double sal;
	int deptno;
	String job;
	
	void display() // in this method we want to print the variables defined in the class
	{
		System.out.println(eid);
		System.out.println(ename);
		System.out.println(sal);
		System.out.println(deptno);
		System.out.println(job);
		
	}
		

	/* 
	System.out.println() is an inbuilt method in java
	-this method doesnot return anything.
	-so we cannot asssign the values in a variable as it doesnot return anything. 

	we will access the variables in print method through objects.
	through objects we will assign the value from class to method

	We need to create these objects in the main method because the execution always starts from the main method.
	*/

	
	
	/*public static void main(String args[]) //main method (note that the main method is in the same class)
	{
		Employee emp1=new Employee(); //Object creation for the Employee class 
		emp1.eid=101; //adding the value to the variables
		emp1.ename="David";
		emp1.sal=25000.00;
		emp1.deptno=10;
		emp1.job="Manager";
		
	
		*/
		 
		/*
		* as emp1 is also having a display method, so we will call the display method.
		 * the display method will print the values of the variables.
		 */
	
		//emp1.display(); // calling the display method
		
		
		/* 
		We will now create another object
		For a class we can create any number of objects but variable names should be different
		
	
		
		Employee emp2=new Employee(); //Second Object creation for the Employee class 
		emp2.eid=102; //adding the value to the variables
		emp2.ename="John";
		emp2.sal=55000.00;
		emp2.deptno=20;
		emp2.job="CEO";
		emp2.display();
		
	}*/
	
	
}
