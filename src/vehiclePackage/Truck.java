package vehiclePackage;

public class Truck extends Vehicle{
	
	private String model;
	private int wheels;

	
	Truck() {
		
	}
	
	public Truck(int id, String licensePlate, String model, int wheels) {
		super(id,"Truck",licensePlate);
		this.model=model;
		this.wheels = wheels;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getWheels() {
		return wheels;
	}

	public void setWheels(int wheels) {
		this.wheels = wheels;
	}
	
	

}
