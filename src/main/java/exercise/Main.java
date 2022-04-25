package exercise;

import exercise.oop.Fruit;

public class Main {

    public static void main(String[] args) {

        Fruit apple = new Fruit("Apple", "Red", 5);
        Fruit banana = new Fruit("Banana", "Yellow", 4);
        Fruit pear = new Fruit();

        pear.setType("Pear");
        pear.setColor("Green");
        pear.setWeight(6);

        apple.display();
        banana.display();
        pear.display();

    }

}
