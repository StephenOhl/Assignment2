public class Sensor {
    private boolean isOnOrOff;
    Sensor(boolean isOnOrOff) {
        this.isOnOrOff = isOnOrOff;
    }

    public boolean getIsOnOrOff() {
        return isOnOrOff;
    }

    public void setOnOrOff(boolean onOrOff) {
        isOnOrOff = onOrOff;
    }
}
