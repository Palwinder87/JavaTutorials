package day5_Classes_Objects;

public class EmployeeMain {   	//this is a employee class definition
	
		
	public static void main(String args[]) //main method (note that the main method is in 'another' class)
	{
		Employee emp3=new Employee(); //Object creation for the Employee class 
		emp3.eid=103; //adding the value to the variables
		emp3.ename="Max";
		emp3.sal=10000.00;
		emp3.deptno=40;
		emp3.job="Clerk";
		
		emp3.display();
	}
	
	
}
