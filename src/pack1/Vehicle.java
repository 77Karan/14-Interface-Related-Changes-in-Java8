package pack1;

public interface Vehicle 
{
	void cleanVehicle();
	
	default void startVehicle()
	{
		System.out.println("Vehicle is getting startred");
	}
	
	default void sensor()
	{
		System.out.println("sensor ready for My vehicle");
	}
	
	static void fuelCheck()
	{
		System.out.println("Fuel check completed");
	}

}
