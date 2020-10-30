package JavaActivity3_Collections;

import java.util.HashSet;

public class Activity3_2_HashSet {
	public static void main (String args[]) {
		HashSet<String> hs = new HashSet<>();
		hs.add("Harini1");
		hs.add("Harini2");
		hs.add("Harini3");
		hs.add("Harini4");
		hs.add("Harini5");
		hs.add("Harini6");
		
		System.out.println("Size of my hash set is "+ hs.size());
		
		hs.remove("Harini5");
		
		hs.remove("sample");
		
		System.out.println("Does my set contain Harini1? "+ hs.contains("Harini1"));
		
		System.out.println("My hastSet: ");
		for (String x : hs) {
			System.out.println(x);
		}
	}
}
