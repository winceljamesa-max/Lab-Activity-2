public class Main {

    public static void printDetails(Vehicle vehicle){
    vehicle.displayInfo();
    }


	public static void main(String[] args) {
	System.out.println("=== 1. Parent Reference ===");

    Vehicle vehicle = new Car("Honda", "Civic", 2020, 4);
    vehicle.displayInfo();

    vehicle = new Motorcycle("Yamaha", "NMAX", 2024,"4-stroke, single-cylinder, liquid-cooled engine");
    vehicle.displayInfo();

    Truck truck = new Truck("Toyota", "HiAce", 2023, 4);
    truck.displayInfo();


    System.out.println("\n=== 2. Method Parameter ===");

    Car car = new Car("Mitsubishi", "Mirage", 2021, 4);

    Motorcycle motorcycle = new Motorcycle("Honda", "TMX 125", 2022,"4-stroke, single-cylinder, air-cooled engine");
    Truck trucks = new Truck("Ford", "Ranger", 2022, 4);

    printDetails(car);
    printDetails(motorcycle);
    printDetails(trucks);


    System.out.println("\n=== 3. Polymorphic Array ===");

    Vehicle[] vehicles = {
        new Car("Suzuki", "Swift", 2023, 4),
        new Motorcycle("Kawasaki", "Ninja 400", 2022, "4-stroke, parallel-twin, liquid-cooled engine"),
        new Truck("Nissan", "Navara", 2021, 4)
    };
    
        for(Vehicle currentVehicle: vehicles){
         printDetails(currentVehicle);
        }
        System.out.println();
    }
}    

	    