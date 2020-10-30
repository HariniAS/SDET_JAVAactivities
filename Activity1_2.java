package JavaActivity1_2;

//check if the sum of all the 10's in the array is exactly 30
public class Activity1_2 {

	public static void main(String[] args) {
		int[] arr = {10, 77, 10, 54, -11, 10};
		boolean result = checkSum(arr);
		System.out.println("result is : " + result);
	}
	
	public static boolean checkSum (int[] arr)
	{
		int sum = 0;
		for (int i=0; i<arr.length; i++)
		{
			if (arr[i] == 10)
			{
				sum += arr[i];
			}
		}
		if (sum == 30)
			return true;
		else 
			return false;
	}

}
