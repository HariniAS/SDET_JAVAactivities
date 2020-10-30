package JavaActivity1_1;

public class Activity1_1 {

	public static void main(String[] args) {
		Activity1_1_Car carObj = new Activity1_1_Car();
		carObj.color = "Black";
		carObj.transmission = "Manual";
		carObj.make = 2014;
		carObj.displayCharacteristics();
		carObj.accelarate();
		carObj.brake();
	}
}