public class Motorcycle extends Vehicle {
    String engineType;

    public Motorcycle(String brand, String model, int year, String engineType){
        super(brand,model,year);
        this.engineType = engineType;
    }

    @Override
    public void displayInfo(){
        super.displayInfo();
        System.out.println("Engine Type: " + engineType );
    }
}