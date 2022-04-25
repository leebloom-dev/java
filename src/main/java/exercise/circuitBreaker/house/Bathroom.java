package exercise.circuitBreaker.house;

public class Bathroom {

    private boolean isLightsOn = false;
    private boolean isFanOn = false;

    public Bathroom() {
    }

    public boolean isLightsOn() {
        return isLightsOn;
    }

    public void setLightsOn(boolean lightsOn) {
        isLightsOn = lightsOn;
    }

    public boolean isFanOn() {
        return isFanOn;
    }

    public void setFanOn(boolean fanOn) {
        isFanOn = fanOn;
    }

    public void display() {
        
    }
}
