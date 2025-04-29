package lecture_15;
import java.util.*;
public class Array_List_Demo {
	public static void main(String[] args) {
		//Syntax of ArraList.
		ArrayList<Integer> list = new ArrayList<>();
		System.out.println(list);
		
		//Add Elements.
		list.add(10);
		list.add(20);
		list.add(30);
		System.out.println(list);
		
		//list.add(index , number)
		list.add(1,-9);   // phle index and then fir number
		System.out.println(list);
		
		//get element.
		System.out.println(list.get(3)); //index ki range 0 to size - 1
		
		//Remove elements
		System.out.println(list.remove(2)); //index ki range 0 to size -1.
		System.out.println(list);
		
		list.add(23);
		list.add(3);
		list.add(233);
		System.out.println(list);
		
		// update element.
		list.set(4, -11);
		System.out.println(list);
		
		//size
		System.out.println(list.size());
		
		// Sort
		Collections.sort(list);
		System.out.println(list);
		
		//Display
		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i) + " ");
		}
		System.out.println();
		// for string
		ArrayList<String> ll = new ArrayList<>();
		ll.add("Sarik");
		ll.add("Amir");
		ll.add("Nora");
		ll.add("urfi");
		System.out.println(ll);
		
		// Display
		
		for (int i = 0; i < ll.size(); i++) {
			System.out.print(ll.get(i)+ " ");
		}
		System.out.println();
		//For each loop
		for(int val : list) {
			System.out.print(val + " ");
		}
	}
}
