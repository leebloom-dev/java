package exercise.circuitBreaker.house;

public class DiningRoom {

    private boolean isLightsOn = false;

    public DiningRoom() {
    }

    public boolean isLightsOn() {
        return isLightsOn;
    }

    public void setLightsOn(boolean lightsOn) {
        isLightsOn = lightsOn;
    }
}
