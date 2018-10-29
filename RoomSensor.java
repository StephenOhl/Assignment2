public class RoomSensor extends Sensor {
    private boolean lightSwitch;
    private double roomTemperature;
    private int airconSetting;
    private int movement;

    public RoomSensor(boolean isOnOrOff, boolean lightSwitch, int movement,
                      int airconSetting, double roomTemperature) {
        super(isOnOrOff);
        this.lightSwitch = lightSwitch;
        this.movement = movement;
        this.airconSetting = airconSetting;
        this.roomTemperature = roomTemperature;
    }

    public void setLightSwitch(boolean lightSwitch) {
        this.lightSwitch = lightSwitch;
    }

    public void setAirconSetting(int airconSetting) {
        this.airconSetting = airconSetting;
    }

    public void setRoomTemperature(double roomTemperature) {
        this.roomTemperature = roomTemperature;
    }

    public void setMovement(int movement) {
        this.movement = movement;
    }

    public void mevementDetection(int detectMovement) {
        movement = detectMovement;
        if (movement == 1 && lightSwitch == false) {
            turnLightOn();
        } else if (movement == 0 && lightSwitch == true) {
            turnLightOff();
        }
    }

    public void turnLightOn() {
        lightSwitch = true;
    }

    public void turnLightOff() {
        lightSwitch = false;
    }

    public boolean getLightStatus() {
        return this.lightSwitch;
    }
    public int getAirConSetting(){return this.airconSetting;}
    public int getMovement() {return this.movement;}
    public double getRoomTemperature(){return this.roomTemperature;}
}
