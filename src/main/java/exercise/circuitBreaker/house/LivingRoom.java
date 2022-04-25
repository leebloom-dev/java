package exercise.circuitBreaker.house;

public class LivingRoom {

    private boolean isLightsOn = false;

    public LivingRoom() {
    }

    public boolean isLightsOn() {
        return isLightsOn;
    }

    public void setLightsOn(boolean lightsOn) {
        isLightsOn = lightsOn;
    }
}
