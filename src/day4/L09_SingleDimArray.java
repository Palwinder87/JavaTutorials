package day4;

public class L09_SingleDimArray {

	public static void main(String[] args) {
		
		/*
		//declared array with size 5, starting index is 0 and last index is 4
		//int a[]=new int[5]; 
		//storing/inserting values into the array
		a[0]=100;
		a[1]=200;
		a[2]=300;
		a[3]=400;
		a[4]=500;
		*/
		
		//declare an array without specifying size
		int a[]= {100,200,300,400,500};
		
		// to print the length of an array, we use = a.length
		//System.out.println("length of an array is " +a.length);
		//System.out.println("value at third location is " +a[2]);
		
		/*
		// Reading the value of the array 
	
		for(int i=0;i<a.length;i++)
		{
			System.out.println("Value at location " +i+ " is " + +a[i]);
		}
		*/
		
		
		for(int i:a) 
			//value at a from starting till end will be read and then assigned to i
			//once the value is read, it will exit from the loop
		{
			System.out.println(i);
		}



	}

}
