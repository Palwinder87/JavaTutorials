package day5_Classes_Objects;

public class Student {
	
	int sid;
	String sname;
	char grade;
	
	void display() {
		System.out.println(sid+"	"+sname+"	"+grade);
	}


	void getValues(int id, String name, char g) // used in pass by method
		//getValues method will take the id, name, char parameter from the main function
		{
			sid=id;
			sname=name;
			grade=g;
		}
		
	/*
	Student(int id, String name, char g) //Constructor Initializing
	// check constructor introduction in notes
	{
		sid=id;
		sname=name;
		grade=g;
	}
	*/
}
