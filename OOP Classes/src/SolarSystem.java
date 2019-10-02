
import java.util.Arrays;

public class SolarSystem {

    // instance data
    private String[] planets; // Array of strings

    public SolarSystem(String[] planets) {
        this.planets = planets;
    }

    // Deep copy of the solar system
    public SolarSystem(SolarSystem solarSystem) {

        // shallow copy (sharing the memory location)
        // this.planets = solarSystem.planets;

        // deep copy
        this.planets = Arrays.copyOf(solarSystem.planets, solarSystem.planets.length);
    }

    public String[] getPlanets() {
        return planets;
    }

    public void setPlanets(String[] planets) {
        this.planets = planets;
    }

    public void print() {

        // for(int i = 0; i < planets.length; i++){
        //      System.out.println(planets[i]);
        // or

        for(String planet : planets) {
            System.out.println(planet);
        }
    }

}
