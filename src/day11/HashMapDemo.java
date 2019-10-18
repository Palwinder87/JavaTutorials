package day11;

import java.util.HashMap;
import java.util.Map;
//need to import for HashMap

public class HashMapDemo {

	public static void main(String[] args) {
		
		//Declaration for all data types
		//HashMap hm= new HashMap();
		
		//Declaration for specific data type
		HashMap <Integer,String> hm= new HashMap<Integer,String>();
		
		//Adding pairs into hashmap
		
		//put() method is used
		hm.put(101, "John");
		hm.put(102, "Pulkit");
		hm.put(103, "Shruti");
		hm.put(104, "Anil");
		hm.put(105, "Kriti");
		//In hashmap value are used not index
		System.out.println(hm);		
		
		//Remove pair from Hashmap
		hm.remove(103); //based on key value will be removed
		System.out.println("Renew List: " +hm);	
		
		
		/*
		 * We cannot add anything in middle using put() method
		 * as in array list because we dont have the index concept here.
		 * We can add only at the end.
		 */
		
		
		//Read value via for loop
		
		/*
		to read values we use
		hashmapname.entryset() will reurn a complete pair ie. id and name

		if we want to store id and value i.e pair into a variable we use map.Entry where Entry is type.

		from variable if we want to extacta particular pair we use hashmapname.getkey() and to get name we use hahmpaname.getvalue()

		*/
		
		//hm.entrySet() will read one value at a time and store that in m which is of Entry datatype
		for(Map.Entry m:hm.entrySet())
		{
			System.out.println(m.getKey()+"  "+m.getValue());
		}

	}

}
