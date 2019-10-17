package day4;

public class L11_Strings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="welcome";
		String s1="to java";
		
		
		//length() 
		System.out.println(s.length());
		
		//concat()
		System.out.println(s.concat(s1));
		
		s="     welcome back     "; // re-initialize the value
		System.out.println("Before triming string is:" +s);
		
		//trim()
		System.out.println("After triming string is:" +s.trim());

		//charAt()
		s="welcome";
		System.out.println(s.charAt(4));
		
		//contains()
		s="Welcome";
		System.out.println(s.contains("Wel"));
		System.out.println(s.contains("wel"));		
		System.out.println(s.contains("com"));
	
		//equals() 
		s="welcome";
		System.out.println(s.equals("welcome"));
		System.out.println(s.equals("welc ome"));
		System.out.println(s.equalsIgnoreCase("Welcome"));
		
		/* or
		s1="Welcome";
		s.equals(s1)
		*/
		
		//replace()
		s="Welcome to Java";
		System.out.println(s.replace('o', 'i'));
		
		System.out.println(s.replace("Java","Selenium"));
		
		
		//Sub-Strings
		s="Welcome";
		
		System.out.println(s.substring(0,4));//Welc
		
		//case conversion
		
		s="welcome";
		System.out.println(s.toLowerCase());
		System.out.println(s.toUpperCase());
		
				
	}

}
