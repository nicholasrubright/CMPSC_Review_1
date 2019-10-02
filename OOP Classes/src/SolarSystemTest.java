public class SolarSystemTest {

    public static void main(String[] args) {

        // Create objects
        Planet mercury = new Planet("mercury");
        Planet venus = new Planet("venus");
        Planet saturn = new Planet("saturn");
        Planet earth = new Planet("earth");

        // build solar system
        String[] planets= new String[]{mercury.getName(), venus.getName(), saturn.getName(), earth.getName()};
        SolarSystem solarSystem = new SolarSystem(planets);

        // Print out the solar system
        solarSystem.print();

        // Copy of the solar system
        SolarSystem ssCopy = new SolarSystem(solarSystem);
        ssCopy.print();

    }
}
