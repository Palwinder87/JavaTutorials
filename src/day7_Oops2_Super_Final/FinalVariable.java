package day7_Oops2_Super_Final;

public class FinalVariable {
	
	int speed=40;
	final int speed2=60;
	
	public static void main(String[] args) {
		
		FinalVariable fm=new FinalVariable();
		fm.speed=80;
		System.out.println(fm.speed);
		System.out.println(fm.speed2);
		
	}

}
