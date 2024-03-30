package Collection.List;

import java.util.ArrayList;
import java.util.Collections;

public class Array_List {

	public static void main(String[] args) {
		
		/** The ArrayList class is a resizable array, which can be found in the java.util package.

		The difference between a built-in array and an ArrayList in Java, is that the size of an 
		array cannot be modified (if you want to add or remove elements to/from an array, you have 
		to create a new one). While elements can be added and removed from an ArrayList whenever you want. 
		The syntax is also slightly different:
		
		The ArrayList class has a regular array inside it. When an element is added, 
		it is placed into the array. If the array is not big enough, a new, larger array 
		is created to replace the old one and the old one is removed.
		*/
		
		ArrayList<Integer> myNumbers = new ArrayList<Integer>();
		
	    myNumbers.add(33);
	    myNumbers.add(15);
	    myNumbers.add(20);
	    myNumbers.add(34);
	    myNumbers.add(8);
	    myNumbers.add(12);

	    Collections.sort(myNumbers);

	    for (int i : myNumbers) {
	      System.out.println(i);
	    }
	}
}
