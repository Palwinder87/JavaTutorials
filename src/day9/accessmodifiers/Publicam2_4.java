package day9.accessmodifiers;

public class Publicam2_4  {

	public static void main(String[] args) {
		
		/* we have to create the object for Public1_4
		 * and not for Public2_4 and we dont need extends
		 */
		
		Publicam1_4 puam=new Publicam1_4();
		puam.data=30;
		puam.m4();
	

	}

}
