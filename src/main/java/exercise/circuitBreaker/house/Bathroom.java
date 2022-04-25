package exercise.circuitBreaker.house;

import exercise.circuitBreaker.CircuitBreaker;

public class Bathroom extends CircuitBreaker {

    private String isLightsOn = "false";
    private String isFanOn = "false";

    public Bathroom() {
    }

    public String getIsLightsOn() {
        return isLightsOn;
    }

    public void setIsLightsOn(String isLightsOn) {
        this.isLightsOn = isLightsOn;
    }

    public String getIsFanOn() {
        return isFanOn;
    }

    public void setIsFanOn(String isFanOn) {
        this.isFanOn = isFanOn;
    }

}
