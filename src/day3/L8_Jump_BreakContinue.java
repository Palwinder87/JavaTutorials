package day3;

public class L8_Jump_BreakContinue {
	
	public static void main(String[] args) {
		
		/*
		for(int i=1;i<=10;i++)
		 {
			if(i==5)
			{
				break;
			}
			
			System.out.println(i);
		 }*/
		
		for(int i=1;i<=10;i++)
		 {
			
			// if(i==5)			
			if(i==1 || i==3 || i==5 || i==7 || i==9)	//print even numbers
			{
				//System.out.println("ABC");
				continue;				
			}
			
			System.out.println(i);
		 }
			
	 }
		

}
