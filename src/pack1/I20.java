package pack1;

public class I20 implements Vehicle
{
	public void cleanVehicle()
	{
		System.out.println("I20 vehicle is cleaned");
	}
	
	
	//just overiding the default method
	@Override
	public void sensor() 
	{
		System.out.println("I20 sensor is configured......");
	}
	

}
