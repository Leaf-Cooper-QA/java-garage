package vehiclePackage;

public class Car extends Vehicle{
	
	private String model;
	private Boolean electric;
	
	Car(){	
	}

	public Car(int id, String licensePlate,String model, Boolean electric) {
		super(id,"Car",licensePlate);
		this.model=model;
		this.electric=electric;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}
	
	public Boolean getElectric() {
		return electric;
	}
	
	public void setElectric(Boolean electric) {
		this.electric = electric;
	}
	
	
	
	
	
}
