public class Truck extends Vehicle {

    // Truck instance data
    private int numWheels;

    // Constructor for truck class that also includes its own instance data
    public Truck(String vin, String make, String model, int numWheels) {
        this.vin = vin;
        this.make = make;
        this.model = model;
        this.numWheels = numWheels;
    }

    // Needs its own instance data methods
    public int getNumWheels() {
        return numWheels;
    }

    public void setNumWheels(int numWheels) {
        this.numWheels = numWheels;
    }

    // Again, overrides the main toString method for objects to whatever we specify
    @Override
    public String toString() {
        return "Truck {" +
                "vin = '" + vin + '\'' +
                ", make = '" + make + '\'' +
                ", model = '" + model + '\'' +
                ", numWheels = '" + numWheels + '\'' +
                '}';
    }
}
