public class Sensor {
    private final IRandom r;
    public Sensor(IRandom r} { this.r = r; }

    public double popNextPressurePSIValue() {
        double v;
        v = samplePressure();

        return 16 + v;
    }

    private double samplePressure() {
        double v = 6 * r.nextDouble() * r.nextDouble();
        return v;
    }
}
