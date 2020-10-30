package JavaActivity1_1;

public class Activity1_1_Car {
	String color;
	String transmission;
	int make;
	int tyres;
	int doors;
	
	public Activity1_1_Car()
	{
		tyres = 4;
		doors = 4;
	}
	
	public void displayCharacteristics()
	{
		System.out.println("Car color : " + color);
		System.out.println("Car transmission : " + transmission);
		System.out.println("Car make : " + make);
		System.out.println("Car tyres : " + tyres);
		System.out.println("Car doors : " + doors);
	}
	public void accelarate()
	{
		System.out.println("Car is moving forward.");
	}
	public void brake()
	{
		System.out.println("Car has stopped.");
	}
}
