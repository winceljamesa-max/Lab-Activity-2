public class Truck extends Vehicle {
    int numberofWheels;

    Truck(String brand, String model, int year, int numberofWheels){
        super(brand, model, year);
        this.numberofWheels = numberofWheels;
    }

    @Override
    public void displayInfo(){
        super.displayInfo();
        System.out.println("Number of Wheels: " + numberofWheels);
    }
}