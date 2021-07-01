package vehiclePackage;

public class Runner {
	public static void main(String[] args) {
		
		Vehicle car1 = new Car(0,"AB12XYZ","Ford",false);
		Vehicle bus1 = new Bus(1,"XY98ABC",80);
		Vehicle truck1 = new Truck(2,"MN45QWE","Renault",18);
		Vehicle car2 = new Car(3,"QW00RTY","Toyota",true);
		Vehicle truck2 = new Truck(4,"ZX10CVB","Mitsubishi",6);
		Garage garage = new Garage();
		
		garage.addVehicle(car1);
		garage.addVehicle(bus1);
		garage.addVehicle(truck1);
		garage.addVehicle(car2);
		garage.addVehicle(truck2);
		
		System.out.println(garage.getInventory());
		
		garage.calculateBills();
		
		garage.removeVehicle(1);
		
		garage.removeVehicle("MN45QWE");
		
		System.out.println(garage.getInventory());
		
		garage.fixVehicle(car2);
		
		garage.removeType("Car");
		
		System.out.println(garage.getInventory());
		
		garage.emptyGarage();
		
		System.out.println(garage.getInventory());
		
		
	}

}
