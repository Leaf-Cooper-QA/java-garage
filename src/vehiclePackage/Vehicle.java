package vehiclePackage;

public class Vehicle {
	
	private int id;
	private String type;
	private String licensePlate;
	
	public Vehicle(){
		
	}
	
	
	public Vehicle(int id, String type, String licensePlate) {
		super();
		this.id = id;
		this.type = type;
		this.licensePlate = licensePlate;
	}
	
	


	@Override
	public String toString() {
		return "Vehicle [id=" + id + ", type=" + type + ", licensePlate=" + licensePlate + "]";
	}


	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getLicensePlate() {
		return licensePlate;
	}
	public void setLicensePlate(String licensePlate) {
		this.licensePlate = licensePlate;
	}
	
	

}
