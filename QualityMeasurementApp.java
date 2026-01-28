/* Quantity Measurement App - UC1: Feet measurement equality
    This  class is responsible for checking the equality of two numerical values measured in feet in the Quantity Measurement Application.
*/

// package 
//main class
public class QualityMeasurementApp {

    // creted inner Feet class to represent Feet measurement
    public static class Feet {

        // used encapsulation to store the measurement value as a private final field
        // and ensured immutability by making the value final
        private final double feetValue;

        public Feet(double feetValue) {
            this.feetValue = feetValue;
        }

    }

    // Main method to demonstrate Feet equality check
    public static void main(String[] args) {
        System.out.println("Quality Measurement App");
    }

}
