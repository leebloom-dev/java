package exercise.oop;

public class Fruit {

    /* FIELDS */
    private String type;
    private String color;
    private int weight;

    /* CONSTRUCTORS */
    public Fruit() {
    }

    public Fruit(String type, String color, int weight) {
        this.type = type;
        this.color = color;
        this.weight = weight;
    }

    /* METHODS: GETTERS AND SETTERS */

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    /* METHODS */
    public void display() {
        System.out.println("Fruit: " + getType());
        System.out.println("Color: " + getColor());
        System.out.println("Weight: " + getWeight() + "\n");
    }
}
