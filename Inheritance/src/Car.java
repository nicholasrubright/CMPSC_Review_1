public class Car extends Vehicle {


    // Car constructor using the instance data of vehicle class
    public Car(String vin, String make, String model) {
        this.vin = vin;
        this.make = make;
        this.model = model;
    }


    // Override changes the toString method into whatever we set it up as
    @Override
    public String toString() {
        return "Car {" +
                "vin = '" + vin + '\'' +
                ", make = '" + make + '\'' +
                ", model = '" + model + '\'' +
                '}';
    }

}
