package JavaActivity1_4_InsertionSort;

import java.util.Arrays;

//Insertion Sort algorithm
//Insertion sort works in the similar way as we sort cards in our hand in a card game.
//We assume that the first card is already sorted then, we select an unsorted card.
//If the unsorted card is greater than the card in hand, it is placed on the right otherwise, to the left.
//In the same way, other unsorted cards are taken and put at their right place.
public class Activity1_4 {

	@SuppressWarnings("null")
	public static void main(String[] args) {
		int[] beforeSort = {5,1,9,4,2};
		
		int size = beforeSort.length;
		int[] afterSort = new int[size];
		
		afterSort[0] = beforeSort[0];
		
		for (int i=1; i<size; i++) {
			afterSort[i] = beforeSort[i];
			
			for (int j=0; j<i; j++) {
				if (afterSort[i]<afterSort[j]) {
					int temp=afterSort[j];
					afterSort[j] = afterSort[i];
					afterSort[i] = temp;
				}
			}
		}
		System.out.println("Before sort ");
		for (int i=0; i<size; i++) {
			System.out.print(beforeSort[i]+ " ");
		}
		System.out.println();
		System.out.println("After sort " + Arrays.toString(afterSort));
	}

}
