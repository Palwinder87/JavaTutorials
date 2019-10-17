package day5_Classes_Objects;

public class StudentMain {

	public static void main(String[] args) {
	
		/*
		// First approach: assigning value by using reference variable
		Student stu1=new Student();
		
		stu1.sid=1010;
		stu1.sname="John";
		stu1.grade='A';
		*/
		
		
		// Second approach: assigning value by using method
		Student stu2=new Student();
		stu2.getValues(2020, "Tim", 'B');		
		
		
		//Third approach: assigning value by constructor
		//Student stu3=new Student(3030, "Smith", 'C');
		
		//stu1.display();
		stu2.display();
		//stu3.display();

	}

}
