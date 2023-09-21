
public class Car {
    private double fuelEfficiency; 
    private double fuelLevel; 
    
    public Car(double fuelEfficiency) {
        this.fuelEfficiency = fuelEfficiency;
        this.fuelLevel = 0;
    }

    public void drive(double distance) {
        if (distance <= 0) {
            System.out.println("Wrong distance. only input a positive value.");
            return;
        }

        double fuelRequired = distance / fuelEfficiency;
        if (fuelRequired <= fuelLevel) {
            fuelLevel -= fuelRequired;
            System.out.println("Car drove " + distance + " miles.");
        } else {
            System.out.println("Not enough fuel to drive to the destination " + distance + " miles.");
        }
    }

    public double getGasInTank() {
        return fuelLevel;
    }

    public void addGas(double gallons) {
        if (gallons <= 0) {
            System.out.println("low amount of gasoline. input a positive value.");
            return;
        }

        fuelLevel += gallons;
        System.out.println(gallons + " gallons of gasoline added to the tank.");
    }

    public static void main(String[] args) {
        Car myHybrid = new Car(50); 
        myHybrid.addGas(15);
        myHybrid.drive(65); 
        double gasLeft = myHybrid.getGasInTank(); 
        System.out.println("Gas remaining in tank: " + gasLeft + " gallons");
    }
}
