package vehiclePackage;

public class Bus extends Vehicle{
	
	private int capacity;
	
	Bus() {
		
	}
	
	public Bus(int id, String licensePlate,int capacity) {
		super(id,"Bus",licensePlate);
		this.capacity=capacity;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	
	

}
