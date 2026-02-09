public class LengthUnit {

    private final double value;
    private final Length unit;

    public enum Length {
        INCH(1.0), // Base unit
        FEET(12.0); // 1 foot = 12 inches

        private final double inchesConversionFactor;

        Length(double inchesConversionFactor) {
            this.inchesConversionFactor = inchesConversionFactor;
        }

        public double getConverter() {
            return inchesConversionFactor;
        }
    }

    public LengthUnit(double value, Length unit) {
        this.value = value;
        this.unit = unit;
    }

    public double convertToActualUnit() {
        return this.value * this.unit.getConverter();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        LengthUnit unit1 = (LengthUnit) obj;

        return Double.compare(this.convertToActualUnit(), unit1.convertToActualUnit()) == 0;
    }

    public static void main(String[] args) {
        LengthUnit L1 = new LengthUnit(1.0, LengthUnit.Length.FEET);
        LengthUnit L2 = new LengthUnit(12.0, LengthUnit.Length.INCH);
        System.out.println("------" + L1.equals(L2));
    }
}
