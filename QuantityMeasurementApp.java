/* Quantity Measurement App - UC1: Feet measurement equality
    This  class is responsible for checking the equality of two numerical values measured in feet in the Quantity Measurement Application.
*/

// package com.quantitymeasurement.QuantityMeasurementApp;
//main class
public class QuantityMeasurementApp {

    // creted inner Feet class to represent Feet measurement
    /* 💡 Why static? :- So you can create Feet objects without creating QualityMeasurementApp
       Feet obj1 = new Feet(5.5);

       Without static, you’d need:
          QualityMeasurementApp app = new QualityMeasurementApp();
          Feet obj1 = app.new Feet(5.5); */

    public static class Feet {

        // private → Accessible only inside Feet class (encapsulation)
        // final → Value cannot be changed once assigned
        private final double feetValue;

        // constructor
        public Feet(double feetValue) {
            this.feetValue = feetValue;
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj)
                return true;    //If both references point to same object in memory, they are equal
            if (obj == null || getClass() != obj.getClass())
                return false;
            Feet f = (Feet) obj; // casting
            return Double.compare(this.feetValue, f.feetValue) == 0; // here i have compare double values using
                                                                     // Double.compare() instead of == opertor.
        }

    }

    // Main method to demonstrate Feet equality check
    public static void main(String[] args) {
        System.out.println("Quality Measurement App");

        // created 2 Feet objects with test values
        Feet obj1 = new Feet(5.5);
        Feet obj2 = new Feet(5.5);

        // printing the result to verify equality
        System.out.println("Equal: " + obj1.equals(obj2));

    }

}
