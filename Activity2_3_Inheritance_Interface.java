package JavaActivity2_3_Inheritance_Interface;

interface BicycleParts {
	public int gears = 0;
	public int currentSpeed = 0;
}

interface BicycleOperations {
	public void applyBrake(int decrement);
	public void speedUp(int increment);
}

//BASE CLASS
class Bicycle implements BicycleParts, BicycleOperations{
	
	public int gears = 0;
	public int currentSpeed = 0;
	
	public Bicycle (int gears,int currentSpeed) {
		this.gears = gears;
		this.currentSpeed = currentSpeed;
	}
	public void applyBrake(int decrement) {
		this.currentSpeed -= decrement;
		System.out.println("Current Speed after applying brake of "+ decrement + " is : "+ currentSpeed);
	}
	public void speedUp(int increment) {
		this.currentSpeed += increment;
		System.out.println("Current Speed after speeding up by "+ increment + " is : "+ currentSpeed);
	}
	public void bicycleDesc() {
		System.out.println("Number of gears: "+ gears);
		System.out.println("Current speed: "+ currentSpeed);
	}
}

//DERIVED CLASS
class MountainBike extends Bicycle{
	public int seatHeight;
	public MountainBike(int seatHeight, int gears,int currentSpeed) {
		super(gears,currentSpeed);
		this.seatHeight = seatHeight;
	}
	public void setHeight(int newValue) {
	    seatHeight = newValue;
	}
	public void bicycleDesc() {
		System.out.println("Number of gears: "+ super.gears);
		System.out.println("Current speed: "+ super.currentSpeed);
		System.out.println("Seat Height: "+ seatHeight);
	}
}

//DRIVER CLASS
public class Activity2_3_Inheritance_Interface {

	public static void main(String[] args) {
		
		MountainBike mb = new MountainBike(10,2,15);
		mb.setHeight(12);
		mb.applyBrake(1);
		mb.speedUp(3);
		mb.bicycleDesc();

	}

}
