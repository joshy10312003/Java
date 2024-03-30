package Collection.List;

import java.util.LinkedList;

public class Linked_List {

	public static void main(String[] args) {
		
		LinkedList<String> cars = new LinkedList<String>();
		
		/**
		The LinkedList class is a collection which can contain many objects of the same type, 
		just like the ArrayList.The LinkedList class has all of the same methods as the ArrayList 
		class because they both implement the List interface. This means that you can add items, 
		change items, remove items and clear the list in the same way. However, while the ArrayList 
		class and the LinkedList class can be used in the same way, they are built very differently.
		
		The LinkedList stores its items in "containers." The list has a link to the first container 
		and each container has a link to the next container in the list. To add an element to the list, 
		the element is placed into a new container and that container is linked to one of the other 
		containers in the list.
		
		*/
		
		//Use an ArrayList for storing and accessing data, and LinkedList to manipulate data.
		
		//addFirst()	Adds an item to the beginning of the list.	
		//addLast()		Add an item to the end of the list	
		//removeFirst()	Remove an item from the beginning of the list.	
		//removeLast()	Remove an item from the end of the list	
		//getFirst()	Get the item at the beginning of the list	
		//getLast()		Get the item at the end of the list
		
		cars.add("Volvo");
	    cars.add("BMW");
	    cars.add("Ford");
	    cars.add("Mazda");
	    System.out.println(cars);
	}
}
