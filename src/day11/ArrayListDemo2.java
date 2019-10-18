package day11;

import java.util.ArrayList; //Import this predefined package

public class ArrayListDemo2 {

	public static void main(String[] args) {
		
		//DECLARE ARRAY LIST
		
		//store any type of element
		ArrayList list=new ArrayList();
		
		//ADDING DIFFERENT DATA TYPE VALUES TO ARRAY LIST
		list.add("John"); //index value is 0
		//list is object we created above, add() is predefined method
		list.add("David"); //index value is 1
		list.add("Tom"); //index value is 2
		list.add("Harris"); //index value is 3
		list.add(123);
		list.add('A');

		
		//SIZE OF ARRAY LIST
		list.size();
		//list is object we created above and size() is predefined function
		System.out.println(list.size());
		System.out.println("List before removing element:" +list);
		
		//REMOVE AN ELEMENT
		list.remove(2); //2 is based on the index number of array list
		System.out.println(list.size());
		System.out.println("List after removing element:" +list);
		
		
		//ADDING AN ELEMENT
		list.add(2,"Max"); //index nr, value 
		System.out.println(list.size());
		System.out.println("New list:" +list);
		
		 
		//READ VALUE USING ENHANCED FOR LOOP 
		// we remove the String before s and replace it with Object
		//In Java, Object type can store any time of elements
		for(Object s:list) { 
			System.out.println(s);
		}
		
	}

}