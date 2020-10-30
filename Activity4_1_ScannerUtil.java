package JavaActivity4_UtilityClasses;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Activity4_1_ScannerUtil {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		Random indexGen = new Random();	
		Scanner scan = new Scanner(System.in);
	
		System.out.println("Enter a few numbers");
		System.out.println("(EOF or non-integer to terminate): ");
		
		while (scan.hasNextInt()) {
			list.add(scan.nextInt());
		}
		
		Integer nums[] = list.toArray(new Integer[0]);
		
		int index = indexGen.nextInt(nums.length);
        System.out.println("Index value generated: " + index);
        System.out.println("Value in arary at generated index: " + nums[index]);

        scan.close();
	}

}
