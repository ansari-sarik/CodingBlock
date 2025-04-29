package lecture_15;

import java.util.ArrayList;

public class Array_List_Demo_02 {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>(7);
		
		//Add Elements.
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(101);
		list.add(201);
		list.add(301);
		list.add(102);
		list.add(203);
		list.add(305);
		System.out.println(list);
	}
}
