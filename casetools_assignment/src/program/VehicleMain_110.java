package program;

public class VehicleMain_110 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car myCar = new Car(50, "Toyota");

        myCar.drive();

        System.out.println("Vehicle Horsepower: " + myCar.horsepower);
       
        System.out.println("Car Horsepower: " + myCar.carHorsepower);

        System.out.println("Car Make: " + myCar.make);

	}

}
