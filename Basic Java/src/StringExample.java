public class StringExample {

    public static void main(String[] args) {
        String firstName = "Nick";
        String lastName = "Rubright";

        System.out.println(firstName + " " + lastName); // Outputs Nicholas Rubright

        // Comparing strings
        // Cannot use firstName == lastName (This compares the memory address)
        if(firstName.equals(lastName)) {
            System.out.println("Names are equal");
        } else {
            System.out.println("Name are not equal");
        }
    }
}
