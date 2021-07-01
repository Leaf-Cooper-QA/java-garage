package vehiclePackage;

import java.util.ArrayList;
//import java.util.Arrays;
import java.util.List;

public class Garage {
	
	private List<Vehicle> inventory;
	
	Garage() {
		this.inventory = new ArrayList<>();
	}
	
	Garage(List<Vehicle> inventory) {
		this.inventory=inventory;
	}

	public List<Vehicle> getInventory() {
		return inventory;
	}

	public void setInventory(List<Vehicle> inventory) {
		this.inventory = inventory;
	}
	
	
	
	
	
	public void calculateBills() {
		for(Vehicle vehicle : inventory) {
			calculateBill(vehicle);

		}
	}

	private void calculateBill(Vehicle vehicle) {
		switch(vehicle.getType()) {
		case "Car":

			Car car = (Car) vehicle;
			if(car.getElectric()) {
				System.out.println("Bill for car with registration " + car.getLicensePlate() + " is £100");
			} else {
				System.out.println("Bill for car with registration " + car.getLicensePlate() + " is £120");
			}
			break;
		case "Bus":
			Bus bus = (Bus) vehicle;
			System.out.println("Bill for bus with registration " + bus.getLicensePlate() + " is £" + (bus.getCapacity()*15));
			break;
		case "Truck":
			Truck truck = (Truck) vehicle;
			System.out.println("Bill for truck with registration " + truck.getLicensePlate() + " is £" + (500+(10*truck.getWheels())));
			break;
		default:
			System.out.println("Invalid vehicle type, could not calculate bill");
		
		
		}
		
	}
	
	public void addVehicle(Vehicle vehicle) {
		inventory.add(vehicle);
	}
	
	public void removeVehicle(int id) {
		for (Vehicle vehicle : inventory) {
			if (vehicle.getId()==id) {
				inventory.remove(vehicle);
				break;
			}
		}
	}
	
	public void removeVehicle(String licensePlate) {
		for (Vehicle vehicle : inventory) {
			if (vehicle.getLicensePlate()==licensePlate) {
				inventory.remove(vehicle);
				break;
			}
		}
	}
	
	
	
	public void fixVehicle(Vehicle vehicle) {
		if (inventory.contains(vehicle)) {
			calculateBill(vehicle);
		} else {
			System.out.println("Vehicle not in inventory");
		}
	}
	
	public void emptyGarage() {
		inventory.clear();
	}
	
	
	public void removeType(String type) {
		for (int i = 0; i< inventory.size() ; i++) {
			//can't use enhanced for loop here because you're deleting items from the list you're iterating over
			Vehicle vehicle = inventory.get(0);
			if (vehicle.getType() == type) {
				inventory.remove(vehicle);
			}
		}
	}

}
