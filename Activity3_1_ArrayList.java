package JavaActivity3_Collections;

import java.util.ArrayList;
import java.util.List;

public class Activity3_1_ArrayList {

	public static void main(String[] args) {
		List<String> myList = new ArrayList<>();
		myList.add("Harini5");
		myList.add("Harini1");
		myList.add("Harini2");
		myList.add(2,"Harini3");
		myList.add(1,"Harini4");
		
		int size = myList.size();
		System.out.println("Number of names: "+ size);
		
//		for (int i=0; i<size; i++) {
//			System.out.println(myList.get(i));
//		}
		
		for (String x: myList) {
			System.out.println(x);
		}
		
		System.out.println(myList.get(2));
		
		if (myList.contains("Harini1")==true) {
			System.out.println("My List contains Harini1");
		}
		else {
			System.out.println("My List does not contain Harini1");
		}
		
		myList.remove(4);
		int newSize = myList.size();
		System.out.println("Updated number of names: "+ newSize);
	}

}
