public class Alarm implements IAlarm {
    private final double LowPressureThreshold = 17;
    private final ISensor sensor = new Sensor();
    private final boolean alarmOn = false;
    private final double HighPressureThreshold = 21;

    public void Check() {
        double psiPressureValue = sensor.popNextPressurePSIValue();
        
        alarm = psiPressureValue < LowPressureThreshold 
            || HighPressureThreshold < psiPressureValue;
    }

    public boolean isAlarmon() {
        return alarmOn;
    }
}
