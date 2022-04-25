package exercise.circuitBreaker.house;

public class MasterBedroom {

    private boolean isFanOn = false;
    private int fanSpeed = 0; // off
    private boolean isLightsOn = false;

    public MasterBedroom() {
    }

    public boolean isFanOn() {
        return isFanOn;
    }

    public void setFanOn(boolean fanOn) {
        isFanOn = fanOn;
    }

    public int getFanSpeed() {
        return fanSpeed;
    }

    public void setFanSpeed(int fanSpeed) {
        this.fanSpeed = fanSpeed;
    }

    public boolean isLightsOn() {
        return isLightsOn;
    }

    public void setLightsOn(boolean lightsOn) {
        isLightsOn = lightsOn;
    }
}
