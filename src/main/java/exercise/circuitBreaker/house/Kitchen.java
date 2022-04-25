package exercise.circuitBreaker.house;

public class Kitchen {

    private boolean isDishwasherOn = false;
    private boolean isRefridgeratorOn = false;

    public Kitchen() {
    }

    public boolean isDishwasherOn() {
        return isDishwasherOn;
    }

    public void setDishwasherOn(boolean dishwasherOn) {
        isDishwasherOn = dishwasherOn;
    }

    public boolean isRefridgeratorOn() {
        return isRefridgeratorOn;
    }

    public void setRefridgeraterOn(boolean refridgeraterOn) {
        isRefridgeratorOn = refridgeraterOn;
    }
}
