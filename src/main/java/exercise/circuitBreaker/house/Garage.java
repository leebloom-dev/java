package exercise.circuitBreaker.house;

public class Garage {

    private boolean isGarageDoorActive = false;
    private boolean isHvacActive = false;
    private boolean isWaterHeaterOn = false;

    public Garage() {
    }

    public boolean isGarageDoorActive() {
        return isGarageDoorActive;
    }

    public void setGarageDoorActive(boolean garageDoorActive) {
        isGarageDoorActive = garageDoorActive;
    }

    public boolean isHvacActive() {
        return isHvacActive;
    }

    public void setHvacActive(boolean hvacActive) {
        isHvacActive = hvacActive;
    }

    public boolean isWaterHeaterOn() {
        return isWaterHeaterOn;
    }

    public void setWaterHeaterOn(boolean waterHeaterOn) {
        isWaterHeaterOn = waterHeaterOn;
    }
}
