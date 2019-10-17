package day4;

public class L10_MultiDimArray {

	public static void main(String[] args) {
	
		
		int a[][]=new int [3][2];
		
		a[0][0]=100;
		a[0][1]=200;
		
		a[1][0]=300;
		a[1][1]=400;
		
		a[2][0]=500;
		a[2][1]=600;
		
		//or we can also write, as below:
		//int a[][]= { {100,200} , {300,400} , {500,600} };
		
		
		// a is represent array variable
		// Finding the length of the array
		// Below 'length' is a variable and not a method
		// method is always ending with a bracket.		
		System.out.println("Number of rows:" + a.length);
		
		// number of columns present inside the mentioned column = a[0].length
		System.out.println("Number of columns:" + a[0].length);
		
		
		//Reading the values of the array
		
		for (int r[]:a) //500,600
		{
			for(int i:r)
			{
				System.out.println(i); //100,200,300,400,500,600
			}
		}

		
	}

}
