package exercise.circuitBreaker.house;

public class Bedroom1 {

    private boolean isLightsOn = false;

    public Bedroom1() {
    }

    public boolean isLightsOn() {
        return isLightsOn;
    }

    public void setLightsOn(boolean lightsOn) {
        isLightsOn = lightsOn;
    }
}
