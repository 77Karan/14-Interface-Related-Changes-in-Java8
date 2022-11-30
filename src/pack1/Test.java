package pack1;

public class Test 
{
	public static void main(String[] args) 
	{
		System.out.println("======SANTRO======");
		Vehicle sv = new Santro();
		sv.cleanVehicle();
		Vehicle.fuelCheck();
		sv.startVehicle();
		System.out.println("======SANTRO======");
		
		System.out.println("=======I20========");
		Vehicle iv = new I20();
		iv.cleanVehicle();
		iv.sensor();
		iv.startVehicle();
		Vehicle.fuelCheck();
		System.out.println("=======I20========");
		
		System.out.println("=======CRETA========");
		Vehicle cv = new Creta();
		cv.cleanVehicle();
		cv.startVehicle();
		cv.sensor();
		Vehicle.fuelCheck();
		System.out.println("=======CRETA========");

		


		
	}

}
