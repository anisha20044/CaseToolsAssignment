package program;

class Vehicle_110 {
    int horsepower;

    public Vehicle_110(int horsepower) {
        this.horsepower = horsepower;
    }

    public void drive() {
        System.out.println("Vehicle is being driven.");
    }
}

class Car extends Vehicle_110 {
    String make;
    int carHorsepower;
    
    public Car(int horsepower, String make) {
        super(horsepower); 
        this.make = make;
        this.carHorsepower = 80; 
    }

    @Override
    public void drive() {
        super.drive(); 
        System.out.println("Car is being driven.");
    }
}

